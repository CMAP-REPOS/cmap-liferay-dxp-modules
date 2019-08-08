package com.cmap.custom.paragraph.form.field;

import com.liferay.dynamic.data.mapping.form.field.type.BaseDDMFormFieldType;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldType;

import org.osgi.service.component.annotations.Component;

/**
 * @author jon
 */
@Component(
	immediate = true,
	property = {
		"ddm.form.field.type.display.order:Integer=9",
		"ddm.form.field.type.icon=text",
		"ddm.form.field.type.js.class.name=Liferay.DDM.Field.CustomFormFieldParagraph",
		"ddm.form.field.type.js.module=custom-form-field-paragraph-form-field",
		"ddm.form.field.type.label=custom-form-field-paragraph-label",
		"ddm.form.field.type.name=CustomFormFieldParagraph"
	},
	service = DDMFormFieldType.class
)
public class CustomFormFieldParagraphDDMFormFieldType extends BaseDDMFormFieldType {

	@Override
	public String getName() {
		return "CustomFormFieldParagraph";
	}
}

