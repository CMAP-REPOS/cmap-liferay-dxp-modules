/* global React, ReactDOM AlloyEditor */

import ClayModal from 'clay-modal';

(function() {
        'use strict';

        var React = AlloyEditor.React;

        var PageCardsButton = React.createClass(
            {
                mixins: [AlloyEditor.ButtonStateClasses, AlloyEditor.ButtonKeystroke],

                displayName: "PageCardsButton",

                propTypes: {
                    editor: React.PropTypes.object.isRequired,
                    label: React.PropTypes.string,
                    tabIndex: React.PropTypes.number
                },

                statics: {

                    key: 'pageCardsButton'
                },

                getDefaultProps: function() {
                    return {
                        command: '_createPageCards',
                        keystroke: {
                            fn: '_createPageCardss',
                            keys: CKEDITOR.CTRL + CKEDITOR.SHIFT + 89 /*Y*/
                        }
                    };
                },

                getInitialState: function () {
                    return {
                        pageCards: 0
                    }
                },
                
                // Aqui se entra cuando le das click al boton de ADD TOOLBAR
                render: function() {
                    var cssClass = 'ae-button ' + this.getStateClasses();
                    var svg = Liferay.Util.getLexiconIconTpl('plus-squares');

                    return (
                        <button
                            className={cssClass}
                            onClick={this._createPageCards}
                            title="Insert Page Cards"
                            dangerouslySetInnerHTML={{__html: svg}}
                        />
                    );

                },

                 // Esto es lo que pasa cuando le picas al boton
                _createPageCards: function() {
                    console.log("How are you?");

                    this.state.pageCards = window.prompt("How many page cards do you want?");

                    console.log(CKEDITOR.config);

                    console.log(this);
                    // this tiene:
                    // props y state
                    let editorInstance = this.props.editor;
                    let numberOfPageCards = this.state.pageCards;

                    var container = CKEDITOR.dom.element
                    .createFromHtml('<div><div class="page-cards cmap-custom-page-card-button"><div class="row"></div></div></div>', editorInstance._editor.document );

                    editorInstance._editor.container.appendHtml(container.getHtml());

                    for (var i = 0; i < numberOfPageCards; i++) {
                        var element = CKEDITOR.dom.element
                            .createFromHtml(
                                '<div class="page-card col-sm-8 col-xs-16">'+
                                    '<div class="top-content">'+
                                      '<img src="o/cmap-custom-page-card-button/img/pagecards.jpg" />'+
                                    '</div>'+
                                    '<div class="bottom-content">'+
                                      '<div class="normal-headline">'+
                                        '<a href="https://cmap.illinois.gov" target="_blank">This is the link text, double click to edit link location. Double click photo to change image.</a>'+
                                      '</div>'+
                                    '</div>'+
                                  '</div>', editorInstance._editor.document );

                        document.getElementsByClassName('page-cards')[0].insertAdjacentHTML("beforeend", element.getHtml());
                    }
                    
                }
            }
        );

    AlloyEditor.Buttons[PageCardsButton.key] = AlloyEditor.PageCardsButton = PageCardsButton;

}());