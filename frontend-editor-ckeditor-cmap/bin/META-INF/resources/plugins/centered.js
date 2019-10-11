
if(CKEDITOR.plugins.get('centered-content')){
	// ignore if the plugin is already registered 
} else {


  CKEDITOR.plugins.add( 'centered-content', {
    requires: 'widget',
    init: function( editor ) {

      editor.ui.addButton( 'Centered', {
        label: 'Add a center column',
        command: 'centered',
        toolbar: 'insert,2',
        icon: '/o/custom-ckeditor/images/icons/centered.png',
        iconHiDpi: '/o/custom-ckeditor/images/icons/centered@2x.png'
      });

      // https://docs.ckeditor.com/ckeditor4/latest/api/CKEDITOR_plugins_widget_definition.html
      editor.widgets.add( 'centered', {
        template: '<div class="inline-center-col row">'+
          '<div class="col-md-4 col-sm-16"></div>'+
          '<div class="col-md-8 col-sm-16">'+
            '<div class="normal-headline">Type your new headline here.</div>'+
            '<p>The colors will not show up on the live website, they are only there to show where the content goes.</p>'+
          '</div>'+
          '<div class="col-md-4 col-sm-16"></div>'+
        '</div>',

        
        editables: {
          content: {
            selector: '.col-md-8'
          }
        },

        upcast: function( element ) {
          return element.name == 'div' && element.hasClass( 'inline-center-col' );
        }
      });
    }
  });
}