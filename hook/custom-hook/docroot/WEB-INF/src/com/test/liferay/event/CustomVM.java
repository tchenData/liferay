package com.test.liferay.event;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.compat.portal.util.PortalUtil;
import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.util.WebKeys;
public class CustomVM extends Action {
	/* (non-Java-doc)
	 * @see com.liferay.portal.kernel.events.SimpleAction#SimpleAction()
	 */
	public CustomVM() {
		super();
	}

	@Override
	public void run(HttpServletRequest request, HttpServletResponse response)
			throws ActionException {
		String editFlag = PortalUtil.getOriginalServletRequest(request).getParameter("editFlag");
		Map<String, Object> velocityVM = new HashMap<String, Object>();
		velocityVM.put("editFlag", editFlag);
		
		request.setAttribute(WebKeys.VM_VARIABLES, velocityVM);
	}

}