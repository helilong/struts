package com.xiaohe.action;

import com.opensymphony.xwork2.Action;

public class HelloAction2 implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("execute方法被执行");
		return "success";
	}
	
}
