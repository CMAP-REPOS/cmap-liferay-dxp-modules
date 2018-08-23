
if(CKEDITOR.plugins.get('page-cards')){
	// ignore if the plugin is already registered 
} else {

  var page_card_template = '<div class="page-card col-sm-8 col-xs-16">'+
    '<div class="top-content">'+
      '<img src="/o/custom-ckeditor/images/examples/pagecards.jpg" />'+
    '</div>'+
    '<div class="bottom-content">'+
      '<div class="normal-headline">'+
        '<a href="https://google.com" target="_blank">This is the link text, double click to edit link location. Double click photo to change image.</a>'+
      '</div>'+
    '</div>'+
  '</div>';

  CKEDITOR.dialog.add( 'page-cards', function( editor ) {
    return {
      title: 'Edit Page Card Grid',
      minWidth: 200,
      minHeight: 100,
      contents: [
        {
          id: 'info',
          elements: [
            {
              id: 'count',
              type: 'text',
              label: 'Number of items',
              
              setup: function( widget ) {
                this.setValue( widget.element.data('count') );
              },
              commit: function( widget ) {
  
                // https://ckeditor.com/old/forums/CKEditor/help-Inserting-a-widget-from-my-own-button
                // https://stackoverflow.com/questions/20237845/ckeditor-initialize-widget-added-with-insertelement?rq=1
                var row = widget.element.findOne('.row');
                for(var i=0; i<this.getValue(); i++){  
                  var element = CKEDITOR.dom.element.createFromHtml(page_card_template, editor.document );
                  row.append(element);
                }
                editor.widgets.checkWidgets()
                widget.element.data('count', this.getValue());
              }
            }
          ]
        }
      ]
    };
  });
  
  CKEDITOR.plugins.add( 'page-cards', {
    requires: 'widget',
    init: function( editor ) {

      editor.ui.addButton( 'Page Cards', {
        label: 'Add Page Cards',
        command: 'page-cards',
        toolbar: 'insert,3',
        icon: '/o/custom-ckeditor/images/icons/page-cards.png',
        iconHiDpi: '/o/custom-ckeditor/images/icons/page-cards@2x.png'
      });


      editor.widgets.add( 'page-card', {
        template: page_card_template,

        editables: {
          top: {
            selector: '.top-content'
          },
          bottom: {
            selector: '.bottom-content'
          }
        },

        upcast: function( element, data ) {
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