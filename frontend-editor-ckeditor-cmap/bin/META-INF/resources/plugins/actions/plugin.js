
if(CKEDITOR.plugins.get('actions')){
	// ignore if the plugin is already registered 
} else {
  CKEDITOR.plugins.add( 'actions', {
    requires: 'widget',
    icons: 'actions',
    init: function( editor ) {
      console.log(editor);
      editor.widgets.add( 'actions', {
        button: 'Create an action item'
      });
    }
  });
}