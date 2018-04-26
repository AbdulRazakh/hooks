package com.proliferay.demo;

import com.liferay.portal.ModelListenerException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModelListener;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;



/*listen for model events
onAfterCreate
onAfterRemove
onAfterRemoveAssociation
onAfterUpdate
onBeforeAddAssociation
onBeforeCreate
onBeforeRemove
onBeforeRemoveAssociation
onBeforeUpdate
onAfterAddAssociation

 * */

public class UserLisener extends BaseModelListener<User> {
	
	
	@Override
	public void onAfterCreate(User model) throws ModelListenerException {
		
		System.out.println("after add do some operation....."+model.getUserId());
		
		try {
			System.out.println("UserLocalServiceUtil.getUsersCount()"+UserLocalServiceUtil.getUsersCount());
		} catch (SystemException e) {
			e.printStackTrace();
		}
		super.onAfterCreate(model);
	}
	


}
