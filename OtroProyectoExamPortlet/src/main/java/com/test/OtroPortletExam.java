package com.test;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;



import com.liferay.portal.model.User;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;


public class OtroPortletExam extends MVCPortlet {
	
	
	public static final String USERS ="usuarios";
	public static final String adress= "/html/otroportletexam/view.jsp";
	
	
 
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		
		try{
			
		int usersCount= UserLocalServiceUtil.getUsersCount();
		 List<User> listausuarios = UserLocalServiceUtil.getUsers(0, usersCount);
		 listausuarios.get(0).getUserId();
		 listausuarios.get(0).getFullName();
		 renderRequest.setAttribute(USERS,listausuarios);
		 
		 include (adress,renderRequest,renderResponse);
		 
		 
		}catch (SystemException e)  {
			e.printStackTrace();
		 
	}
	
		
	
	 
	
}
 
 

}
