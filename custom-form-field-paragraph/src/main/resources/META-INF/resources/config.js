;(function() {
	AUI().applyConfig(
		{
			groups: {
				'custom-form-field-paragraph-group': {
					base: MODULE_PATH + '/',
					combine: Liferay.AUI.getCombine(),
					modules: {
						'custom-form-field-paragraph-form-field': {
							condition: {
								trigger: 'liferay-ddm-form-renderer'
							},
							path: 'custom-form-field-paragraph_field.js',
							requires: [
								'liferay-ddm-form-renderer-field'
							]
						},
						'custom-form-field-paragraph-form-field-template': {
							condition: {
								trigger: 'liferay-ddm-form-renderer'
							},
							path: 'custom-form-field-paragraph.soy.js',
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