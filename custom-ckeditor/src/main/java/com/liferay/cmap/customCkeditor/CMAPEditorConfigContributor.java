
package com.liferay.cmap.customCkeditor;

import com.liferay.portal.kernel.editor.configuration.EditorConfigContributor;
import com.liferay.portal.kernel.editor.configuration.BaseEditorConfigContributor;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import javax.portlet.Portlet;
import java.util.Map;


import org.osgi.service.component.annotations.Component;

@Component(
    immediate = true,
    property = {
      "editor.config.key=cmapEditor",
      "editor.name=ckeditor",
      "javax.portlet.name=com_liferay_blogs_web_portlet_BlogsPortlet",
      "service.ranking:Integer=100"
    },
    service = EditorConfigContributor.class
)

public class CMAPEditorConfigContributor extends BaseEditorConfigContributor {

  private static Log _logger = LogFactoryUtil.getLog(CMAPEditorConfigContributor.class);

  public void init(){
    _logger.debug("Hello World");
  }

  @Override
  public void populateConfigJSONObject(
    JSONObject jsonObject,
    Map<String, Object> inputEditorTaglibAttributes,
    ThemeDisplay themeDisplay,
    RequestBackedPortletURLFactory requestBackedPortletURLFactory
  ){

    _logger.debug(jsonObject.toString());
    // System.out.println();

    JSONObject toolbars = jsonObject.getJSONObject("toolbars");

    if (toolbars != null) {
      JSONObject toolbarAdd = toolbars.getJSONObject("add");
      if (toolbarAdd != null) {
        JSONArray addButtons = toolbarAdd.getJSONArray("buttons");
        addButtons.put("camera");
      }
    }

  }
}
