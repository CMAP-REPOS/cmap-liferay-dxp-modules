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

//		var SchedulerModelSync = function (config) { };
//
//		SchedulerModelSync.prototype = {
//			sync: function (action, options, callback) {
//				var instance = this;
//
//				var actionMethod = instance['_do' + toInitialCap(action)];
//
//				if (isFunction(actionMethod)) {
//					actionMethod.apply(instance, [options, callback]);
//				}
//			},
//
//			_doRead: function () {
//				var instance = this;
//
//				var args = arguments;
//
//				var callback = args[args.length - 1];
//
//				if (isFunction(callback)) {
//					callback();
//				}
//			}
//		};
//
//		Liferay.SchedulerModelSync = SchedulerModelSync;

//		var SchedulerEvent = A.Component.create(
//			{
//				ATTRS: {
//					calendarBookingId: {
//						setter: toInt,
//						value: 0
//					},
//
//					calendarId: {
//						setter: toInt,
//						value: 0
//					},
//
//					content: {
//						getter: function (val) {
//							var content = val;
//
//							if (val) {
//								content = LString.escapeHTML(val);
//							}
//
//							return content;
//						},
//						setter: function (val) {
//							var content = val;
//
//							if (val) {
//								content = LString.unescapeHTML(val);
//							}
//
//							return content;
//						}
//					},
//
//					description: {
//						setter: String,
//						validator: isValue,
//						value: STR_BLANK
//					},
//
//					editingEvent: {
//						validator: isBoolean,
//						value: false
//					},
//
//					firstReminder: {
//						setter: toInt,
//						value: 0
//					},
//
//					firstReminderType: {
//						setter: String,
//						validator: isValue,
//						value: CalendarUtil.NOTIFICATION_DEFAULT_TYPE
//					},
//
//					hasChildCalendarBookings: {
//						validator: isBoolean,
//						value: false
//					},
//
//					hasWorkflowInstanceLink: {
//						validator: isBoolean,
//						value: false
//					},
//
//					instanceIndex: {
//						setter: toInt,
//						value: 0
//					},
//
//					loading: {
//						validator: isBoolean,
//						value: false
//					},
//
//					location: {
//						setter: String,
//						validator: isValue,
//						value: STR_BLANK
//					},
//
//					parentCalendarBookingId: {
//						setter: toInt,
//						value: 0
//					},
//
//					recurrence: {
//						setter: String,
//						validator: isValue,
//						value: STR_BLANK
//					},
//
//					reminder: {
//						getter: function () {
//							var instance = this;
//
//							return instance.get('firstReminder') > 0 || instance.get('secondReminder') > 0;
//						}
//					},
//
//					repeated: {
//						getter: 'isRecurring'
//					},
//
//					secondReminder: {
//						setter: toInt,
//						value: 0
//					},
//
//					secondReminderType: {
//						setter: String,
//						validator: isValue,
//						value: CalendarUtil.NOTIFICATION_DEFAULT_TYPE
//					},
//
//					status: {
//						setter: toInt,
//						value: 0
//					},
//
//					// CMAP: override A.SchedulerEvent.titleDateFormat
//					// https://alloyui.com/api/files/alloy-ui_src_aui-scheduler_js_aui-scheduler-base-event.js.html#l184
//					titleDateFormat: {
//						getter: '_getTitleDateFormat',
//						value: function () {
//							var instance = this,
//								scheduler = instance.get('scheduler'),
//								isoTime = scheduler && scheduler.get('activeView').get('isoTime'),
//
//								format = {
//									endDate: ' to ' + '%l:%M %P',
//									startDate: '%l:%M %P'
//								};
//
//							if (instance.get('allDay')) {
//								format = {};
//							}
//
//							return format;
//						}
//					}
//
//				},
//
//				EXTENDS: A.SchedulerEvent,
//
//				NAME: 'scheduler-event',
//
//				PROPAGATE_ATTRS: A.SchedulerEvent.PROPAGATE_ATTRS.concat(['calendarBookingId', 'calendarId', 'calendarResourceId', 'parentCalendarBookingId', 'recurrence', 'status']),
//
//				prototype: {
//					eventModel: Liferay.SchedulerEvent,
//
//					initializer: function () {
//						var instance = this;
//
//						instance._uiSetLoading(instance.get('loading'));
//						instance._uiSetStartDate(instance.get('startDate'));
//						instance._uiSetStatus(instance.get('status'));
//
//						instance.on('loadingChange', instance._onLoadingChange);
//						instance.on('startDateChange', instance._onStartDateChange);
//						instance.on('statusChange', instance._onStatusChange);
//					},
//
//					syncUI: function () {
//						var instance = this;
//
//						Liferay.SchedulerEvent.superclass.syncUI.apply(instance, arguments);
//
//						instance._uiSetStatus(instance.get('status'));
//					},
//
//					isMasterBooking: function () {
//						var instance = this;
//
//						return instance.get('parentCalendarBookingId') === instance.get('calendarBookingId');
//					},
//
//					isRecurring: function () {
//						var instance = this;
//
//						return instance.get('recurrence') !== STR_BLANK;
//					},
//
//					syncNodeColorUI: function () {
//						var instance = this;
//
//						Liferay.SchedulerEvent.superclass.syncNodeColorUI.apply(instance, arguments);
//
//						var node = instance.get('node');
//						var scheduler = instance.get('scheduler');
//
//						if (scheduler && !instance.get('editingEvent')) {
//							var activeViewName = scheduler.get('activeView').get('name');
//
//							if (activeViewName === 'month' && !instance.get('allDay')) {
//								node.setStyles(
//									{
//										backgroundColor: instance.get('color'),
//										border: 'none',
//										color: '#111',
//										padding: '0 2px'
//									}
//								);
//							}
//						}
//					},
//
//					// CMAP: override A.SchedulerEvent.syncNodeTitleUI
//					// https://alloyui.com/api/files/alloy-ui_src_aui-scheduler_js_aui-scheduler-base-event.js.html#l801
//					syncNodeTitleUI: function () {
//						var instance = this,
//							format = instance.get('titleDateFormat'),
//							startDate = instance.get('startDate'),
//							endDate = instance.get('endDate'),
//							title = [];
//
//						var ream = / am/ig;
//						var repm = / pm/ig;
//
//						if (format.startDate) {
//							title.push(instance._formatDate(startDate, format.startDate));
//						}
//
//						if (format.endDate) {
//							title.push(instance._formatDate(endDate, format.endDate));
//						}
//
//						instance.setTitle(title.join('').replace(ream, ' a.m.').replace(repm, ' p.m.'));
//					},
//
//					syncWithServer: function () {
//						var instance = this;
//
//						var calendarBookingId = instance.get('calendarBookingId');
//						var scheduler = instance.get('scheduler');
//						var schedulerEvents = scheduler.getEventsByCalendarBookingId(calendarBookingId);
//
//						CalendarUtil.getEvent(
//							calendarBookingId,
//							A.bind(CalendarUtil.updateSchedulerEvents, CalendarUtil, schedulerEvents)
//						);
//					},
//
//					_onLoadingChange: function (event) {
//						var instance = this;
//
//						instance._uiSetLoading(event.newVal);
//					},
//
//					_onStartDateChange: function (event) {
//						var instance = this;
//
//						instance._uiSetStartDate(event.newVal);
//					},
//
//					_onStatusChange: function (event) {
//						var instance = this;
//
//						instance._uiSetStatus(event.newVal);
//					},
//
//					_uiSetEndDate: function (val) {
//						var instance = this;
//
//						Liferay.SchedulerEvent.superclass._uiSetEndDate.apply(instance, arguments);
//
//						var node = instance.get('node');
//
//						node.attr('data-endDate', instance._formatDate(val, '%m/%d/%Y'));
//						node.attr('data-endTime', instance._formatDate(val, '%I:%M %p'));
//					},
//
//					_uiSetLoading: function (val) {
//						var instance = this;
//
//						instance.get('node').toggleClass('calendar-portlet-event-loading', val);
//					},
//
//					_uiSetStartDate: function (val) {
//						var instance = this;
//
//						var node = instance.get('node');
//
//						node.attr('data-startDate', instance._formatDate(val, '%m/%d/%Y'));
//						node.attr('data-startTime', instance._formatDate(val, '%I:%M %p'));
//					},
//
//					_uiSetStatus: function (val) {
//						var instance = this;
//
//						var node = instance.get('node');
//
//						node.toggleClass('calendar-portlet-event-approved', val === CalendarWorkflow.STATUS_APPROVED);
//						node.toggleClass('calendar-portlet-event-draft', val === CalendarWorkflow.STATUS_DRAFT);
//						node.toggleClass('calendar-portlet-event-maybe', val === CalendarWorkflow.STATUS_MAYBE);
//						node.toggleClass('calendar-portlet-event-pending', val === CalendarWorkflow.STATUS_PENDING);
//					}
//				}
//			}
//		);
//
//		Liferay.SchedulerEvent = SchedulerEvent;
//
//		var Calendar = A.Component.create(
//			{
//				ATTRS: {
//					calendarId: {
//						setter: toInt,
//						value: 0
//					},
//
//					calendarResourceId: {
//						setter: toInt,
//						value: 0
//					},
//
//					calendarResourceName: {
//						setter: String,
//						validator: isValue,
//						value: STR_BLANK
//					},
//
//					classNameId: {
//						setter: toInt,
//						value: 0
//					},
//
//					classPK: {
//						setter: toInt,
//						value: 0
//					},
//
//					defaultCalendar: {
//						setter: A.DataType.Boolean.parse,
//						value: false
//					},
//
//					groupId: {
//						setter: toInt,
//						value: 0
//					},
//
//					manageable: {
//						setter: A.DataType.Boolean.parse,
//						value: true
//					},
//
//					permissions: {
//						lazyAdd: false,
//						setter: function (val) {
//							var instance = this;
//
//							instance.set('disabled', !val.MANAGE_BOOKINGS);
//
//							return val;
//						},
//						validator: isObject,
//						value: {}
//					},
//
//					showCalendarResourceName: {
//						value: true
//					}
//				},
//
//				EXTENDS: A.SchedulerCalendar,
//
//				NAME: 'scheduler-calendar',
//
//				prototype: {
//					getDisplayName: function () {
//						var instance = this;
//
//						var name = instance.get('name');
//
//						var showCalendarResourceName = instance.get('showCalendarResourceName');
//
//						if (showCalendarResourceName) {
//							var calendarResourceName = instance.get('calendarResourceName');
//
//							name = CalendarUtil.getCalendarName(name, calendarResourceName);
//						}
//
//						return name;
//					},
//
//					_afterColorChange: function (event) {
//						var instance = this;
//
//						Calendar.superclass._afterColorChange.apply(instance, arguments);
//
//						var calendarId = instance.get('calendarId');
//
//						var color = event.newVal;
//
//						if (instance.get('permissions.UPDATE')) {
//							CalendarUtil.invokeService(
//								{
//									'/calendar.calendar/update-color': {
//										calendarId: calendarId,
//										color: parseInt(color.substr(1), 16)
//									}
//								}
//							);
//						}
//						else {
//							Liferay.Store('com.liferay.calendar.web_calendar' + calendarId + 'Color', color);
//						}
//					},
//
//					_afterVisibleChange: function (event) {
//						var instance = this;
//
//						Calendar.superclass._afterVisibleChange.apply(instance, arguments);
//
//						var scheduler = instance.get('scheduler');
//
//						scheduler.syncEventsUI();
//					}
//				}
//			}
//		);

//		Liferay.SchedulerCalendar = Calendar;
//
//		Liferay.SchedulerEvents = A.Base.create(
//			'scheduler-events',
//			A.SchedulerEvents,
//			[Liferay.SchedulerModelSync],
//			{
//				getLoadEndDate: function (activeView) {
//					var instance = this;
//
//					var date = activeView.getNextDate();
//
//					var viewName = activeView.get('name');
//
//					if (viewName === 'agenda') {
//						date = DateMath.add(date, DateMath.MONTH, 1);
//					}
//					else if (viewName === 'month') {
//						date = DateMath.add(date, DateMath.WEEK, 1);
//					}
//
//					return date;
//				},
//
//				getLoadStartDate: function (activeView) {
//					var instance = this;
//
//					var scheduler = activeView.get('scheduler');
//					var viewName = activeView.get('name');
//
//					var date = scheduler.get('viewDate');
//
//					if (viewName === 'month') {
//						date = DateMath.subtract(date, DateMath.WEEK, 1);
//					}
//
//					return date;
//				},
//
//				_doRead: function (options, callback) {
//					var instance = this;
//					
//					var scheduler = instance.get('scheduler');
//					console.log("scheduler");
//					console.log(scheduler);
//
//					var activeView = scheduler.get('activeView');
//					
//					var eventsPerPage = scheduler.get('eventsPerPage');
//					//console.log(eventsPerPage);
//					var filterCalendarBookings = scheduler.get('filterCalendarBookings');
//					//console.log(filterCalendarBookings);
//					var maxDaysDisplayed = scheduler.get('maxDaysDisplayed');
////					console.log(maxDaysDisplayed);
//
//					// Liferay.CalendarMessageUtil.showAlert(instance, Liferay.Language.get('loading'));
//
//					// CMAP-410
//					var calendarContainer = scheduler.get('calendarContainer');
//					console.log("calendarContainer");
//					console.log(calendarContainer);
//					var calendarIds = AObject.keys(calendarContainer.get('availableCalendars'));
////					console.log(calendarIds);
//					var remoteServices = scheduler.get('remoteServices');
////					console.log(remoteServices);
//					var startDate = instance.getLoadStartDate(activeView);
////					console.log(startDate);
//					var endDate = instance.getLoadEndDate(activeView, maxDaysDisplayed);
////					console.log(endDate);
//					var status = [CalendarWorkflow.STATUS_APPROVED, CalendarWorkflow.STATUS_DRAFT, CalendarWorkflow.STATUS_MAYBE, CalendarWorkflow.STATUS_PENDING];
////					console.log(status);
//
////					console.log(instance.getEventsPerPage(activeView, eventsPerPage));
//					
//					remoteServices.getEvents(
//						calendarIds,
//						instance.getEventsPerPage(activeView, eventsPerPage),
//						startDate,
//						endDate,
//						status,
//						function (calendarBookings) {
//							if (filterCalendarBookings) {
//								calendarBookings = calendarBookings.filter(filterCalendarBookings);
//							}
//
//							callback(null, calendarBookings);
//						}
//					);
//				}
//			},
//			{}
//		);

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

//		var SchedulerEventRecorder = A.Component.create(
//			{
//				ATTRS: {
//					calendarId: {
//						setter: toInt,
//						value: 0
//					},
//
//					editCalendarBookingURL: {
//						setter: String,
//						validator: isValue,
//						value: STR_BLANK
//					},
//
//					permissionsCalendarBookingURL: {
//						setter: String,
//						validator: isValue,
//						value: STR_BLANK
//					},
//
//					portletNamespace: {
//						setter: String,
//						validator: isValue,
//						value: STR_BLANK
//					},
//
//					status: {
//						setter: toInt,
//						value: CalendarWorkflow.STATUS_DRAFT
//					},
//
//					toolbar: {
//						value: {
//							children: []
//						}
//					},
//
//					viewCalendarBookingURL: {
//						setter: String,
//						validator: isValue,
//						value: STR_BLANK
//					}
//				},
//
//				EXTENDS: A.SchedulerEventRecorder,
//
//				NAME: 'scheduler-event-recorder',
//
//				prototype: {
//					initializer: function () {
//						var instance = this;
//
//						var popoverBB = instance.popover.get('boundingBox');
//
//						popoverBB.delegate('click', instance._handleEventAnswer, '.calendar-event-answer', instance);
//					},
//
//					// CMAP: override A.SchedulerEventRecorder.getFormattedDate
//					// https://alloyui.com/api/files/alloy-ui_src_aui-scheduler_js_aui-scheduler-event-recorder.js.html#l238
//					getFormattedDate: function () {
//						var instance = this,
//							evt = (instance.get('event') || instance),
//							endDate = evt.get('endDate'),
//							startDate = evt.get('startDate'),
//							formattedDate = evt._formatDate(startDate, '%m/%d/%Y');
//
//						if (evt.get('allDay')) {
//							return formattedDate;
//						}
//
//						formattedDate = formattedDate.concat('<br>');
//
//						var ream = / am/ig;
//						var repm = / pm/ig;
//
//						var startTime = evt._formatDate(startDate, '%l:%M %P').replace(ream, ' a.m.').replace(repm, ' p.m.');
//						var endTime = evt._formatDate(endDate, '%l:%M %P').replace(ream, ' a.m.').replace(repm, ' p.m.');
//
//						return [formattedDate, startTime, ' to ', endTime].join(' ');
//					},
//
//					getTemplateData: function () {
//						var instance = this;
//
//						var editing = true;
//
//						var schedulerEvent = instance.get('event');
//
//						if (!schedulerEvent) {
//							editing = false;
//
//							schedulerEvent = instance;
//						}
//						
//
//						var availableCalendars = Liferay.CalendarContainer.ATTRS.availableCalendars;
//						
//						var calendar = availableCalendars[schedulerEvent.get('calendarId')];
//
//						var permissions = calendar.get('permissions');
//
//						var templateData = SchedulerEventRecorder.superclass.getTemplateData.apply(this, arguments);
//
//						// CMAP: get event location if event exists
//						var eventLocation = schedulerEvent.get('location');
//
//						// CMAP: get formatted date and time for email form
//						var formattedDate = schedulerEvent._formatDate(schedulerEvent.get('startDate'), '%m/%d/%Y');
//						var formattedTime = schedulerEvent._formatDate(schedulerEvent.get('startDate'), '%I:%M %p');
//
//						return A.merge(
//							templateData,
//							{
//								acceptLinkEnabled: instance._hasWorkflowStatusPermission(schedulerEvent, CalendarWorkflow.STATUS_APPROVED),
//								allDay: schedulerEvent.get('allDay'),
//								availableCalendars: availableCalendars,
//								calendar: calendar,
//								calendarIds: AObject.keys(availableCalendars),
//								declineLinkEnabled: instance._hasWorkflowStatusPermission(schedulerEvent, CalendarWorkflow.STATUS_DENIED),
//								editing: editing,
//								endTime: templateData.endDate,
//								hasWorkflowInstanceLink: schedulerEvent.get('hasWorkflowInstanceLink'),
//								instanceIndex: schedulerEvent.get('instanceIndex'),
//								maybeLinkEnabled: instance._hasWorkflowStatusPermission(schedulerEvent, CalendarWorkflow.STATUS_MAYBE),
//								permissions: permissions,
//								startTime: templateData.startDate,
//								status: schedulerEvent.get('status'),
//								workflowStatus: CalendarWorkflow,
//								// CMAP: add event location and appointment to templateData
//								location: eventLocation,
//								locationEncoded: encodeURIComponent(eventLocation),
//								appointment: instance._getAppointment(templateData, eventLocation),
//								formattedDate: formattedDate,
//								formattedTime: formattedTime,
//								googleCalendarLink: instance._getGoogleCalendarLink(templateData, eventLocation),
//								calendarBookingId: schedulerEvent.get('calendarBookingId')
//							}
//						);
//					},
//
//					getUpdatedSchedulerEvent: function (optAttrMap) {
//						var instance = this;
//
//						var attrMap = {
//							color: instance.get('color')
//						};
//
//						var event = instance.get('event');
//
//						if (event) {
//							// CMAP-410 this line is showing errors.
//							var calendar = Liferay.CalendarContainer.ATTRS.availableCalendars[schedulerEvent.get('calendarId')];
//
//							if (calendar) {
//								attrMap.color = calendar.get('color');
//							}
//						}
//
//						return SchedulerEventRecorder.superclass.getUpdatedSchedulerEvent.call(instance, A.merge(attrMap, optAttrMap));
//					},
//
//					isMasterBooking: Lang.emptyFnFalse,
//
//					populateForm: function () {
//						var instance = this;
//
//						var bodyTemplate = instance.get('bodyTemplate');
//						var headerTemplate = instance.get('headerTemplate');
//						var templateData = instance.getTemplateData();
//
//						if (A.instanceOf(bodyTemplate, A.Template) && A.instanceOf(headerTemplate, A.Template)) {
//							instance.popover.setStdModContent('body', bodyTemplate.parse(templateData));
//							instance.popover.setStdModContent('header', headerTemplate.parse(templateData));
//							instance.popover.addToolbar(instance._getFooterToolbar(), 'footer');
//						}
//						else {
//							SchedulerEventRecorder.superclass.populateForm.apply(instance, arguments);
//						}
//
//						instance.popover.addToolbar(
//							[
//								{
//									cssClass: 'close',
//									label: '\u00D7',
//									on: {
//										click: A.bind(instance._handleCancelEvent, instance)
//									},
//									render: true
//								}
//							],
//							'body'
//						);
//
//						if (instance.popover.headerNode) {
//							instance.popover.headerNode.toggleClass('hide', !templateData.permissions.VIEW_BOOKING_DETAILS);
//						}
//
//						instance._showResources();
//					},
//
//					// CMAP: copied in A.SchedulerEventRecorder.showPopover from alloy-3.0.1
//					showPopover: function (node) {
//
//						console.log('showPopover');
//
//						var instance = this,
//							event = instance.get('event');
//
//						if (!instance.popover.get('rendered')) {
//							instance._renderPopover();
//						}
//
//						if (!node) {
//							if (event) {
//								node = event.get('node');
//							}
//							else {
//								node = instance.get('node');
//							}
//						}
//
//						if (A.Lang.isNodeList(node)) {
//							node = node.item(0);
//						}
//
//						var align = instance.popover.get('align');
//						instance.popover.set('align', {
//							node: node,
//							points: align.points
//						});
//
//						// CMAP: call cmap.calendar.form.getEventLink if it is defined -- see view.jsp in calendar-web-form-pZ
//						if (!!cmap && !!cmap.calendar && !!cmap.calendar.form && !!cmap.calendar.form.getEventLink) {
//							cmap.calendar.form.getEventLink(event.get('calendarBookingId'), instance);
//						} else {
//							instance.popover.show();
//						}
//					},
//
//
//					// CMAP: custom function to get "Add to Google Calendar" link
//					_getGoogleCalendarLink: function (templateData, location) {
//						// https://stackoverflow.com/questions/22757908/google-calendar-render-action-template-parameter-documentation
//						// https://www.google.com/calendar/render?
//						// 	action=TEMPLATE
//						// 	&text=EventName
//						// 	&dates=20131206T050000Z/20131208T060000Z
//						// 	&location=EventLocation
//						// 	&details=EventDetail
//						// 	&sf=true
//						// 	&output=xml
//
//						var instance = this,
//							evt = (instance.get('event') || instance),
//							endDate = evt.get('endDate'),
//							startDate = evt.get('startDate');
//
//						var la = [];
//						la.push('https://www.google.com/calendar/render?action=TEMPLATE&text=');
//						la.push(encodeURIComponent(templateData.content));
//						la.push('&dates=');
//						la.push(evt._formatDate(startDate, '%Y%m%dT%H%M%S'));
//						la.push('/');
//						la.push(evt._formatDate(endDate, '%Y%m%dT%H%M%S'));
//						la.push('&location=');
//						la.push(encodeURIComponent(location));
//						la.push('&sf=true');
//						la.push('&output=xml');
//
//						return la.join('');
//					},
//
//					// CMAP: custom function to generate iCal data
//					_getAppointment: function (templateData, location) {
//
//						// BEGIN:VCALENDAR
//						// VERSION:2.0
//						// PRODID:-PRODID:-//CMAP//NONSGML
//						// CMAP//EN
//						// BEGIN:VEVENT
//						// UID:uid1@example.com
//						// DTSTAMP:19970714T170000
//						// ORGANIZER;CN=John
//						// Doe:MAILTO:john.doe@example.com
//						// DTSTART:19970714T170000Z
//						// DTEND:19970715T035959Z
//						// SUMMARY:Bastille Day Party
//						// END:VEVENT
//						// END:VCALENDAR
//
//						var appointment = '';
//						var instance = this;
//						var evt = (instance.get('event') || instance);
//
//						var aa = [];
//						aa.push('BEGIN:VCALENDAR');
//						aa.push('\r\n');
//						aa.push('VERSION:2.0');
//						aa.push('\r\n');
//						aa.push('PRODID:-//CMAP//NONSGML CMAP//EN');
//						aa.push('\r\n');
//						aa.push('BEGIN:VEVENT');
//						aa.push('\r\n');
//						aa.push('UID:' + '');
//						aa.push('\r\n');
//						aa.push('DTSTAMP:' + evt._formatDate(evt.get('startDate'), '%Y%m%dT%H%M%S'));
//						aa.push('\r\n');
//						aa.push('ORGANIZER;CN=CMAP:MAILTO:info@cmap.illinois.gov');
//						aa.push('\r\n');
//						aa.push('DTSTART:' + evt._formatDate(evt.get('startDate'), '%Y%m%dT%H%M%S'));
//						aa.push('\r\n');
//						aa.push('DTEND:' + evt._formatDate(evt.get('endDate'), '%Y%m%dT%H%M%S'));
//						aa.push('\r\n');
//						if (evt.get('recurrence')) {
//							aa.push(evt.get('recurrence'));
//							aa.push('\r\n');
//						}
//						aa.push('SUMMARY:' + templateData.content);
//						aa.push('\r\n');
//						aa.push('LOCATION:' + location);
//						aa.push('\r\n');
//						aa.push('END:VEVENT');
//						aa.push('\r\n');
//						aa.push('END:VCALENDAR');
//
//						appointment = btoa(aa.join(''));
//						return appointment;
//					},
//
//					_getFooterToolbar: function () {
//						var instance = this;
//
//						var schedulerEvent = instance.get('event');
//
//						var schedulerEventCreated = false;
//
//						if (schedulerEvent) {
//							schedulerEventCreated = true;
//						}
//						else {
//							schedulerEvent = instance;
//						}
//
//						var children = [];
//						var editGroup = [];
//						var respondGroup = [];
//
////						var calendar = Liferay.CalendarUtil.availableCalendars[schedulerEvent.get('calendarId')];
//						// CMAP-410 
//						var calendar =  Liferay.CalendarContainer.ATTRS.availableCalendars[schedulerEvent.get('calendarId')];
//						var status = schedulerEvent.get('status');
//
//						if (calendar) {
//							var permissions = calendar.get('permissions');
//
//							if (instance._hasSaveButton(permissions, calendar, status)) {
//								editGroup.push(
//									{
//										icon: 'icon-hdd',
//										id: 'saveBtn',
//										label: Liferay.Language.get('save'),
//										on: {
//											click: A.bind(instance._handleSaveEvent, instance)
//										},
//										primary: true
//									}
//								);
//							}
//
//							if (instance._hasEditButton(permissions, calendar, status)) {
//								editGroup.push(
//									{
//										icon: 'icon-edit',
//										id: 'editBtn',
//										label: Liferay.Language.get('edit'),
//										on: {
//											click: A.bind(instance._handleEditEvent, instance)
//										}
//									}
//								);
//							}
//
//							// CMAP: override to hide view-details for guests
//							if (instance._hasEditButton(permissions, calendar, status)) {
//								editGroup.push(
//									{
//										icon: 'icon-eye-open',
//										id: 'viewBtn',
//										// label: Liferay.Language.get('view-details'),
//										// CMAP: placeholder value is being returned for view-details
//										label: 'View Details',
//										on: {
//											click: A.bind(instance._handleViewEvent, instance)
//										}
//									}
//								);
//							}
//
//							if (schedulerEvent.isMasterBooking() && instance._hasDeleteButton(permissions, calendar, status)) {
//								editGroup.push(
//									{
//										icon: 'icon-trash',
//										id: 'deleteBtn',
//										label: Liferay.Language.get('delete'),
//										on: {
//											click: A.bind(instance._handleDeleteEvent, instance)
//										}
//									}
//								);
//							}
//
//							if (editGroup.length) {
//								children.push(editGroup);
//							}
//
//							if (respondGroup.length) {
//								children.push(respondGroup);
//							}
//						}
//
//						return children;
//					},
//
//					_handleEditEvent: function (event) {
//						var instance = this;
//
//						var scheduler = instance.get('scheduler');
//
//						var activeViewName = scheduler.get('activeView').get('name');
//
//						var date = scheduler.get('date');
//
//						var schedulerEvent = instance.get('event');
//
//						var editCalendarBookingURL = decodeURIComponent(instance.get('editCalendarBookingURL'));
//
//						var data = instance.serializeForm();
//
//						data.activeView = activeViewName;
//
//						data.date = date.getTime();
//
//						var endTime = new Date(data.endTime);
//
//						data.endTimeDay = endTime.getDate();
//						data.endTimeHour = endTime.getHours();
//						data.endTimeMinute = endTime.getMinutes();
//						data.endTimeMonth = endTime.getMonth();
//						data.endTimeYear = endTime.getFullYear();
//
//						var startTime = new Date(data.startTime);
//
//						data.startTimeDay = startTime.getDate();
//						data.startTimeHour = startTime.getHours();
//						data.startTimeMinute = startTime.getMinutes();
//						data.startTimeMonth = startTime.getMonth();
//						data.startTimeYear = startTime.getFullYear();
//
//						data.titleCurrentValue = encodeURIComponent(data.content);
//
//						if (schedulerEvent) {
//							data.allDay = schedulerEvent.get('allDay');
//							data.calendarBookingId = schedulerEvent.get('calendarBookingId');
//						}
//
//						Liferay.Util.openWindow(
//							{
//								dialog: {
//									after: {
//										destroy: function (event) {
//											scheduler.load();
//										}
//									},
//									destroyOnHide: true,
//									modal: true
//								},
//								refreshWindow: window,
//								title: Liferay.Language.get('edit-calendar-booking'),
//								uri: CalendarUtil.fillURLParameters(editCalendarBookingURL, data)
//							}
//						);
//
//						instance.hidePopover();
//					},
//
//					_handleEventAnswer: function (event) {
//						var instance = this;
//
//						var currentTarget = event.currentTarget;
//
//						var schedulerEvent = instance.get('event');
//
//						var linkEnabled = A.DataType.Boolean.parse(currentTarget.hasClass('calendar-event-answer-true'));
//
//						var statusData = toInt(currentTarget.getData('status'));
//
//						if (schedulerEvent && linkEnabled) {
//							CalendarUtil.invokeTransition(schedulerEvent, statusData);
//						}
//					},
//
//					_handleViewEvent: function (event) {
//						var instance = this;
//
//						var viewCalendarBookingURL = decodeURIComponent(instance.get('viewCalendarBookingURL'));
//
//						var data = instance.serializeForm();
//
//						var schedulerEvent = instance.get('event');
//
//						data.calendarBookingId = schedulerEvent.get('calendarBookingId');
//
//						Liferay.Util.openWindow(
//							{
//								dialog: {
//									after: {
//										destroy: function (event) {
//											schedulerEvent.syncWithServer();
//										}
//									},
//									destroyOnHide: true,
//									modal: true
//								},
//								refreshWindow: window,
//								title: Liferay.Language.get('view-calendar-booking-details'),
//								uri: CalendarUtil.fillURLParameters(viewCalendarBookingURL, data)
//							}
//						);
//
//						event.domEvent.preventDefault();
//					},
//
//					_hasDeleteButton: function (permissions, calendar, status) {
//						return permissions.MANAGE_BOOKINGS && calendar;
//					},
//
//					_hasEditButton: function (permissions, calendar, status) {
//						return permissions.MANAGE_BOOKINGS;
//					},
//
//					_hasSaveButton: function (permissions, calendar, status) {
//						return permissions.MANAGE_BOOKINGS;
//					},
//
//					_hasWorkflowStatusPermission: function (schedulerEvent, newStatus) {
//						var instance = this;
//
//						var hasPermission = false;
//
//						if (schedulerEvent) {
//							var calendarId = schedulerEvent.get('calendarId');
//
//							var calendar = Liferay.CalendarContainer.ATTRS.availableCalendars[calendarId];
//
//							var permissions = calendar.get('permissions');
//
//							var status = schedulerEvent.get('status');
//
//							hasPermission = permissions.MANAGE_BOOKINGS && status !== newStatus && status !== CalendarWorkflow.STATUS_DRAFT;
//						}
//
//						return hasPermission;
//					},
//
//					_renderPopOver: function () {
//						var instance = this;
//
//						var popoverBB = instance.popover.get('boundingBox');
//
//						SchedulerEventRecorder.superclass._renderPopOver.apply(this, arguments);
//
//						popoverBB.delegate(
//							['change', 'keypress'],
//							function (event) {
//								var schedulerEvent = instance.get('event') || instance;
//
//								var calendarId = toInt(event.currentTarget.val());
//
//								var selectedCalendar = Liferay.CalendarContainer.ATTRS.availableCalendars[calendarId];
//
//								if (selectedCalendar) {
//									schedulerEvent.set(
//										'color',
//										selectedCalendar.get('color'),
//										{
//											silent: true
//										}
//									);
//								}
//							},
//							'#' + instance.get('portletNamespace') + 'eventRecorderCalendar'
//						);
//					},
//
//					_showResources: function () {
//						var instance = this;
//
//						var schedulerEvent = instance.get('event');
//
//						var popoverBB = instance.popover.get('boundingBox');
//
//						popoverBB.toggleClass('calendar-portlet-event-recorder-editing', !!schedulerEvent);
//
//						var defaultUserCalendar = CalendarUtil.getDefaultUserCalendar();
//
//						var calendarId = defaultUserCalendar.get('calendarId');
//						var color = defaultUserCalendar.get('color');
//
//						var eventInstance = instance;
//
//						if (schedulerEvent) {
//							calendarId = schedulerEvent.get('calendarId');
//
//							var calendar = Liferay.CalendarContainer.ATTRS.availableCalendars[calendarId];
//
//							if (calendar) {
//								color = calendar.get('color');
//
//								eventInstance = schedulerEvent;
//							}
//						}
//
//						eventInstance.set(
//							'color',
//							color,
//							{
//								silent: true
//							}
//						);
//
//						var portletNamespace = instance.get('portletNamespace');
//
//						var eventRecorderCalendar = A.one('#' + portletNamespace + 'eventRecorderCalendar');
//
//						if (eventRecorderCalendar) {
//							eventRecorderCalendar.val(calendarId.toString());
//						}
//
//						instance._syncInvitees();
//					},
//
//					_syncInvitees: function () {
//						var instance = this;
//
//						var schedulerEvent = instance.get('event');
//
//						if (schedulerEvent) {
//							var calendar = Liferay.CalendarContainer.ATTRS.availableCalendars[schedulerEvent.get('calendarId')];
//
//							if (calendar) {
//								var permissions = calendar.get('permissions');
//
//								if (permissions.VIEW_BOOKING_DETAILS) {
//									var parentCalendarBookingId = schedulerEvent.get('parentCalendarBookingId');
//									var portletNamespace = instance.get('portletNamespace');
//
//									CalendarUtil.getCalendarBookingInvitees(
//										parentCalendarBookingId,
//										function (data) {
//											var results = AArray.partition(
//												data,
//												function (item) {
//													return toInt(item.classNameId) === CalendarUtil.USER_CLASS_NAME_ID;
//												}
//											);
//
//											instance._syncInviteesContent('#' + portletNamespace + 'eventRecorderUsers', results.matches);
//											instance._syncInviteesContent('#' + portletNamespace + 'eventRecorderResources', results.rejects);
//										}
//									);
//								}
//							}
//						}
//					},
//
//					_syncInviteesContent: function (contentNode, calendarResources) {
//						var instance = this;
//
//						var values = calendarResources.map(
//							function (item) {
//								return item.name;
//							}
//						);
//
//						contentNode = A.one(contentNode);
//
//						// CMAP: contentNode may be null
//						if (contentNode) {
//							var messageNode = contentNode.one('.calendar-portlet-invitees');
//
//							var messageHTML = '&mdash;';
//
//							if (values.length > 0) {
//								contentNode.show();
//
//								messageHTML = values.join(STR_COMMA_SPACE);
//							}
//
//							messageNode.html(messageHTML);
//						}
//					}
//				}
//			}
//		);
//
//		Liferay.SchedulerEventRecorder = SchedulerEventRecorder;
	},
	'',
	{
		requires: ['async-queue', 'aui-datatype', 'aui-scheduler', 'dd-plugin', 'liferay-calendar-message-util', 'liferay-calendar-recurrence-converter', 'liferay-calendar-recurrence-util', 'liferay-calendar-util', 'liferay-scheduler-event-recorder-override', 'liferay-scheduler-models-override', 'liferay-node', 'liferay-store', 'promise', 'resize-plugin']
	}
);