package com.xiaohe.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction3 extends ActionSupport{
	public String say3() {
		System.out.println("ActionSupport�� �еķ���");
		return "success";
	}
}
