if(Object.keys(CKEDITOR.stylesSet.registered).includes('cmap_styles')){
	console.log('cmap_styles already registered, ignoring');
} else {
	// INLINE STYLES LIKE TEXT COLOR AND MARGINS
	// https://docs.ckeditor.com/ckeditor4/latest/guide/dev_styles.html
	CKEDITOR.stylesSet.add( 'cmap_styles', [
    { name: 'Large Paragraph', element: 'p', attributes: { 'class': 'presna-large' } },
    { name: 'Button', element: 'a', attributes: { 'href': '', 'class': 'button' } },
    { name: 'Alt Color', element: 'span', attributes: { 'class': 'alt-color' } },
	]);
}