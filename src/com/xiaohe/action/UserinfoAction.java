package com.xiaohe.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaohe.model.Userinfo;
import com.xiaohe.service.UserInfoService;
import com.xiaohe.service.UserInfoServiceImpl;

public class UserinfoAction extends ActionSupport{
	private UserInfoService userInfoService = new UserInfoServiceImpl();
	/**
	 * �û���ѯ�Ķ�������
	 * @return
	 */
	public String findAllUser() {
		//1.����service���ѯ�û�
		ArrayList<Userinfo> list = userInfoService.findAllUser();
		//2.��ȡrequest����
	
		
		//3
		return "findAllUser";
	}
}
