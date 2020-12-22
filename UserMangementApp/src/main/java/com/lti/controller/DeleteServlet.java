package com.lti.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.UserInfoDao;
import com.lti.dao.UserInfoDaoImpl;
 
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
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
		boolean res = messagePopup(response);
		//userDAO.deleteUser(id);
		response.sendRedirect("UserList");
		
	}
	protected boolean messagePopup(HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();  
		response.setContentType("text/html");  
		out.println("<script type=\"text/javascript\">");  
		out.println("var res=confirm('deadbeef');");  
		out.println("</script>");
		return false;
	}

	
	

}
