package com.lti.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.UserInfoDao;
import com.lti.dao.UserInfoDaoImpl;
import com.lti.model.UserInfo;
 

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserInfoDao userDAO;
	
	public void init() {
		userDAO = new UserInfoDaoImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		String userName= request.getParameter("uname");
		String userPassword= request.getParameter("psw");
		String userEmail= request.getParameter("email");
		String userCity= request.getParameter("city");
		String userMobile= request.getParameter("mobile");
		
		UserInfo book = new UserInfo(id,userName, userPassword, userEmail,userCity,userMobile);
		userDAO.updateUser(book);
		System.out.println(book.getUserId()+" "+book.getUserName()+" "+book.getUserEmail()+" "+book.getUserCity());
		response.sendRedirect("UserList");
		 
	}

	 
	

}
