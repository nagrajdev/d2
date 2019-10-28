package idea.portlet;

import idea.constants.sPortletKeys;
import idea.constants.sWebKeys;

import com.liferay.frontend.js.loader.modules.extender.npm.JSPackage;
import com.liferay.frontend.js.loader.modules.extender.npm.NPMResolver;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author s
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=id Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + sPortletKeys.s,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class sPortlet extends MVCPortlet {

	@Override
	public void doView(
		RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		JSPackage jsPackage = _npmResolver.getJSPackage();

		renderRequest.setAttribute(
			sWebKeys.BOOTSTRAP_REQUIRE,
			jsPackage.getResolvedId() + " as bootstrapRequire");

		String contextPath = renderRequest.getContextPath();

		renderRequest.setAttribute(
			"stylesheetURL",
			contextPath + "/node_modules/" +
				_npmResolver.resolveModuleName("billboard.js") +
					"/dist/billboard.css");

		super.doView(renderRequest, renderResponse);
	}

	@Reference
	private NPMResolver _npmResolver;

}