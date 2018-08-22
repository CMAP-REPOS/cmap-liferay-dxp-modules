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
                var element = CKEDITOR.dom.element.createFromHtml('<div class="related-recommendation">'+
                  '<a class="normal-headline" href="https://google.com">Double click to edit link text and URL</a>' +
                '</div>', editor.document );
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