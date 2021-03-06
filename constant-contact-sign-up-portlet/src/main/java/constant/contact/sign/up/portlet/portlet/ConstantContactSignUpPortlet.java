package constant.contact.sign.up.portlet.portlet;

import constant.contact.sign.up.portlet.constants.ConstantContactSignUpPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author hectorortiz
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=CMAP",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Weekly Email List Sign Up Form",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ConstantContactSignUpPortletKeys.CONSTANTCONTACTSIGNUP,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ConstantContactSignUpPortlet extends MVCPortlet {
}