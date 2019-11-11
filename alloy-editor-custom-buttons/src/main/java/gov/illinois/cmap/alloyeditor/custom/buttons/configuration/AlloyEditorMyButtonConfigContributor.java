package gov.illinois.cmap.alloyeditor.custom.buttons.configuration;

import com.liferay.portal.kernel.editor.configuration.BaseEditorConfigContributor;
import com.liferay.portal.kernel.editor.configuration.EditorConfigContributor;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import java.util.Map;
import java.util.Objects;

import org.osgi.service.component.annotations.Component;

@Component(
        property = {"editor.name=alloyeditor", "service.ranking:Integer=1000"},
        service = EditorConfigContributor.class
)
public class AlloyEditorMyButtonConfigContributor
        extends BaseEditorConfigContributor {

    @Override
    public void populateConfigJSONObject(
            JSONObject jsonObject, Map<String, Object> inputEditorTaglibAttributes,
            ThemeDisplay themeDisplay,
            RequestBackedPortletURLFactory requestBackedPortletURLFactory) {

        JSONObject toolbarsJSONObject = jsonObject.getJSONObject("toolbars");

        if (toolbarsJSONObject == null) {
            toolbarsJSONObject = JSONFactoryUtil.createJSONObject();
        }

        JSONObject stylesJSONObject = toolbarsJSONObject.getJSONObject(
                "styles");

        if (stylesJSONObject == null) {
            stylesJSONObject = JSONFactoryUtil.createJSONObject();
        }

        JSONArray selectionsJSONArray = stylesJSONObject.getJSONArray(
                "selections");

        for (int i = 0; i < selectionsJSONArray.length(); i++) {
            JSONObject selection = selectionsJSONArray.getJSONObject(i);

            if (Objects.equals(selection.get("name"), "text")) {
                JSONArray buttons = selection.getJSONArray("buttons");

                buttons.put("myButton");
            }
        }

        stylesJSONObject.put("selections", selectionsJSONArray);

        toolbarsJSONObject.put("styles", stylesJSONObject);

        jsonObject.put("toolbars", toolbarsJSONObject);
    }
}
