CKEDITOR.addTemplates( 'cmap', {
	imagesPath: '',
	templates: [
		{
			title: 'Glossary Term',
			description: 'Used to output a Glossary Term.',
			html: '<div class="glossary-term"><div class="term-name">Replace with glossary term name</div><div class="term-definition-container"><div class="term-definition">Replace with glossary term definition</div><div class="term-down-arrow"></div><svg class="term-close" width="20" height="20" viewBox="0 0 50 50"> <path d="M34.64,32.89L26.75,25l7.88-7.88c0.48-0.48,0.48-1.27,0-1.75c-0.48-0.48-1.27-0.48-1.75,0L25,23.25l-7.88-7.88 c-0.48-0.48-1.27-0.48-1.75,0c-0.48,0.48-0.48,1.27,0,1.75L23.25,25l-7.88,7.88c-0.48,0.48-0.48,1.27,0,1.75 C15.6,34.88,15.92,35,16.24,35s0.63-0.12,0.88-0.36L25,26.75l7.89,7.89c0.24,0.24,0.56,0.36,0.88,0.36c0.32,0,0.63-0.12,0.88-0.36 C35.12,34.15,35.12,33.37,34.64,32.89z"/></svg></div></div>'
		},
		{
			title: 'Ad Grid (Single)',
			description: 'Similar to advertisement, but in a grid.',
			html: '<div class="ad-grid"><div class="row"> <div class="left advertisement"><div class="col-md-offset-8 col-md-8 col-sm-offset-0 col-sm-12 col-xs-16"><div class="cmap-ad-content"><div class="normal-headline">Headline</div><p>Here is where the content will go, you can delete this content or change it. If you wish to change the picture, double click on the bottom of the image</p><a href="" class="button">View Page</a></div></div><img class="background" alt="This is the alt description for the advertisement term" src="https://clarknelson.com/drop/lazaro-advertisement-background.jpg" /><div class="widget-spacer"></div></div> </div></div>'
		},
		{
			title: 'Ad Grid (Double)',
			description: 'Similar to advertisement, but in a grid.',
			html: '<div class="ad-grid"><div class="row"> <div class="left advertisement"><div class="col-md-offset-8 col-md-8 col-sm-offset-0 col-sm-12 col-xs-16"><div class="cmap-ad-content"><div class="normal-headline">Headline</div><p>Here is where the content will go, you can delete this content or change it. If you wish to change the picture, double click on the bottom of the image.</p><a href="" class="button">View Page</a></div></div><img class="background" alt="This is the alt description for the advertisement term" src="https://clarknelson.com/drop/lazaro-advertisement-background.jpg" /><div class="widget-spacer"></div></div> <div class="right advertisement"><div class="col-md-offset-8 col-md-8 col-sm-offset-0 col-sm-12 col-xs-16"><div class="cmap-ad-content"><div class="normal-headline">Headline</div><p>Here is where the content will go, you can delete this content or change it. If you wish to change the picture, double click on the bottom of the image.</p><a href="" class="button">View Page</a></div></div><img class="background" alt="This is the alt description for the advertisement term" src="https://clarknelson.com/drop/lazaro-advertisement-background.jpg" /><div class="widget-spacer"></div></div></div></div>'
		}
	]
});