
if(CKEDITOR.plugins.get('recommendations')){
	// ignore if the plugin is already registered 
} else {

  var recommendation_template = '<div class="related-recommendation">'+
    '<a class="normal-headline" href="https://google.com">Double click to edit link text and URL</a>' +
  '</div>';

  CKEDITOR.dialog.add( 'recommendations', function( editor ) {
    return {
      title: 'Edit Related Recommendations',
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
                var row = widget.element.findOne('.recommendation-container');
                for(var i=0; i<this.getValue(); i++){  
                  var element = CKEDITOR.dom.element.createFromHtml(recommendation_template, editor.document );
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

  CKEDITOR.plugins.add( 'recommendations', {
    requires: 'widget',
    init: function( editor ) {

      editor.ui.addButton( 'Related Recommendations', {
        label: 'Add Related Recommendations',
        command: 'recommendations',
        toolbar: 'insert,4',
        icon: '/o/custom-ckeditor/images/icons/recommendations.png',
        iconHiDpi: '/o/custom-ckeditor/images/icons/recommendations@2x.png'
      });


      editor.widgets.add( 'recommendation', {
        template: recommendation_template,

        editables: {
          content: {
            selector: '.related-recommendation'
          }
        },

        upcast: function( element, data ) {
          return element.name == 'div' && element.hasClass( 'related-recommendation' );
        },
      });

      // https://docs.ckeditor.com/ckeditor4/latest/api/CKEDITOR_plugins_widget_definition.html
      editor.widgets.add( 'recommendations', {
        dialog: 'recommendations',

        template: '<div class="related-recommendations">'+
          '<div class="normal-headline">Recommendations</div>'+
          '<div class="recommendation-container"></div>'+
        '</div>',

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