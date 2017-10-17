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
								'liferay-node',
								'liferay-store', 'promise',
								'resize-plugin',
								'moment']

						}
					},
					root: MODULE_PATH + '/js/'
				}
			}
		});
})();
