/* global React, ReactDOM AlloyEditor */

(function() {
    'use strict';

    var React = AlloyEditor.React;

    var ButtonMyButton = React.createClass(
        {
            mixins: [AlloyEditor.ButtonStateClasses],

            displayName: 'ButtonMyButton',

            propTypes: {
                editor: React.PropTypes.object.isRequired
            },

            statics: {
                key: 'myButton'
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

                return (
                    <button className={cssClass}
                            onClick={this._requestExclusive}
                            tabIndex={this.props.tabIndex}>
                        <small className="ae-icon small">
                            Alt
                        </small>
                    </button>
                );
            },

            /**
             * @protected
             * @method  _doSomething
             * @param {MouseEvent} event
             */
            _doSomething: function(event) {
                console.log('do something!');
            }
        }
    );

    AlloyEditor.Buttons[ButtonMyButton.key] = AlloyEditor.ButtonMyButton
        = ButtonMyButton;
}());