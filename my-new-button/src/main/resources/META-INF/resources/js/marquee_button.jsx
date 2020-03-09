/* global React, ReactDOM AlloyEditor */

(function() {
        'use strict';

        // Use the built-in version of React if your site does not use React
        var React = AlloyEditor.React;

        var ButtonMarquee = React.createClass({
            mixins: [AlloyEditor.ButtonStyle, AlloyEditor.ButtonStateClasses, AlloyEditor.ButtonActionStyle],

            propTypes: {
                editor: React.PropTypes.object.isRequired
            },

            getDefaultProps: function() {
                return {
                    style: {
                        element: 'marquee'
                    }
                };
            },

            statics: {
                key: 'marquee'
            },

            render: function() {
                var cssClass = 'ae-button ' + this.getStateClasses();

                return (
                    <button className={cssClass} data-type="button-marquee" onClick={this.applyStyle} tabIndex={this.props.tabIndex}>
                        <span className="ae-icon-separator"></span>
                    </button>
                );
            }
        });

    AlloyEditor.Buttons[ButtonMarquee.key] = AlloyEditor.ButtonMarquee = ButtonMarquee;

}());