package com.cssl.dao;

import com.cssl.pojo.Users;
import com.cssl.pojo.errorInfo;

public interface userDao {
	
	//用户注册
	int regiest(Users users);
	
	//用户登录
	Users Login(Users users);

	//新增异常
	int saveError(errorInfo errorInfo);

	//查询全部

}
