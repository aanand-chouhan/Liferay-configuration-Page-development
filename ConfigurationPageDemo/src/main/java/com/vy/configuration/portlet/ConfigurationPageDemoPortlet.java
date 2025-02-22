package com.vy.configuration.portlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.vy.configuration.constants.ConfigurationPageDemoPortletKeys;

/**
 * @author vidyayug
 */
@Component(configurationPid = "com.vy.configuration.configuration.DemoConfiguration", immediate = true, property = {
		"com.liferay.portlet.display-category=category.sample", "com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ConfigurationPageDemoPortletKeys.ConfigurationPageDemo,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class ConfigurationPageDemoPortlet extends MVCPortlet {

}