/* global React, ReactDOM AlloyEditor */

(function() {
        'use strict';

        var React = AlloyEditor.React;

        var CenteredColumnButton = React.createClass(
        	{
	        	mixins: [AlloyEditor.ButtonStateClasses, AlloyEditor.ButtonKeystroke],

	        	displayName: "CenteredColumnButton",

	        	propTypes: {
				    editor: React.PropTypes.object.isRequired,
				    label: React.PropTypes.string,
				    tabIndex: React.PropTypes.number
				},

				statics: {

				    key: 'centeredColumnButton'
				},

	            getDefaultProps: function() {
	                return {
	                    command: '_createCenteredColumn',
	                    keystroke: {
	                        fn: '_createCenteredColumn',
	                        keys: CKEDITOR.CTRL + CKEDITOR.SHIFT + 89 /*Y*/
	                    }
	                };
	            },

	            getInitialState: function () {
	            	return {
	            		show: false,
	            		actions: 1
	            	}
	            },
	            
                // Aqui se entra cuando le das click al boton de ADD TOOLBAR
				render: function() {
			        var cssClass = 'ae-button ' + this.getStateClasses();
			        var svg = Liferay.Util.getLexiconIconTpl('desktop');

			        return (
		                <button
		                    className={cssClass}
		                    onClick={this._createCenteredColumn}
		                    title="Create a Centered Column"
		                    dangerouslySetInnerHTML={{__html: svg}}
		                />
			        );

				},

				 // Esto es lo que pasa cuando le picas al boton
				_createCenteredColumn: function() {
					console.log("ALEJATE DE MI");

					console.log(this);

					console.log(CKEDITOR.config);
				   	// this tiene:
				   	// props y state
				   	let editorInstance = this.props.editor._editor;

			   		var element = CKEDITOR.dom.element
			   	 	.createFromHtml(
			   	 		'<div class="inline-center-col row">&nbsp'+
				        	'<div class="col-md-4 col-sm-16"></div>'+
				        	'<div class="col-md-8 col-sm-16">'+
				        		'<div class="normal-headline">Type your new headline here.</div>'+
				            '<p>The colors will not show up on the live website, they are only there to show where the content goes.</p>'+
				        	'</div>'+
				        	'<div class="col-md-4 col-sm-16"></div>'+
				        '</div>', editorInstance.document );

              		editorInstance.container.appendHtml(element.getHtml());		
  				}
		    }
	    );

    AlloyEditor.Buttons[CenteredColumnButton.key] = AlloyEditor.CenteredColumnButton = CenteredColumnButton;

}());