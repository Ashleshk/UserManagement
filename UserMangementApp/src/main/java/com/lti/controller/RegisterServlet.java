package com.lti.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.UserInfoDao;
import com.lti.dao.UserInfoDaoImpl;
import com.lti.model.UserInfo;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 doPost(req,resp);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName= request.getParameter("uname");
		String userPassword= request.getParameter("psw");
		String userEmail= request.getParameter("email");
		String userCity= request.getParameter("city");
		String userMobile= request.getParameter("mobile");
		 
		UserInfo userInfo = new UserInfo(userName,userPassword,userEmail,userCity,userMobile);
		UserInfoDao userdao = new UserInfoDaoImpl();
		
		int res=userdao.registerUser(userInfo);
		if(res>0) {
			out.println("User registered Successfully...");
		}
		else
		{
			out.println("Registration Failed..!!!!");
		}
	
	}

}
