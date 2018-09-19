package com.cssl.service.impl;

import com.cssl.pojo.Users;
import com.cssl.pojo.errorInfo;
import com.cssl.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AutoConfigureAfter(userService.class)
public class userServiceImpl implements userService{
	//用户注册
	@Autowired
	private com.cssl.dao.userDao userDao;
	
	@Override
	public int regiest(Users users) {
		return userDao.regiest(users);
	}

	@Override
	public Users login(Users users) {
		return userDao.Login(users);
	}

	@Override
	public int saveError(errorInfo errorInfo) {
		return userDao.saveError(errorInfo);
	}


}
