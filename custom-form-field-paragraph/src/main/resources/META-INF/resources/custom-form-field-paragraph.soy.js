// This file was automatically generated from custom-form-field-paragraph.soy.
// Please don't edit this file by hand.

/**
 * @fileoverview Templates in namespace ddm.
 * @public
 */

if (typeof ddm == 'undefined') { var ddm = {}; }


ddm.CustomFormFieldParagraph = function(opt_data, opt_ignored) {
  return '<div class="form-group custom-form-field-paragraph-form-field" data-fieldname="' + soy.$$escapeHtmlAttribute(opt_data.name) + '">' + ((opt_data.showLabel) ? '<p>' + soy.$$escapeHtml(opt_data.label) + '</p>' : '') + ((opt_data.tip) ? '<p>' + soy.$$escapeHtml(opt_data.tip) + '</p>' : '') + '</div>';
};
if (goog.DEBUG) {
  ddm.CustomFormFieldParagraph.soyTemplateName = 'ddm.CustomFormFieldParagraph';
}
