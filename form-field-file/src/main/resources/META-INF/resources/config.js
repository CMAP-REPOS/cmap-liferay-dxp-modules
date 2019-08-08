;(function() {
	AUI().applyConfig(
		{
			groups: {
				'form-field-file-group': {
					base: MODULE_PATH + '/',
					combine: Liferay.AUI.getCombine(),
					filter: Liferay.AUI.getFilterConfig(),
					modules: {
						'form-field-file-form-field': {
							condition: {
								trigger: 'liferay-ddm-form-renderer'
							},
							path: 'form-field-file_field.js',
							requires: [
								'liferay-ddm-form-renderer-field'
							]
						},
						'form-field-file-form-field-template': {
							condition: {
								trigger: 'liferay-ddm-form-renderer'
							},
							path: 'form-field-file.soy.js',
							requires: [
								'soyutils'
							]
						}
					},
					root: MODULE_PATH + '/'
				}
			}
		}
	);
})();