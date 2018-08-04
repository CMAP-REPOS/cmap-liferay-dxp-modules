
if(CKEDITOR.plugins.get('page-cards')){
	// ignore if the plugin is already registered 
} else {
  CKEDITOR.dialog.add( 'page-cards', '/o/custom-ckeditor/plugins/page-cards/dialogs/page-cards.js' );

  CKEDITOR.plugins.add( 'page-cards', {
    requires: 'widget',
    init: function( editor ) {

      editor.ui.addButton( 'Page Cards', {
        label: 'Add Page Cards',
        command: 'page-cards',
        toolbar: 'insert,3',
        icon: '/o/custom-ckeditor/plugins/page-cards/icons/page-cards.png',
        iconHiDpi: '/o/custom-ckeditor/plugins/page-cards/icons/page-cards@2x.png'
      });


      editor.widgets.add( 'page-card', {
        template: '<div class="page-card col-sm-8 col-xs-16">'+
          '<div class="top-content">'+
            '<img src="https://clarknelson.com/drop/Cook_116.jpg" />'+
          '</div>'+
          '<div class="bottom-content">'+
            '<div class="normal-headline">'+
              '<a href="https://google.com" target="_blank">This is the link text, double click to edit link location. Double click photo to change image.</a>'+
            '</div>'+
          '</div>'+
        '</div>',

        editables: {
          top: {
            selector: '.top-content'
          },
          bottom: {
            selector: '.bottom-content'
          }
        },

        upcast: function( element, data ) {
          console.log('page card upcast', element, data);
          return element.name == 'div' && element.hasClass( 'page-card' );
        },
      });

      // https://docs.ckeditor.com/ckeditor4/latest/api/CKEDITOR_plugins_widget_definition.html
      editor.widgets.add( 'page-cards', {
        dialog: 'page-cards',

        template: '<div class="page-cards"><div class="row"></div></div>',

        init: function(){
          console.log('init', CKEDITOR, this.isReady());
        },

        data: function() {
          console.log('data has changed', this.data.count);
        }
      });
    }
  });
}