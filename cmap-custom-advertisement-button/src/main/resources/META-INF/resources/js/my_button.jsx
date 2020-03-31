/* global React, ReactDOM AlloyEditor */

(function() {
        'use strict';

        var React = AlloyEditor.React;

        var AdvertisementButton = React.createClass(
        	{
	        	mixins: [AlloyEditor.ButtonStateClasses, AlloyEditor.ButtonKeystroke],

	        	displayName: "AdvertisementButton",

	        	propTypes: {
				    editor: React.PropTypes.object.isRequired,
				    label: React.PropTypes.string,
				    tabIndex: React.PropTypes.number
				},

				statics: {

				    key: 'advertisementButton'
				},

	            getDefaultProps: function() {
	                return {
	                    command: '_createAdvertisement',
	                    keystroke: {
	                        fn: '_createAdvertisement',
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
			        var svg = Liferay.Util.getLexiconIconTpl('community');

			        return (
		                <button
		                    className={cssClass}
		                    onClick={this._createAdvertisement}
		                    title="Create an Advertisement"
		                    dangerouslySetInnerHTML={{__html: svg}}
		                />
			        );

				},

				 // Esto es lo que pasa cuando le picas al boton
				_createAdvertisement: function() {
					console.log("Lol");

					console.log(this);

					console.log(CKEDITOR.config);
				   	// this tiene:
				   	// props y state
				   	let editorInstance = this.props.editor._editor;

			   		var element = CKEDITOR.dom.element
			   	 	.createFromHtml(
			   	 		'<div class="advertisement">'+
				          '<div class="row">'+
				            '<div class="col-md-offset-8 col-md-8 col-sm-offset-0 col-sm-12 col-xs-16">'+
				              '<div class="cmap-ad-content">'+
				                '<div class="ad-title small-headline">Topic</div>'+
				                '<div class="ad-description">'+
				                  '<p>Here is where the content will go, you can delete this content or change it. If you wish to change the picture, double click on the bottom of the image.</p>'+
				                  '<a href="https://google.com" class="button margin-top-small">Double click to edit</a>'+
				                '</div>'+
				              '</div>'+
				            '</div>'+
				          '</div>'+
				          '<div class="background">'+
				            '<img src="/o/cmap-custom-advertisement-button/cta2.png" alt="This is the alt description for the advertisement term" />'+ 
				          '</div>'+
				          '<div class="widget-spacer"></div>'+
				        '</div>', editorInstance.document );

              		editorInstance.container.appendHtml(element.getHtml());		
  				}
		    }
	    );

    AlloyEditor.Buttons[AdvertisementButton.key] = AlloyEditor.AdvertisementButton = AdvertisementButton;

}());