/* global React, ReactDOM AlloyEditor */

(function() {
        'use strict';

        var React = AlloyEditor.React;

        var YellSelectedTextButton = React.createClass(
                {
                        mixins: [AlloyEditor.ButtonStateClasses, AlloyEditor.ButtonKeystroke],

                        displayName: 'YellMyButton',

                        propTypes: {
                            /**
                             * The editor instance where the component is being used.
                             *
                             * @instance
                             * @memberof YellSelectedTextButton
                             * @property {Object} editor
                             */
                            editor: React.PropTypes.object.isRequired,
                            
                            /**
                             * The label that should be used for accessibility purposes.
                             *
                             * @instance
                             * @memberof YellSelectedTextButton
                             * @property {String} label
                             */
                            label: React.PropTypes.string,
                            
                            /**
                             * The tabIndex of the button in its toolbar current state. A value other than -1
                             * means that the button has focus and is the active element.
                             *
                             * @instance
                             * @memberof YellSelectedTextButton
                             * @property {Number} tabIndex
                             */
                            tabIndex: React.PropTypes.number
                        },

                        // Lifecycle. Provides static properties to the widget.
                        statics: {
                            /**
                             * The name which is used as an alias of the button in the configuration.
                             *
                             * @default yellSelectedText
                             * @memberof YellSelectedTextButton
                             * @property {String} key
                             * @static
                             */
                            key: 'yellSelectedText'
                        },
                        /**
                         * Lifecycle. Returns the default values of the properties used in the widget.
                         *
                         * @instance
                         * @memberof YellgSelectedTextButton
                         * @method getDefaultProps
                         * @return {Object} The default properties.
                         */
                        getDefaultProps: function() {
                            return {
                                command: '_yellText',
                                keystroke: {
                                    fn: '_yellText',
                                    keys: CKEDITOR.CTRL + CKEDITOR.SHIFT + 89 /*Y*/
                                }
                            };
                        },
                        /**
                         * Lifecycle. Renders the UI of the button.
                         *
                         * @method render
                         * @return {Object} The content which should be rendered.
                         */
                        render: function() {
                                var cssClass = 'ae-button ' + 
                                this.getStateClasses();
                                var svg = Liferay.Util.getLexiconIconTpl('user');

                                return (
                                        <button 
                                            className={cssClass} 
                                            onClick={this._yellText} 
                                            title="Yell the selected text in the console" 
                                            dangerouslySetInnerHTML={{__html: svg}}
                                        />
                                );
                        },

                        /**
                         * @protected
                         * @method  _yellText
                         */
                        _yellText: function() {
                        
                            var editor = this.props.editor.get('nativeEditor');
                            var selectedText = editor.getSelection().getSelectedText();
                            
                            console.log("YELLLLLLLLLLLLLLING SO LOUD!!!!!");
                        }
                }
        );

        AlloyEditor.Buttons[YellSelectedTextButton.key] = AlloyEditor.YellSelectedTextButton = YellSelectedTextButton;
}());