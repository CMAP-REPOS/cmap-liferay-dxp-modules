if(Object.keys(CKEDITOR.stylesSet.registered).includes('cmap_styles')){
	console.log('cmap_styles already registered, ignoring');
} else {
	// INLINE STYLES LIKE TEXT COLOR AND MARGINS
	// https://docs.ckeditor.com/ckeditor4/latest/guide/dev_styles.html
	CKEDITOR.stylesSet.add( 'cmap_styles', [
        { name: 'Large Paragraph', element: 'p', attributes: { 'class': 'presna-large' } },
        { name: 'Button', element: 'a', attributes: { 'href': '', 'class': 'button' } },
        { name: 'Alt Color', element: 'span', attributes: { 'class': 'alt-color' } },
        
        { name: 'Pseudo Headline 6', element: 'span', attributes: { 'class': 'whitney-small bold' } },
        { name: 'Pseudo Headline 5', element: 'span', attributes: { 'class': 'whitney-normal bold' } },
        { name: 'Pseudo Headline 4', element: 'span', attributes: { 'class': 'whitney-middle bold' } },
        { name: 'Pseudo Headline 3', element: 'span', attributes: { 'class': 'whitney-semi-large bold' } },
        { name: 'Pseudo Headline 2', element: 'span', attributes: { 'class': 'whitney-large bold' } },
        { name: 'Pseudo Headline 1', element: 'span', attributes: { 'class': 'whitney-huge bold' } },
        { name: 'Pseudo Jumbo Headline', element: 'span', attributes: { 'class': 'whitney-jumbo bold' } },
	]);
}