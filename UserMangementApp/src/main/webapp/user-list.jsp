 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
 	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LTI - Larsen & Toubro Infotech</title>
 
	<link rel='stylesheet' type='text/css' media='screen' href='main.css'>
</head>
<body>

	<div class="header">
        <h1>Welcome to LTI</h1>    
    </div>
    <div class="topnav">
        <ul>
        <li><a href="index.html">Home</a></li>
        <li><a href="register.html">Register</a></li>
        <li><a href="login.html">Login</a></li>
        <li><a href="UserList">User-List</a>
        <li><img src="image/lti.jpg" style="float: right; padding-right: 20px; height:50px"></li>
        </ul>
    </div>
	<br>

	<div class="row">
	<div class="main">
          <div class="card">
			  <h2 style="text-align: center;">List Of Users!</h2>
	          <hr>
			  <div style="text-align:left; ">
      			<a href="register.html" class=" clickme warning">Add New User</a> 
			  </div>
			  <br>
			<table id="customers">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>password</th>
						<th>Email</th>
						<th>City</th>
						<th>Mobile</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					 
					<c:forEach var="user" items="${listUser}">

						<tr>
							<td><c:out value="${user.userId}" /></td>
							<td><c:out value="${user.userName}" /></td>
							<td><c:out value="${user.userPassword}" /></td>
							<td><c:out value="${user.userEmail}" /></td>
							<td><c:out value="${user.userCity}" /></td>
							<td><c:out value="${user.userMobile}" /></td>
							<td><a id="link" href="edit?userId=<c:out value='${user.userId}'/>" class="clickme info" >Edit</a>
								&nbsp;&nbsp; <a
								href="delete?userId=<c:out value='${user.userId}'/>" class="clickme danger">Delete</a></td>
						</tr>
					</c:forEach>
					 
				</tbody>

				</table>
			</div>
		</div>
	 </div>
	<div class="footer">
        <p>© 2020 Larsen & Toubro Infotech Limited</p>
      </div>  
</body>
 
</html>
