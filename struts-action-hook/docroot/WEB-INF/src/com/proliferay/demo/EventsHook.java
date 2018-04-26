package com.proliferay.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;

/*https://dev.liferay.com/develop/tutorials/-/knowledge_base/6-2/performing-a-custom-action-using-a-hook
 * 
 * in addition to the Liferays default operation
 * 
 * application.startup.events
application.shutdown.events
login.events.pre
login.events.post
logout.events.pre
logout.events.post
servlet.service.events.pre
servlet.service.events.post
servlet.session.create.events
servlet.session.destroy.events

Custom action hook 
*/

public class EventsHook extends Action{
	
	
	@Override
	public void run(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ActionException {
		
		
		System.out.println("Events hook  an after login ");
		
	}

	
}
