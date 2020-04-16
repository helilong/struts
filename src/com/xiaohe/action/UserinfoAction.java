package com.xiaohe.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaohe.model.Userinfo;
import com.xiaohe.service.UserInfoService;
import com.xiaohe.service.UserInfoServiceImpl;

public class UserinfoAction extends ActionSupport{
	private UserInfoService userInfoService = new UserInfoServiceImpl();
	/**
	 * 用户查询的动作方法
	 * @return
	 */
	public String findAllUser() {
		//1.调用service层查询用户
		ArrayList<Userinfo> list = userInfoService.findAllUser();
		//2.获取request对象
	
		
		//3
		return "findAllUser";
	}
}
