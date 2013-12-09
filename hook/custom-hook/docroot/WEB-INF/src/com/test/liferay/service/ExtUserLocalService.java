package com.test.liferay.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceWrapper;
import com.liferay.portal.service.UserLocalService;

public class ExtUserLocalService extends UserLocalServiceWrapper {
	/* (non-Java-doc)
	 * @see com.liferay.portal.service.UserLocalServiceWrapper#UserLocalServiceWrapper(UserLocalService userLocalService)
	 */
	public ExtUserLocalService(UserLocalService userLocalService) {
		super(userLocalService);
	}

	@Override
	public User fetchUser(long userId) throws SystemException {
		System.err.println("fetchUser 用户ID：" + userId);
		return super.fetchUser(userId);
	}

	@Override
	public User getUserById(long userId) throws PortalException,
			SystemException {
//		System.err.println("getUserById 用户ID：" + userId);
		return super.getUserById(userId);
	}

}