package com.cssl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cssl.pojo.Users;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class userController {

	@Autowired
	private com.cssl.service.userService userService;
	
	@ResponseBody
	@RequestMapping("Ajax/Login")
	public boolean usersLogin(Users users) {
		if(userService.login(users)!=null) {
			return true;
		}
		return false;
	}
	
	@ResponseBody
	@RequestMapping("Ajax/regiest")
	public boolean userRegiest(Users users) {
		System.err.println("----------------------");
		if(userService.regiest(users)>0) {
			return true;
		}
		return false;
	}

	//查询全部
	//Ajax/findAll

	//新增异常
	@RequestMapping("/MyError")
	public void errorUpload(String errorTitle, MultipartFile[] files, ServletContext context){
		String path = context.getRealPath("/MyError");
	}

	@RequestMapping("/add")
	public void add(HttpServletResponse response) throws IOException {
		System.out.println("------------------------");
		PrintWriter out = response.getWriter();
		//System.out.println("");
		out.print("<script>alert('admin');location.href='regiest.html';</script>");
		out.flush();
		out.close();
		System.out.println("2ss23");
		//return "forward:regiest.html";
	}
	
}
