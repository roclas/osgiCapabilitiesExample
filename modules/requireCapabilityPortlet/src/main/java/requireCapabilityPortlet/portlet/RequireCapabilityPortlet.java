package requireCapabilityPortlet.portlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import helloservice.api.HelloService;
import requireCapabilityPortlet.constants.RequireCapabilityPortletKeys;

/**
 * @author carlos
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=requireCapabilityPortlet Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + RequireCapabilityPortletKeys.RequireCapability,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RequireCapabilityPortlet extends MVCPortlet {
	//@Reference(target="(implementation=impl1)") 
	@Reference
	HelloService helloService;
	
	@Override 
	public void init() throws PortletException{
			System.out.println(helloService.sayHello());
			super.init();
	}

	
}