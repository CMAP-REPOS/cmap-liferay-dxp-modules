package gov.illinois.cmap.custom.editor.centered.column.button.portlet;

import gov.illinois.cmap.custom.editor.centered.column.button.constants.CenteredColumnButtonEditorConfigContributorPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author alejandroroiz
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=CenteredColumnButtonEditorConfigContributor",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CenteredColumnButtonEditorConfigContributorPortletKeys.CENTEREDCOLUMNBUTTONEDITORCONFIGCONTRIBUTOR,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CenteredColumnButtonEditorConfigContributorPortlet extends MVCPortlet {
}