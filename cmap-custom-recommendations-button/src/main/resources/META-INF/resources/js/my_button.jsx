/* global React, ReactDOM AlloyEditor */

(function() {
        'use strict';

        var React = AlloyEditor.React;

        var RecommendationsButton = React.createClass(
        	{
	        	mixins: [AlloyEditor.ButtonStateClasses, AlloyEditor.ButtonKeystroke],

	        	displayName: "RecommendationsButton",

	        	propTypes: {
				    editor: React.PropTypes.object.isRequired,
				    label: React.PropTypes.string,
				    tabIndex: React.PropTypes.number
				},

				statics: {

				    key: 'recommendationsButton'
				},

	            getDefaultProps: function() {
	                return {
	                    command: '_createRecommendations',
	                    keystroke: {
	                        fn: '_createRecommendationss',
	                        keys: CKEDITOR.CTRL + CKEDITOR.SHIFT + 89 /*Y*/
	                    }
	                };
	            },

	            getInitialState: function () {
	            	return {
	            		show: false,
	            		recommendations: 1
	            	}
	            },
	            
                // Aqui se entra cuando le das click al boton de ADD TOOLBAR
				render: function() {
			        var cssClass = 'ae-button ' + this.getStateClasses();
			        var svg = Liferay.Util.getLexiconIconTpl('desktop');

			        return (
		                <button
		                    className={cssClass}
		                    onClick={this._createRecommendations}
		                    title="Log the selected text in the console"
		                    dangerouslySetInnerHTML={{__html: svg}}
		                />
			        );

				},

				 // Esto es lo que pasa cuando le picas al boton
				_createRecommendations: function() {
					console.log("Hey BITCH");

					this.state.recommendations = window.prompt("How many recommendations do you want?");

					console.log(CKEDITOR.config);

					console.log(this);
				   	// this tiene:
				   	// props y state
				   	let editorInstance = this.props.editor;
				   	let numberOfRecommendations = this.state.recommendations;

			   		var container = CKEDITOR.dom.element
			   	 	.createFromHtml(
			   	 		'<div class="related-recommendations">'+
				          '<div class="normal-headline">Recommendations</div>'+
				          '<div class="recommendation-container"></div>'+
				        '</div>', editorInstance._editor.document );

              		editorInstance._editor.container.appendHtml(container.getHtml());

                  	for (var i = 0; i < numberOfRecommendations; i++) {
                  		var element = CKEDITOR.dom.element
			   	 			.createFromHtml(
		                  		'<div class="related-recommendation">'+
		    						'<a class="normal-headline" href="https://google.com">Double click to edit link text and URL</a>' +
		  						'</div><br />', editorInstance._editor.document );

			   	 		document.getElementsByClassName('recommendation-container')[0].insertAdjacentHTML("beforeend", element.getHtml());
				   	}
				   	
				}
		    }
	    );

    AlloyEditor.Buttons[RecommendationsButton.key] = AlloyEditor.RecommendationsButton = RecommendationsButton;

}());