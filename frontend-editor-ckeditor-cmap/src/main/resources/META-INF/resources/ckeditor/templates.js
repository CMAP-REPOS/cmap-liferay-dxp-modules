CKEDITOR.addTemplates( 'cmap', {
	imagesPath: '',
	templates: [
		{
			title: 'Glossary Term',
			description: 'Used to output a Glossary Term.',
			html: '<div class="glossary-term"><div class="term-name">Replace with glossary term name</div><div class="term-definition-container"><div class="term-definition">Replace with glossary term definition</div><div class="term-down-arrow"></div><svg class="term-close" width="20" height="20" viewBox="0 0 50 50"> <path d="M34.64,32.89L26.75,25l7.88-7.88c0.48-0.48,0.48-1.27,0-1.75c-0.48-0.48-1.27-0.48-1.75,0L25,23.25l-7.88-7.88 c-0.48-0.48-1.27-0.48-1.75,0c-0.48,0.48-0.48,1.27,0,1.75L23.25,25l-7.88,7.88c-0.48,0.48-0.48,1.27,0,1.75 C15.6,34.88,15.92,35,16.24,35s0.63-0.12,0.88-0.36L25,26.75l7.89,7.89c0.24,0.24,0.56,0.36,0.88,0.36c0.32,0,0.63-0.12,0.88-0.36 C35.12,34.15,35.12,33.37,34.64,32.89z"/></svg></div></div>'
		},
		{
			title: 'Center Column',
			description: 'Used to place centered content inside of a full width widget. Generates a grid with the center column at the correct size.',
			html: '<div class="inline-center-col row"><div class="col-md-4 col-sm-16"></div><div class="col-md-8 col-sm-16"><div class="normal-headline">Type your new headline here.</div><p>The colors will not show up on the live website, they are only there to show where the content goes.</p></div><div class="col-md-4 col-sm-16"></div></div>'
		},
		{
			title: 'Actions',
			description: 'Used to place centered content inside of a full width widget. Generates a grid with the center column at the correct size.',
			html: '<div class="onto2050-actions row"> <div class="col-sm-8"> <div class="normal-headline">Revisit parking requirements</div> <p>Municipalities should prioritize capital projects that enhance pedestrian and bicycle access to transit stations.</p> </div> <div class="col-sm-8"><div class="normal-headline">Revisit parking requirements</div> <p>Municipalities should prioritize capital projects that enhance pedestrian and bicycle access to transit stations.</p></div> </div>'
		},
		{
			title: 'Advertisement',
			description: 'A widget designed to point to another page. Should contain a picture, headline, description, and button.',
			html: '<div class="advertisement"><div class="row"><div class="col-md-offset-8 col-md-8 col-sm-offset-0 col-sm-12 col-xs-16"><div class="cmap-ad-content"><div class="small-headline">Topic</div><p>Here is where the content will go, you can delete this content or change it. If you wish to change the picture, double click on the bottom of the image.</p><a href="google.com" class="button">Double click to edit</a></div></div></div><img class="background" alt="This is the alt description for the advertisement term" src="https://clarknelson.com/drop/lazaro-advertisement-background.jpg" /><div class="widget-spacer"></div></div>'
		},
		{
			title: 'Page Cards (Single)',
			description: 'A widget designed to point to another page. Should contain an image above, and link to the page below.',
			html: '<div class="page-cards"><div class="row"><div class="page-card col-sm-8 col-xs-16"><div class="top"><img src="https://clarknelson.com/drop/Cook_116.jpg" /></div><div class="bottom"><div class="normal-headline"><a href="google.com" target="_blank">This is the link text, double click to edit link location. Double click photo to change image.</a></div></div></div></div></div>'
		},
		{
			title: 'Page Cards (Double)',
			description: 'Similar to previous page cards widget, but contains two blocks side-by-side.',
			html: '<div class="page-cards"><div class="row"><div class="page-card col-sm-8 col-xs-16"><div class="top"><img src="https://clarknelson.com/drop/Cook_116.jpg" /></div><div class="bottom"><div class="normal-headline"><a href="google.com" target="_blank">This is the link text, double click to edit link location. Double click photo to change image.</a></div></div></div><div class="page-card col-sm-8 col-xs-16"><div class="top"><img src="https://clarknelson.com/drop/Cook_116.jpg" /></div><div class="bottom"><div class="normal-headline"><a href="google.com" target="_blank">This is the link text, double click to edit link location. Double click photo to change image.</a></div></div></div></div></div>'
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