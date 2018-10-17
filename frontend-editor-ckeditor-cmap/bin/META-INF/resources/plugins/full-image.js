
if(CKEDITOR.plugins.get('full-width-image')){
	// ignore if the plugin is already registered 
} else {

  var this_template = '<div class="full-screen-picture">' +
    '<div class="editable-image">' +
      '<img class="editable-image" src="/o/custom-ckeditor/images/examples/cta1.jpg"/>' +
    '</div>' +
  '</div>';

  CKEDITOR.plugins.add( 'full-width-image', {
    requires: 'widget',
    init: function( editor ) {

      editor.ui.addButton( 'Full Width Image', {
        label: 'Add a full width image',
        command: 'full-width-image',
        toolbar: 'insert,5',
        icon: '/o/custom-ckeditor/images/icons/full-picture.png',
        iconHiDpi: '/o/custom-ckeditor/images/icons/full-picture@2x.png'
      });

      // https://docs.ckeditor.com/ckeditor4/latest/api/CKEDITOR_plugins_widget_definition.html
      editor.widgets.add( 'full-width-image', {
        template: this_template,

        editables: {
          picture: {
            selector: '.editable-image'
          }
        },

        upcast: function( element ) {
          return element.name == 'div' && element.hasClass( 'full-screen-picture' );
        }
      });
    }
  });
}