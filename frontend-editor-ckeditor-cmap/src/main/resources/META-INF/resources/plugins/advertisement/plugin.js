
if(CKEDITOR.plugins.get('advertisement')){
	// ignore if the plugin is already registered 
} else {
  CKEDITOR.dialog.add( 'advertisement', '/o/custom-ckeditor/plugins/advertisement/dialogs/advertisement.js' );

  CKEDITOR.plugins.add( 'advertisement', {
    requires: 'widget',
    init: function( editor ) {

      editor.ui.addButton( 'Advertisement', {
        label: 'Add a new advertisement',
        command: 'advertisement',
        toolbar: 'insert,2',
        icon: '/o/custom-ckeditor/plugins/advertisement/icons/advertisement.png',
        iconHiDpi: '/o/custom-ckeditor/plugins/advertisement/icons/advertisement@2x.png'
      });

      // https://docs.ckeditor.com/ckeditor4/latest/api/CKEDITOR_plugins_widget_definition.html
      editor.widgets.add( 'advertisement', {
        dialog: 'advertisement',
        template: '<div class="advertisement">'+
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
          '<div class="ad-background background">'+
            '<img src="https://clarknelson.com/drop/lazaro-advertisement-background.jpg" alt="This is the alt description for the advertisement term" />'+
          '</div>'+
          '<div class="widget-spacer"></div>'+
        '</div>',

        editables: {
          title: {
            selector: '.ad-title'
          },
          description: {
            selector: '.ad-description'
          },
          background:{
            selector: '.ad-background'
          }
        },

        upcast: function( element ) {
          return element.name == 'div' && element.hasClass( 'advertisement' );
        },
        init: function() {
          // console.log('init widget function', this);
          var width = this.element.getStyle( 'width' );
          if ( width )
              this.setData( 'width', width );
          if ( this.element.hasClass( 'align-left' ) )
              this.setData( 'align', 'left' );
          if ( this.element.hasClass( 'align-right' ) )
              this.setData( 'align', 'right' );
          if ( this.element.hasClass( 'align-center' ) )
              this.setData( 'align', 'center' );
        },

        data: function() {
          // console.log('data widget function', this);
          // console.log(this.element.find('.small-headline'));
          if ( this.data.width == '' ){
            this.element.removeStyle( 'width' );
          } else {
            this.element.setStyle( 'width', this.data.width );
          }
  
          this.element.removeClass( 'align-left' );
          this.element.removeClass( 'align-right' );
          this.element.removeClass( 'align-center' );
          if ( this.data.align )
            this.element.addClass( 'align-' + this.data.align );
        }
      });
    }
  });
}