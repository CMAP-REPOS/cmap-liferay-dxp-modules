
if(CKEDITOR.plugins.get('endnotes')){
	// ignore if the plugin is already registered 
} else {

  function check_is_endnote(el){
    return el.getAscendant( function(element){
      if(typeof element.hasClass !== "undefined"){
        return element.hasClass('onto2050-endnote');
      } else {
        return false;
      }
    }, true );
  }
  CKEDITOR.plugins.add( 'endnotes', {
    requires: 'widget',

    init: function( editor ) {

      editor.ui.addButton( 'Endnotes', {
        label: 'Add an endnote',
        command: 'editEndnote',
        toolbar: 'links,4',
        icon: '/o/custom-ckeditor/images/icons/endnotes.png',
        iconHiDpi: '/o/custom-ckeditor/images/icons/endnotes@2x.png'
      });

      editor.addCommand( "deleteEndnote", {
        exec : function( editor ){
          var confirm = window.confirm('Are you sure you would like to remove this endnote?');
          if(confirm){
            var selection = editor.getSelection();
            var element = selection.getStartElement();
  
            if ( element ){
              element = check_is_endnote(element)
            }
            element.remove(true);
          }
        }
      });

      editor.addCommand( 'editEndnote', new CKEDITOR.dialogCommand( 'endnoteDialog' ) );

      CKEDITOR.dialog.add( 'endnoteDialog', function ( editor ) {
        var dialog_definition = {
          title: 'Endnote Properties',
          minWidth: 400,
          minHeight: 200,

          contents: [
            {
              id: 'first',
              label: 'Endnote Settings',
              elements: [
                {
                  type: 'text',
                  id: 'factoid',
                  label: 'Factoid',
                  validate: CKEDITOR.dialog.validate.notEmpty( "Inline reference cannot be empty." ),
                  setup: function( element ) {
                    this.setValue( element.getText() );
                  },
                  commit: function( element ) {
                    element.setText( this.getValue() );
                  }
                },
                {
                  type: 'text',
                  id: 'endnote_page',
                  label: 'Endnote Page',
                  validate: CKEDITOR.dialog.validate.notEmpty( "Endnote page location cannot be empty." ),
                  setup: function( element ) {
                    this.setValue( element.getAttribute( "endnote-page" ) );
                  },
                  commit: function( element ) {
                    element.setAttribute( "endnote-page", this.getValue() );
                  },
                  'default': '/2050/endnotes/example'
                },
                {
                  type: 'textarea',
                  id: 'reference',
                  label: 'Reference',
                  validate: CKEDITOR.dialog.validate.notEmpty( "Reference field cannot be empty." ),
                  setup: function( element ) {
                    this.setValue( element.getAttribute( "reference" ) );
                  },
                  commit: function( element ) {
                    element.setAttribute( "reference", this.getValue() );
                  }
                }
              ]
            }
          ],

          onShow: function() {

            var selection = editor.getSelection();
            var element = selection.getStartElement();

            if ( element ){
              element = check_is_endnote(element);
            }

            if ( !element ) {
              element = editor.document.createElement( 'span' );
              element.addClass('onto2050-endnote');
              element.setText(selection.getSelectedText());
              this.insertMode = true;
            } else {
              this.insertMode = false;
            }

            this.element = element;

            this.setupContent( this.element );
          },

          onOk: function() {
            var endnote = this.element;
            this.commitContent( endnote );

            if ( this.insertMode )
              editor.insertElement( endnote );
          }
        };

        return dialog_definition;
      });

      if ( editor.contextMenu ) {
        editor.addMenuGroup( 'endnoteGroup' );

        editor.addMenuItem( 'endnoteEdit', {
          label: 'Edit Endnote',
          icon: '/o/custom-ckeditor/images/icons/endnotes.png',
          command: 'editEndnote',
          group: 'endnoteGroup'
        });
        editor.addMenuItem( 'endnoteDelete', {
          label: 'Remove Endnote',
          icon: '/o/custom-ckeditor/images/icons/endnotes.png',
          command: 'deleteEndnote',
          group: 'endnoteGroup'
        });

        editor.contextMenu.addListener( function( element ) {
          var isEndnoteActive = check_is_endnote(element);
          if (isEndnoteActive) {
            return { 
              endnoteEdit: CKEDITOR.TRISTATE_OFF ,
              endnoteDelete: CKEDITOR.TRISTATE_OFF
            };
          }
        });
      }

    } // ends endnote plugin init
  });
}