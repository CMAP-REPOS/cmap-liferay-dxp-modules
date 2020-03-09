/* global React, ReactDOM AlloyEditor */

(function() {
        'use strict';

        var React = AlloyEditor.React;

        var ActionButton = React.createClass(
        	{
	        	mixins: [AlloyEditor.ButtonStateClasses, AlloyEditor.ButtonKeystroke],

	        	displayName: "ActionButton",

	        	propTypes: {
				    /**
				     * The editor instance where the component is being used.
				     *
				     * @instance
				     * @memberof ActionButton
				     * @property {Object} editor
				     */
				    editor: React.PropTypes.object.isRequired,

				    /**
				     * The label that should be used for accessibility purposes.
				     *
				     * @instance
				     * @memberof ActionButton
				     * @property {String} label
				     */
				    label: React.PropTypes.string,

				    /**
				     * The tabIndex of the button in its toolbar current state. A value other than -1
				     * means that the button has focus and is the active element.
				     *
				     * @instance
				     * @memberof ActionButton
				     * @property {Number} tabIndex
				     */
				    tabIndex: React.PropTypes.number
				},

				// Lifecycle. Provides static properties to the widget.
				statics: {
				    /**
				     * The name which is used as an alias of the button in the configuration.
				     *
				     * @default actionButton
				     * @memberof ActionButton
				     * @property {String} key
				     * @static
				     */
				    key: 'actionButton'
				},
				/**
	             * Lifecycle. Returns the default values of the properties used in the widget.
	             *
	             * @instance
	             * @memberof ActionButton
	             * @method getDefaultProps
	             * @return {Object} The default properties.
	             */
	            getDefaultProps: function() {
	                return {
	                    command: '_createActions',
	                    keystroke: {
	                        fn: '_createActions',
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
			        var svg = Liferay.Util.getLexiconIconTpl('desktop');

			        return (
			                <button
			                    className={cssClass}
			                    onClick={this._createActions}
			                    title="Log the selected text in the console"
			                    dangerouslySetInnerHTML={{__html: svg}}
			                />
			        );
				},
				/**
				 * @protected
				 * @method  _createActions
				 */
				_createActions: function() {
				    console.log("Why am i here");
				    // var numberOfActions = prompt("How many actions do you want?", "1");
				    // while ( confirm("Do you want " + numberOfActions + "?") !== true ) {
				    // 	numberOfActions = prompt("How many actions do you want?", "1");
				    // }
				    // console.log(numberOfActions);
				}
		    }
	    );

    AlloyEditor.Buttons[ActionButton.key] = AlloyEditor.ActionButton = ActionButton;

}());