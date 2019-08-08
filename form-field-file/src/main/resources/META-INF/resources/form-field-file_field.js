AUI.add(
	'form-field-file-form-field',
	function(A) {
		var FormFieldFileField = A.Component.create(
			{
				ATTRS: {
					type: {
						value: 'form-field-file-form-field'
					}
				},

				EXTENDS: Liferay.DDM.Renderer.Field,
				NAME: 'form-field-file-form-field',

				prototype: {
					
				}
			});

		Liferay.namespace('DDM.Field').FormFieldFile = FormFieldFileField;
	},
	'',
	{
		requires: ['liferay-ddm-form-renderer-field']
	}
);