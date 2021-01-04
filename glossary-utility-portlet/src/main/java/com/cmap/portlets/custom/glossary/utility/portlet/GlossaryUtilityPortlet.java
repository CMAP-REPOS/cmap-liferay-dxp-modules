package com.cmap.portlets.custom.glossary.utility.portlet;

import com.cmap.portlets.custom.glossary.utility.constants.GlossaryUtilityPortletKeys;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.xml.Document;
import com.liferay.portal.kernel.xml.DocumentException;
import com.liferay.portal.kernel.xml.Node;
import com.liferay.portal.kernel.xml.SAXReaderUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author jon
 */
@Component(
		immediate = true,
		property = {
			"com.liferay.portlet.display-category=CMAP",
			"com.liferay.portlet.instanceable=false",
			"javax.portlet.display-name=Glossary Utility",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/view.jsp",
			"javax.portlet.name=" + GlossaryUtilityPortletKeys.GlossaryUtility,
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user"
		},
		service = Portlet.class
	)

public class GlossaryUtilityPortlet extends MVCPortlet {
	
	private static Log _log = LogFactoryUtil.getLog(GlossaryUtilityPortlet.class);
	private static long _groupId = 10180;
	private static String _ddmStructureKey = "853952";
	// private static String _ddmStructureKey = "830530";

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {

		String command = ParamUtil.getString(resourceRequest, "cmd");

		if (command.equals("getGlossaryItem")) {
			String requestedTerm = ParamUtil.getString(resourceRequest, "term");

			String returnedDefintion = StringPool.BLANK;
			String safe_requested_term = requestedTerm.toLowerCase().trim();
			boolean definition_found = false;
			List<JournalArticle> glossaryArticles = JournalArticleLocalServiceUtil.getStructureArticles(_groupId, _ddmStructureKey);
			
			// glossary *should* be the only one
			if (glossaryArticles.size() > 1) {
				// _log.warn("Warning in GlossaryUtilityPortlet.serveResource: "+glossaryArticles.size()+" glossary articles found.");
			}

			for( JournalArticle widget : glossaryArticles ){
				if(definition_found){ break; }
				
				try {
					Document doc = SAXReaderUtil.read(widget.getContent());
					List<Node> terms = doc.selectNodes("/root/dynamic-element[@name=\"Term\"]/dynamic-content");
					for (Node term : terms) {
						if(definition_found){ break; }
						String termValue = term.getText().toLowerCase().trim();

						
						if (termValue.equals(safe_requested_term) || 
								(termValue+"s").equals(safe_requested_term) || 
								(termValue+"es").equals(safe_requested_term)) {
							Node definition = term.getParent().selectSingleNode("dynamic-element[@name=\"Definition\"]/dynamic-content");
							returnedDefintion = definition.getText();
							definition_found = true;

							PrintWriter writer = resourceResponse.getWriter();
							writer.write(returnedDefintion);
							writer.flush();
						}
					}
				} catch (DocumentException ex) {
					_log.error("DocumentException in GlossaryUtilityPortlet.serveResource: " + ex.getMessage(), ex);
				}
			}
		}

		super.serveResource(resourceRequest, resourceResponse);
	}
}