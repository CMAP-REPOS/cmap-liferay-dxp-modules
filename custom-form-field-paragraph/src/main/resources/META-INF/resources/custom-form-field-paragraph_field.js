AUI.add(
	'custom-form-field-paragraph-form-field',
	function(A) {
		var CustomFormFieldParagraphField = A.Component.create(
			{
				EXTENDS: Liferay.DDM.Renderer.Field,

				NAME: 'custom-form-field-paragraph-form-field'

			}
		);

		Liferay.namespace('DDM.Field').CustomFormFieldParagraph = CustomFormFieldParagraphField;
	},
	'',
	{
		requires: ['liferay-ddm-form-renderer-field']
	}
);