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
			"panel.app.order:Integer=300",
			"panel.category.key=" + ContactManagerAppPanelCategoryKeys.CONTROL_PANEL_CATEGORY
		},
		service = PanelApp.class
	)
public class RecyclingBinAppPanelApp extends BasePanelApp {
	@Override
	public String getPortletId() {
		return ContactManagerAppPortletKeys.RecyclingBinApp;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + ContactManagerAppPortletKeys.RecyclingBinApp + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}
}
