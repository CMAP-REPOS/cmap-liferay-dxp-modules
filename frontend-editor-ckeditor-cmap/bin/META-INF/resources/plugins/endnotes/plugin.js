CKEDITOR.dtd.$editable['abbr'] = 1;
CKEDITOR.dtd.$editable['svg'] = 1;

if(CKEDITOR.plugins.get('endnotes')){
	// ignore if the plugin is already registered 
} else {

	CKEDITOR.plugins.add( 'endnotes', {
		icons: 'endnotes',
		requires: 'widget',
		init: function( editor ) {

      editor.addCommand( 'endnotes', new CKEDITOR.dialogCommand( 'endnotesDialog' ) );
      
			editor.ui.addButton( 'Endnotes', {
		    label: 'Insert Endnote',
		    command: 'endnotes',
		    toolbar: 'links'
      });
      
      if(editor.contextMenu){

				editor.addMenuGroup( 'abbrGroup' );

				editor.addMenuItem( 'abbrItem', {
	        label: 'Edit Abbreviation',
	        icon: this.path + 'icons/endnotes.png',
	        command: 'endnotes',
	        group: 'abbrGroup'
        });

				editor.contextMenu.addListener( function( element ) {
	   			console.log('editor opened', element);
	   			console.log(element.getAscendant( 'abbr', true ));

	        if(element.getAscendant( 'abbr', true )){
	        	return { abbrItem: CKEDITOR.TRISTATE_OFF };
	        }
	    	});
			}

			// editor.widgets.add('simplebox', {
			// 	button: 'Create a simple box',
			// 	template:
			// 	'<div class="simplebox"><h2 class="simplebox-title">Title</h2><div class="simplebox-content"><p>Content...</p></div></div>',
	    //   editables: {
	    //     title: {
			// 		  selector: '.simplebox-title'
			// 	  },
	    //     content: {
	    //       selector: '.simplebox-content'
	    //     }
	    // 	},
	    // 	upcast: function( element ) {
			// 		if(element.hasClass( 'simplebox' )){
			// 			return true;
			// 		}
	    // 	}
			// });

			// editor.widgets.add('endnote', {
			// 	button: 'Create an endnote',
			// 	editables: {
			// 		term: {
			// 			selector: '.term-name'
			// 		},
			// 		definition: {
			// 			selector: '.term-definition'
      //     }
      //   },
      //   template: '<div class="glossary-term"><div class="term-name">Replace with glossary term name</div><div class="term-definition-container"><div class="term-definition">Replace with glossary term definition</div><div class="term-down-arrow">&nbsp;</div><svg class="term-close" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" width="50" height="50" viewBox="0 0 50 50" style="enable-background:new 0 0 50 50;" xml:space="preserve"><path d="M34.64,32.89L26.75,25l7.88-7.88c0.48-0.48,0.48-1.27,0-1.75c-0.48-0.48-1.27-0.48-1.75,0L25,23.25l-7.88-7.88 c-0.48-0.48-1.27-0.48-1.75,0c-0.48,0.48-0.48,1.27,0,1.75L23.25,25l-7.88,7.88c-0.48,0.48-0.48,1.27,0,1.75 C15.6,34.88,15.92,35,16.24,35s0.63-0.12,0.88-0.36L25,26.75l7.89,7.89c0.24,0.24,0.56,0.36,0.88,0.36c0.32,0,0.63-0.12,0.88-0.36 C35.12,34.15,35.12,33.37,34.64,32.89z"/></svg></div></div>',
      //   init: function(element) {
      //     alert(CKEDITOR.version);
      //     console.log(this, element);
      //   },
			// 	upcast: function( element ) {
      //     console.log(element.hasClass( 'glossary-term' ));
			// 		return element.hasClass( 'glossary-term' );
			// 	}
			// });
		}
	});

}

