AUI.add(
	'liferay-scheduler-override',
	function (A) {
		var AArray = A.Array;
		var AObject = A.Object;
		var DateMath = A.DataType.DateMath;
		var Lang = A.Lang;
		var LString = Lang.String;

		var CalendarWorkflow = Liferay.CalendarWorkflow;
		var RecurrenceUtil = Liferay.RecurrenceUtil;

		var isBoolean = Lang.isBoolean;
		var isFunction = Lang.isFunction;
		var isObject = Lang.isObject;
		var isValue = Lang.isValue;

		var toInitialCap = A.cached(
			function (str) {
				return str.substring(0, 1).toUpperCase() + str.substring(1);
			}
		);

		var toInt = function (value) {
			return Lang.toInt(value, 10, 0);
		};

		var CONTROLS_NODE = 'controlsNode';

		var DAYS_OF_WEEK = ['SU', 'MO', 'TU', 'WE', 'TH', 'FR', 'SA'];

		var ICON_ADD_EVENT_NODE = 'iconAddEventNode';

		var STR_BLANK = '';

		var STR_COMMA_SPACE = ', ';

		var TPL_ICON_ADD_EVENT_NODE = '<div class="btn-group">' +
			'<button class="btn btn-primary calendar-add-event-btn" type="button">' +
			// Liferay.Language.get('add-calendar-booking') +
			// CMAP: placeholder value is being returned for add-calendar-booking
			'Add Event' +
			'</button>' +
			'</div>';

		var WEEKLY = 'WEEKLY';

		var Time = Liferay.Time;

		A.mix(
			A.DataType.DateMath,
			{
				getWeeksInMonth: function (date) {
					var daysInMonth = DateMath.getDaysInMonth(date.getFullYear(), date.getMonth());
					var firstWeekDay = DateMath.getDate(date.getFullYear(), date.getMonth(), 1).getDay();

					var daysInFirstWeek = DateMath.WEEK_LENGTH - firstWeekDay;

					return Math.ceil((daysInMonth - daysInFirstWeek) / DateMath.WEEK_LENGTH) + 1;
				}
			}
		);

		var CalendarUtil = Liferay.CalendarUtil;

		var Scheduler = A.Component.create(
			{
				ATTRS: {
					
					calendarContainer: {
						validator: isObject,
						value: null
					},
					
					currentTimeFn: {
						value: A.bind(CalendarUtil.getCurrentTime, CalendarUtil)
					},
					
					eventsPerPage: {},

					filterCalendarBookings: {
						validator: isFunction
					},

					iconAddEventNode: {
						valueFn: function () {
							return A.Node.create(TPL_ICON_ADD_EVENT_NODE);
						}
					},

					// CMAP: override A.SchedulerBase.iconNextNode
					// https://alloyui.com/api/files/alloy-ui_src_aui-scheduler_js_aui-scheduler-base.js.html#l752
					iconNextNode: {
						valueFn: function () {
							var instance = this;

							var TPL_SCHEDULER_ICON_NEXT = '<button aria-label="{ariaLabel}" role="button" type="button" class="scheduler-base-icon-next btn btn-default">'
								+ '<span class="sr-only">Next</span>'
								+ '<span class="sr-hidden icon-cmap icon-nav-right-white"></span>'
								+ '</button>';

							return A.Node.create(
								A.Lang.sub(TPL_SCHEDULER_ICON_NEXT, {
									ariaLabel: instance.getAriaLabel('next')
								})
							);
						}
					},

					// CMAP: override A.SchedulerBase.iconPrevNode
					// https://alloyui.com/api/files/alloy-ui_src_aui-scheduler_js_aui-scheduler-base.js.html#770
					iconPrevNode: {
						valueFn: function () {
							var instance = this;

							var TPL_SCHEDULER_ICON_PREV = '<button aria-label="{ariaLabel}" role="button" type="button" class="scheduler-base-icon-prev btn btn-default">'
								+ '<span class="sr-only">Previous</span>'
								+ '<span class="sr-hidden icon-cmap icon-nav-left-white"></span>'
								+ '</button>';

							return A.Node.create(
								A.Lang.sub(TPL_SCHEDULER_ICON_PREV, {
									ariaLabel: instance.getAriaLabel('previous')
								})
							);
						}
					},
					
					maxDaysDisplayed: {},

					portletNamespace: {
						setter: String,
						validator: isValue,
						value: STR_BLANK
					},

					preventPersistence: {
						validator: isBoolean,
						value: false
					},

					remoteServices: {
						validator: isObject,
						value: null
					},
					
					showAddEventBtn: {
						validator: isBoolean,
						value: true
					}
				},

				AUGMENTS: [Liferay.RecurrenceConverter],

				EXTENDS: A.Scheduler,

				NAME: 'scheduler-base',

				prototype: {
					calendarModel: Liferay.SchedulerCalendar,
					eventModel: Liferay.SchedulerEvent,
					eventsModel: Liferay.SchedulerEvents,
					queue: null,

					renderUI: function () {
						var instance = this;

						Scheduler.superclass.renderUI.apply(this, arguments);

						instance.navDateNode.replaceClass('hidden-xs', 'hidden');
						instance.viewDateNode.removeClass('visible-xs');

						var showAddEventBtn = instance.get('showAddEventBtn');

						if (showAddEventBtn) {
							instance[ICON_ADD_EVENT_NODE] = instance.get(ICON_ADD_EVENT_NODE);

							instance[CONTROLS_NODE].prepend(instance[ICON_ADD_EVENT_NODE]);

							instance[ICON_ADD_EVENT_NODE].on('click', instance._onClickAddEvent, instance);
						}
					},

					bindUI: function () {
						var instance = this;

						instance.after(
							{
								'scheduler-base:dateChange': instance._afterDateChange,
								'scheduler-event:change': instance._afterSchedulerEventChange
							}
						);

						instance.on(
							{
								'*:load': instance._onLoadSchedulerEvents,
								'scheduler-event-recorder:delete': instance._onDeleteEvent,
								'scheduler-event-recorder:save': instance._onSaveEvent
							}
						);

						Scheduler.superclass.bindUI.apply(this, arguments);
					},

					getEventsByCalendarBookingId: function (calendarBookingId) {
						var instance = this;

						return instance.getEvents(
							function (schedulerEvent) {
								return schedulerEvent.get('calendarBookingId') === calendarBookingId;
							}
						);
					},

					load: function () {
						var instance = this;

						var events = instance._events;

						// CMAP: update header layout when calendar loads
						instance._updateLayout();

						return events.load.apply(events, arguments);
					},

					plotCalendarBookings: function (calendarBookings) {
						var instance = this;

						var calendarEvents = {};
						var events = [];

						calendarBookings.forEach(
							function (item, index) {
								var calendarId = item.calendarId;

								if (!calendarEvents[calendarId]) {
									calendarEvents[calendarId] = [];
								}

								var schedulerEvent = CalendarUtil.createSchedulerEvent(item);

								schedulerEvent.set(
									'scheduler',
									instance,
									{
										silent: true
									}
								);

								events.push(schedulerEvent);
								calendarEvents[calendarId].push(schedulerEvent);
							}
						);

						instance.resetEvents(events);

						var calendarContainer = instance.get('calendarContainer');
						
						A.each(
							calendarContainer.get('availableCalendars'),
							(item, index) => {
								item.reset(calendarEvents[index], {
									skipSyncUI: true
								});
							}
						);

						if (instance.get('rendered')) {
							instance.syncEventsUI();
						}

						//Liferay.CalendarMessageUtil.showAlert(instance, STR_BLANK);
					},

					sync: function () {
						var instance = this;

						var events = instance._events;

						return events.sync.apply(events, arguments);
					},

					_afterActiveViewChange: function (event) {
						var instance = this;

						Scheduler.superclass._afterActiveViewChange.apply(this, arguments);

						Liferay.Store('com.liferay.calendar.web_defaultView', event.newVal.get('name'));

						instance.load();
					},

					_afterDateChange: function (event) {
						var instance = this;

						instance.load();
					},

					_afterSchedulerEventChange: function (event) {
						var instance = this;

						if (!instance.get('preventPersistence')) {
							var changedAttributes = event.changed;

							var persistentAttrMap = {
								calendarId: 1,
								color: 1,
								content: 1,
								endDate: 1,
								endTime: 1,
								startDate: 1,
								startTime: 1
							};

							var persist = true;

							A.each(
								changedAttributes,
								function (item, index) {
									persist = persistentAttrMap.hasOwnProperty(index);
								}
							);

							if (persist) {
								var schedulerEvent = event.target;

								instance._updateSchedulerEvent(schedulerEvent, changedAttributes);
							}
						}
					},

					_createViewTriggerNode: function (view, tpl) {
						var instance = this;

						var node = Scheduler.superclass._createViewTriggerNode.apply(this, arguments);

						var schedulerViewText = '';

						var viewName = view.get('name');

						if (viewName == 'agenda') {
							schedulerViewText = Liferay.Language.get('agenda-view');
						}
						else if (viewName == 'day') {
							schedulerViewText = Liferay.Language.get('day-view');
						}
						else if (viewName == 'month') {
							schedulerViewText = Liferay.Language.get('month-view');
						}
						else if (viewName == 'week') {
							schedulerViewText = Liferay.Language.get('week-view');
						}

						if (node.get('nodeName') === 'OPTION') {
							node.text(schedulerViewText);
						}

						return node;
					},

					_getCalendarBookingDuration: function (schedulerEvent) {
						var instance = this;

						var duration = schedulerEvent.getSecondsDuration() * Time.SECOND;

						return duration;
					},

					_getCalendarBookingOffset: function (schedulerEvent, changedAttributes) {
						var instance = this;

						var offset = 0;

						if (changedAttributes.startDate) {
							offset = changedAttributes.startDate.newVal.getTime() - changedAttributes.startDate.prevVal.getTime();
						}

						return offset;
					},

					_getNewRecurrence: function (schedulerEvent, changedAttributes) {
						var instance = this;

						var recurrence = instance.parseRecurrence(schedulerEvent.get('recurrence'));

						if (recurrence && changedAttributes.startDate && changedAttributes.endDate) {
							var rrule = recurrence.rrule;

							var newDate = changedAttributes.startDate.newVal;

							var prevDate = changedAttributes.startDate.prevVal;

							if (DateMath.isDayOverlap(prevDate, newDate)) {
								if (rrule.freq === WEEKLY) {
									var index = rrule.byday.indexOf(DAYS_OF_WEEK[prevDate.getDay()]);

									AArray.remove(rrule.byday, index);

									rrule.byday.push(DAYS_OF_WEEK[newDate.getDay()]);
								}
								else if (rrule.byday) {
									var position = Math.ceil(newDate.getDate() / DateMath.WEEK_LENGTH);

									var futureDate = DateMath.add(newDate, DateMath.WEEK, 1);

									var lastDayOfWeek = futureDate.getMonth() !== newDate.getMonth();

									if ((position > 4) || (lastDayOfWeek && (rrule.byday.position === -1))) {
										position = -1;
									}

									rrule.byday.position = position;
									rrule.byday.dayOfWeek = DAYS_OF_WEEK[newDate.getDay()];

									if (rrule.bymonth) {
										rrule.bymonth = newDate.getMonth() + 1;
									}
								}
							}
						}

						return recurrence;
					},

					_onClickAddEvent: function (event) {
						var instance = this;

						var recorder = instance.get('eventRecorder');

						var activeViewName = instance.get('activeView').get('name');
						
						var calendarContainer = instance.get('calendarContainer');
						
						var availableCalendars = calendarContainer.get('availableCalendars');
						
						console.log("availableCalendars");
						console.log(availableCalendars);

						var defaultCalendar = calendarContainer.get('defaultCalendar');
						
						console.log("defaultCalendar");
						console.log(defaultCalendar);
						
//						var defaultUserCalendar = CalendarUtil.getDefaultUserCalendar();

						var calendarId = defaultCalendar.get('calendarId');

						console.log("calendarId");
						console.log(calendarId);
						
						var editCalendarBookingURL = decodeURIComponent(recorder.get('editCalendarBookingURL'));

						var startTimeDate = instance.get('date');

						var data = {
							activeView: activeViewName,
							calendarId: calendarId,
							startTimeDay: startTimeDate.getDate(),
							startTimeMonth: startTimeDate.getMonth(),
							startTimeYear: startTimeDate.getFullYear(),
							titleCurrentValue: ''
						};

						Liferay.Util.openWindow(
							{
								dialog: {
									after: {
										destroy: function (event) {
											instance.load();
										}
									},
									destroyOnHide: true,
									modal: true
								},
								title: Liferay.Language.get('new-calendar-booking'),
								uri: CalendarUtil.fillURLParameters(editCalendarBookingURL, data)
							}
						);
					},

					_onDeleteEvent: function (event) {
						var instance = this;

						var schedulerEvent = event.schedulerEvent;
						
						var remoteServices = instance.get('remoteServices');

						var success = function () {
							instance.load();
							instance.get('eventRecorder').hidePopover();
						};

						if (schedulerEvent.isRecurring()) {
							RecurrenceUtil.openConfirmationPanel(
								'delete',
								() => {
									remoteServices.deleteEventInstance(
										schedulerEvent,
										false,
										success
									);
								},
								() => {
									remoteServices.deleteEventInstance(
										schedulerEvent,
										true,
										success
									);
								},
								() => {
									remoteServices.deleteEvent(
										schedulerEvent,
										success
									);
								}
							);
						} else if (schedulerEvent.isMasterBooking()) {
							var confirmationMessage;

							if (schedulerEvent.get('hasChildCalendarBookings')) {
								confirmationMessage = Liferay.Language.get(
									'deleting-this-event-will-cancel-the-meeting-with-your-guests-would-you-like-to-delete'
								);
							} else {
								confirmationMessage = Liferay.Language.get(
									'would-you-like-to-delete-this-event'
								);
							}

							if (confirm(confirmationMessage)) {
								remoteServices.deleteEvent(schedulerEvent, success);
							}
						}

						event.preventDefault();
					},

					_onLoadSchedulerEvents: function (event) {
						var instance = this;

						instance.plotCalendarBookings(event.parsed);
					},

					_onSaveEvent: function (event) {
						var instance = this;

						CalendarUtil.updateEvent(
							event.newSchedulerEvent,
							false,
							false,
							function () {
								instance.load();
								instance.get('eventRecorder').hidePopover();
							}
						);
					},

					_queueableQuestionResolver: function (data) {
						var instance = this;

						var answers = data.answers;
						var newRecurrence = data.newRecurrence;
						var schedulerEvent = data.schedulerEvent;

						var showNextQuestion = A.bind(instance.load, instance);

						if (newRecurrence && (!answers.updateInstance || answers.allFollowing)) {
							schedulerEvent.set('recurrence', instance.encodeRecurrence(newRecurrence));
						}

						if (answers.cancel) {
							A.soon(showNextQuestion);
						}
						else {
							CalendarUtil.updateEvent(schedulerEvent, !!answers.updateInstance, !!answers.allFollowing, showNextQuestion);
						}
					},

					_updateSchedulerEvent: function (schedulerEvent, changedAttributes) {
						var instance = this;

//						var calendar = Liferay.CalendarUtil.availableCalendars[schedulerEvent.get('calendarId')];

						Liferay.CalendarMessageUtil.promptSchedulerEventUpdate(
							{
								calendarName: "CMAP",
								duration: instance._getCalendarBookingDuration(schedulerEvent),
								hasChild: schedulerEvent.get('hasChildCalendarBookings'),
								masterBooking: schedulerEvent.isMasterBooking(),
								newRecurrence: instance._getNewRecurrence(schedulerEvent, changedAttributes),
								offset: instance._getCalendarBookingOffset(schedulerEvent, changedAttributes),
								recurring: schedulerEvent.isRecurring(),
								resolver: A.bind(instance._queueableQuestionResolver, instance),
								schedulerEvent: schedulerEvent
							}
						);
					},

					// CMAP: custom function to update calendar layout
					_updateLayout: function () {

						// hide popover
						var instance = this;
						if (instance.get('eventRecorder')) {
							instance.get('eventRecorder').hidePopover();
						}

						// remove 12-column grid classes
						$('.calendar-portlet-column-grid').removeClass('col-md-12');
						$('.scheduler-base-controls').removeClass('col-xs-7');

						// build header with navigation
						if ($('.calendar-month-view-label').length) {
							$('.calendar-month-view-label').text($('.scheduler-base-view-date').text());
						} else {
							$('.scheduler-base-controls')
								.find('.btn-group')
								.wrap('<div class="scheduler-base-controls-buttons col-xl-6"/>');

							$('.scheduler-base-controls')
								.find('.scheduler-base-controls-buttons')
								.before('<div class="scheduler-base-controls-title col-xl-9 col-xl-offset-1 col-sm-offset-0"><h2 class="calendar-month-view-label">' + $('.scheduler-base-view-date').text() + '</h2></div>');
						}

						if ($('.jump-to-container').length &&
							!$('.scheduler-base-controls').find('.scheduler-base-controls-jump').length) {
							$('.scheduler-base-controls').append($('.jump-to-container').removeClass('hidden'))
						}

						// replace day headers with first letter of day
						$('.scheduler-view-table-header-col')
							.find('.scheduler-view-table-header-day').each(function () {
								$('> div', $(this)).text($('> div', $(this)).text().slice(0, 1));
							});

						$('.scheduler-base-content > .yui3-widget-hd').addClass('col-xl-14 col-xl-offset-1');
						$('.scheduler-base-content > .yui3-widget-bd').addClass('col-xl-14 col-xl-offset-1');
					},
				}
			}
		);

		Liferay.Scheduler = Scheduler;

		var SchedulerDayView = A.Component.create(
			{
				EXTENDS: A.SchedulerDayView,

				NAME: 'scheduler-day-view',

				ATTRS: {
					navigationDateFormatter: {
						value: function (date) {
							var instance = this;

							var scheduler = instance.get('scheduler');

							return A.DataType.Date.format(
								date,
								{
									format: Liferay.Language.get('a-b-d-y'),
									locale: scheduler.get('locale')
								}
							);
						},
						validator: isFunction
					}
				}
			}
		);

		Liferay.SchedulerDayView = SchedulerDayView;

		Liferay.SchedulerWeekView = A.SchedulerWeekView;

		var SchedulerMonthView = A.Component.create(
			{
				EXTENDS: A.SchedulerMonthView,

				NAME: 'scheduler-month-view',

				prototype: {
					_syncCellDimensions: function () {
						var instance = this;

						var scheduler = instance.get('scheduler');

						var viewDate = scheduler.get('viewDate');

						var weeks = DateMath.getWeeksInMonth(viewDate);

						SchedulerMonthView.superclass._syncCellDimensions.apply(this, arguments);

						instance.gridCellHeight = instance.rowsContainerNode.get('offsetHeight') / weeks;
					},

					_uiSetDate: function (date) {
						var instance = this;

						var weeks = DateMath.getWeeksInMonth(date);

						A.each(
							instance.tableRows,
							function (item, index) {
								if (index < weeks) {
									item.removeClass('hide');
								}
								else {
									item.addClass('hide');
								}
							}
						);

						SchedulerMonthView.superclass._uiSetDate.apply(this, arguments);
					}
				}
			}
		);

		Liferay.SchedulerMonthView = SchedulerMonthView;

		Liferay.SchedulerAgendaView = A.SchedulerAgendaView;
	},
	'',
	{
		requires: ['async-queue', 'aui-datatype', 'aui-scheduler', 'dd-plugin', 'liferay-calendar-message-util', 'liferay-calendar-recurrence-converter', 'liferay-calendar-recurrence-util', 'liferay-calendar-util', 'liferay-scheduler-event-recorder-override', 'liferay-scheduler-models-override', 'liferay-node', 'liferay-store', 'promise', 'resize-plugin']
	}
);