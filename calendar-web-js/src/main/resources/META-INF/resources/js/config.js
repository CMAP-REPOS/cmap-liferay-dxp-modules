; (function () {
	AUI()
		.applyConfig({
			groups: {
				calendarweboverride: {
					base: MODULE_PATH + '/js/',
					combine: Liferay.AUI.getCombine(),
					filter: Liferay.AUI.getFilterConfig(),
					modules: {
						'liferay-scheduler-override': {
							path: 'scheduler_override.js',
							condition: {
								name: 'liferay-scheduler-override',
								trigger: 'liferay-scheduler',
								when: 'instead'
							},
							requires: [
								'async-queue', 
								'aui-datatype', 
								'aui-scheduler', 
								'dd-plugin', 
								'liferay-calendar-message-util', 
								'liferay-calendar-recurrence-converter', 
								'liferay-calendar-recurrence-util', 
								'liferay-calendar-util', 
								'liferay-scheduler-event-recorder', 
								'liferay-scheduler-models', 
								'liferay-store', 
								'promise', 
								'resize-plugin'
							]
						},
						'liferay-scheduler-model-override': {
							path: 'scheduler_models_override.js',
							condition: {
								name: 'liferay-scheduler-model-override',
								trigger: 'liferay-scheduler-models',
								when: 'instead'
							},
							requires: [
								'aui-datatype', 
								'dd-plugin', 
								'liferay-calendar-util'
							]
						},
						'liferay-scheduler-event-recorder-override': {
							path: 'scheduler_event_recorder_override.js',
							condition: {
								name: 'liferay-scheduler-event-recorder-override',
								trigger: 'liferay-scheduler-event-recorder',
								when: 'instead'
							},
							requires: [
								'dd-plugin',
								'liferay-calendar-util',
								'resize-plugin'
							]
						}
					},
					root: MODULE_PATH + '/js/'
				}
			}
		});
})();
