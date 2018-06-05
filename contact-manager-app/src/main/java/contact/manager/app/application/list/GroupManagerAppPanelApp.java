package contact.manager.app.application.list;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import contact.manager.app.constants.ContactManagerAppPanelCategoryKeys;
import contact.manager.app.constants.ContactManagerAppPortletKeys;

@Component(
		immediate = true,
		property = {
			"panel.app.order:Integer=200",
			"panel.category.key=" + ContactManagerAppPanelCategoryKeys.CONTROL_PANEL_CATEGORY
		},
		service = PanelApp.class
	)
public class GroupManagerAppPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return ContactManagerAppPortletKeys.GroupManagerApp;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + ContactManagerAppPortletKeys.GroupManagerApp + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}
