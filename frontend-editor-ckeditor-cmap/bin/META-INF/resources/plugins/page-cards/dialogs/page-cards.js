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
                var element = CKEDITOR.dom.element.createFromHtml('<div class="page-card col-sm-8 col-xs-16">'+
                  '<div class="top-content">'+
                    '<img src="/o/custom-ckeditor/plugins/page-cards/images/DuPage_026.jpg" />'+
                  '</div>'+
                  '<div class="bottom-content">'+
                    '<div class="normal-headline">'+
                      '<a href="https://google.com" target="_blank">This is the link text, double click to edit link location. Double click photo to change image.</a>'+
                    '</div>'+
                  '</div>'+
                '</div>', editor.document );
                
                row.append(element);
                // var w = editor.widgets.initOn( element, 'page-card' );
                // editor.widgets.checkWidgets()
                // console.log(w);
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