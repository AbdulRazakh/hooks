package com.proliferay.demo;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.struts.BaseStrutsPortletAction;
import com.liferay.portal.kernel.struts.StrutsPortletAction;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * 
 * @author Abdul
 *
 */

public class ExampleLoginAction extends BaseStrutsPortletAction{

	@Override
	public void processAction(StrutsPortletAction originalStrutsPortletAction,
			PortletConfig portletConfig, ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		
		String aboutme=ParamUtil.getString(actionRequest, "aboutMe");
		
		System.out.println("LoginAction......"+aboutme);
		
		originalStrutsPortletAction.processAction(
	            originalStrutsPortletAction, portletConfig, actionRequest,
	            actionResponse);
	}


	public String render(
            StrutsPortletAction originalStrutsPortletAction,
            PortletConfig portletConfig, RenderRequest renderRequest,
            RenderResponse renderResponse)
        throws Exception {
		
		/**
		 * Our own render method 
		 * This method is for rendering the view
		 * At the end call the original struts action
		 */
       
		System.out.println("##########Rendering view############");
        return originalStrutsPortletAction.render(
            null, portletConfig, renderRequest, renderResponse);

    }
}
