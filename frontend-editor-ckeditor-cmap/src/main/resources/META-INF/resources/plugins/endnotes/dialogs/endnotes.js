CKEDITOR.dialog.add( 'endnotesDialog', function ( editor ) {
    return {
      title: 'Endnote Properties',
      minWidth: 340,
      minHeight: 200,
      contents: [
				{
          id: 'tab-basic',
          label: 'Glossary Term Settings',
          elements: [
            {
              type: 'text',
              id: 'term',
              label: 'Term',
              validate: CKEDITOR.dialog.validate.notEmpty( "Term field cannot be empty." ),
              setup: function(element) {
                this.setValue( element.getText() );
              },
              commit: function(element) {
                element.setText( this.getValue() );
              }
            },
            {
              type: 'text',
              id: 'definition',
              label: 'Definition',
              validate: CKEDITOR.dialog.validate.notEmpty( "Definition field cannot be empty." ),
              setup: function(element) {
                this.setValue( element.getAttribute("title") );
              },
              commit: function(element) {
                element.setAttribute("title", this.getValue() );
              }
            }
          ]
        }
      ],

      onShow: function(){
        var selection = editor.getSelection();
        var element = selection.getStartElement();

        if( element ){
          element = element.getAscendant('abbr', true);
        }

        if( !element || element.getName() != 'abbr' ){
          element = editor.document.createElement('abbr');
          this.insertMode = true;
        } else {
          this.insertMode = false;
        }

        this.element = element;
        if( !this.insertMode ){
          this.setupContent( this.element);
        }
      },
      
      onOk: function() {
        var dialog = this;
        var abbr = dialog.element;
        this.commitContent(abbr);

        if(this.insertMode){
          editor.insertElement(abbr);
        }
      }
    }
});