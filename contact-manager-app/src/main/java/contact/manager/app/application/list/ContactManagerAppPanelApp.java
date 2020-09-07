package contact.manager.app.application.list;

import contact.manager.app.constants.ContactManagerAppPanelCategoryKeys;
import contact.manager.app.constants.ContactManagerAppPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author jon
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + ContactManagerAppPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class ContactManagerAppPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return ContactManagerAppPortletKeys.ContactManagerApp;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + ContactManagerAppPortletKeys.ContactManagerApp + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}