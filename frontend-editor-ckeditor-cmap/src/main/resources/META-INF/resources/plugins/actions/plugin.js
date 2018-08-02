
if(CKEDITOR.plugins.get('actions')){
	// ignore if the plugin is already registered 
} else {
  CKEDITOR.plugins.add( 'actions', {
    requires: 'widget',
    init: function( editor ) {
      console.log(editor);

      editor.ui.addButton( 'Actions', {
        label: 'Add new action item',
        command: 'actions',
        toolbar: 'insert,1',
        icon: '/o/custom-ckeditor/plugins/actions/icons/actions.png',
        iconHiDpi: '/o/custom-ckeditor/plugins/actions/icons/actions@2x.png'
      });

      // https://docs.ckeditor.com/ckeditor4/latest/api/CKEDITOR_plugins_widget_definition.html
      editor.widgets.add( 'actions', {

        template:
        '<div class="simplebox">' +
            '<h2 class="simplebox-title">Title</h2>' +
            '<div class="simplebox-content"><p>Content...</p></div>' +
        '</div>'
      });
    }
  });
}