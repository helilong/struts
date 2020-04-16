package com.xiaohe.service;

import java.util.ArrayList;

import com.xiaohe.model.Userinfo;

/**
 * 用户的业务层接口
 * @author xiaohe
 *
 */
public interface UserInfoService {
	 ArrayList<Userinfo> findAllUser();
	
}
