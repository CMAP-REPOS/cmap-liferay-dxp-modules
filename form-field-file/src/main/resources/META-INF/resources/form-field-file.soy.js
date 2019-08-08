// This file was automatically generated from form-field-file.soy.
// Please don't edit this file by hand.

/**
 * @fileoverview Templates in namespace ddm.
 * @public
 */

if (typeof ddm == 'undefined') { var ddm = {}; }


ddm.FormFieldFile = function(opt_data, opt_ignored) {
  return '<div class="form-group form-field-file-form-field" data-fieldname="' + soy.$$escapeHtmlAttribute(opt_data.name) + '">' + ((opt_data.showLabel) ? '<label class="control-label">' + soy.$$escapeHtml(opt_data.label) + ((opt_data.required) ? '<span class="icon-asterisk text-warning"></span>' : '') + '</label>' + ((opt_data.tip) ? '<p class="liferay-ddm-form-field-tip">' + soy.$$escapeHtml(opt_data.tip) + '</p>' : '') : '') + '<input class="field form-control" id="' + soy.$$escapeHtmlAttribute(opt_data.name) + '" name="' + soy.$$escapeHtmlAttribute(opt_data.name) + '" ' + ((opt_data.readOnly) ? 'readonly' : '') + ' type="file" value="' + soy.$$escapeHtmlAttribute(opt_data.value) + '"></div>';
};
if (goog.DEBUG) {
  ddm.FormFieldFile.soyTemplateName = 'ddm.FormFieldFile';
}
