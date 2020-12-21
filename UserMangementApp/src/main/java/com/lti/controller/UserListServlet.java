package com.lti.controller;

import java.io.IOException;
 
import java.sql.SQLException;
 
import java.util.Set;

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
 * Servlet implementation class UserListServlet
 */
@WebServlet("/UserList")
public class UserListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			listUser(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		 
	}
	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		UserInfoDao userdao = new UserInfoDaoImpl();
		Set<UserInfo> listUser = userdao.viewAllUsers();
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		dispatcher.forward(request, response);
	}
}
