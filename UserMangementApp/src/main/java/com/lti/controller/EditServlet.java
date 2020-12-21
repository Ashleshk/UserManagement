package com.lti.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.UserInfoDao;
import com.lti.dao.UserInfoDaoImpl;
 
import com.lti.model.UserInfo;
 

 

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserInfoDao userDAO;
	
	public void init() {
		userDAO = new UserInfoDaoImpl();
	}
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("userId"));
		UserInfo existingUser = userDAO.findUserById(id);
		System.out.println(id + " "+existingUser.getUserName()+" "+existingUser.getUserEmail());
		RequestDispatcher dispatcher = request.getRequestDispatcher("Update.jsp");
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response); 
	}

	 
	

}
