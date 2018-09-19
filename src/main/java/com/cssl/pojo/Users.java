package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @program: ideaWorkSpance2
 * @Date: 2018/8/12 12:02
 * @Author: 刘帅哥
 * @Description:
 */

@Getter
@Setter
public class Users {
    private Integer userId;		//用户id
    private String userName;	//用户名
    private String userPwd;		//密码
    private String userQicq;	//QQ号
    private String userTel;		//联系电话
    private String userPhoto;	//用户头像
    private Date userCreateTime;//创建时间
    private Integer userRight;  //用户权限
}
