/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package yellButton.portlet;

import com.liferay.portal.kernel.editor.configuration.BaseEditorConfigContributor;
import com.liferay.portal.kernel.editor.configuration.EditorConfigContributor;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import java.util.Map;
import org.osgi.service.component.annotations.Component;

@Component(
	    immediate = true,
	    property = {
	      "editor.name=alloyeditor",
	      "service.ranking:Integer=100"
	    },
	    service = EditorConfigContributor.class  
)
public class YellButtonConfigContributor extends BaseEditorConfigContributor {

	@Override
	public void populateConfigJSONObject(JSONObject jsonObject, Map<String, Object> inputEditorTaglibAttributes,
			ThemeDisplay themeDisplay, RequestBackedPortletURLFactory requestBackedPortletURLFactory) {
		// TODO Auto-generated method stub
		JSONObject toolbarsJSONObject = jsonObject.getJSONObject("toolbars");

		if (toolbarsJSONObject == null) {
		        toolbarsJSONObject = JSONFactoryUtil.createJSONObject();
		}
		JSONObject addToolbar = toolbarsJSONObject.getJSONObject("add");
		JSONArray addToolbarButtons = addToolbar.getJSONArray("buttons");
		addToolbarButtons.put("yellSelectedText");
		addToolbar.put("buttons", addToolbarButtons);

		toolbarsJSONObject.put("add", addToolbar);

		jsonObject.put("toolbars", toolbarsJSONObject);
		
	}
}