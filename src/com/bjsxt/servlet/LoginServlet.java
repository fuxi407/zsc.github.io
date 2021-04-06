package com.bjsxt.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bjsxt.pojo.User;
import com.bjsxt.service.LoginService;
import com.bjsxt.service.impl.LoginServiceImpl;

public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//设置响应模式
		resp.setContentType("type=text/html;charset=utf-8");
		//获取请求信息
		String uname = req.getParameter("uname");
		String pwd = req.getParameter("pwd");
		System.out.println(uname + ":" + pwd);
		//处理请求信息
			//获取业务层对象
		LoginService ls = new LoginServiceImpl();
		User u = ls.checkLoginService(uname, pwd);
		if(u != null){
			System.out.println(u);
		}		
		//响应处理结果
	}

}
