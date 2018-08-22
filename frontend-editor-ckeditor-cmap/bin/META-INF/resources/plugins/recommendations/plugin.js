
if(CKEDITOR.plugins.get('recommendations')){
	// ignore if the plugin is already registered 
} else {
  CKEDITOR.dialog.add( 'recommendations', '/o/custom-ckeditor/plugins/recommendations/dialogs/recommendation.js' );

  CKEDITOR.plugins.add( 'recommendations', {
    requires: 'widget',
    init: function( editor ) {

      editor.ui.addButton( 'Related Recommendations', {
        label: 'Add Related Recommendations',
        command: 'recommendations',
        toolbar: 'insert,4',
        icon: '/o/custom-ckeditor/plugins/recommendations/icons/recommendations.png',
        iconHiDpi: '/o/custom-ckeditor/plugins/recommendations/icons/recommendations@2x.png'
      });


      editor.widgets.add( 'recommendation', {
        template: '<div class="related-recommendation">'+
          '<a class="normal-headline" href="https://google.com">Double click to edit link text and URL</a>' +
        '</div>',

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