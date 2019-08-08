package form.field.file.form.field;

import com.liferay.dynamic.data.mapping.form.field.type.BaseDDMFormFieldType;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldType;

import org.osgi.service.component.annotations.Component;

/**
 * @author hectorortiz
 */
@Component(
	immediate = true,
	property = {
		"ddm.form.field.type.display.order:Integer=9",
		"ddm.form.field.type.icon=documents-and-media",
		"ddm.form.field.type.js.class.name=Liferay.DDM.Field.FormFieldFile",
		"ddm.form.field.type.js.module=form-field-file-form-field",
		"ddm.form.field.type.label=File Upload",
		"ddm.form.field.type.name=formFieldFile"
	},
	service = DDMFormFieldType.class
)
public class FormFieldFileDDMFormFieldType extends BaseDDMFormFieldType {

	@Override
	public String getName() {
		return "formFieldFile";
	}

}