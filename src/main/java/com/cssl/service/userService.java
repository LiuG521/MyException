package com.cssl.service;

import com.cssl.pojo.Users;
import com.cssl.pojo.errorInfo;

public interface userService {
	//注册用户
	int regiest(Users users);
	
	//用户登录
	Users login(Users users);

	//新增异常
	int saveError(errorInfo errorInfo);
}
