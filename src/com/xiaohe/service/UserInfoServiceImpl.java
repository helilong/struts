package com.xiaohe.service;

import java.util.ArrayList;

import com.xiaohe.dao.UserInfoDao;
import com.xiaohe.dao.UserInfoDaoImpl;
import com.xiaohe.model.Userinfo;

/**
 * �û�ҵ������
 * @author xiaohe
 *
 */
public class UserInfoServiceImpl implements UserInfoService{
	private UserInfoDao userInfoDao= new UserInfoDaoImpl();
	@Override
	public ArrayList<Userinfo> findAllUser() {
		// TODO Auto-generated method stub
		return userInfoDao.finAll();
	}
		
}
