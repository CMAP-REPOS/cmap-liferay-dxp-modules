
CKEDITOR.editorConfig = function( config ) {
  config.bodyId = "cmap-ckeditor";
  config.allowedContent = { 
    $1: { 
      elements: CKEDITOR.dtd, 
      attributes: true, 
      styles: true, 
      classes: true 
    } 
  };
  config.disallowedContent = "h3;h4;h5;h6;";
  return config;
};

// var editor = CKEDITOR.instances['_com_liferay_journal_web_portlet_JournalPortlet_Content_INSTANCE_cidhEditor'];
// if (editor) { editor.destroy(true); }
// CKEDITOR.replace( '_com_liferay_journal_web_portlet_JournalPortlet_Content_INSTANCE_cidhEditor', {
//   bodyClass: "journal-content-article",
//   bodyId: "cmap-ckeditor",
//   contentsCss: [
//     "/o/cmap-onto-2050-theme/css/main.css",
//     "/o/cmap-onto-2050-theme/css/aui.css",
//     "https://cloud.webtype.com/css/2f300d46-99ee-4656-bf09-870688012aaf.css",
//     "https://cloud.typography.com/7947314/7427752/css/fonts.css"
//   ]
// });

