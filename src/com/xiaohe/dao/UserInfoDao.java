package com.xiaohe.dao;

import java.util.ArrayList;

import com.xiaohe.model.Userinfo;
/**
 * 用户持久层的接口
 * @author xiaohe
 *
 */
public interface UserInfoDao {
	ArrayList<Userinfo> finAll(); 
}
