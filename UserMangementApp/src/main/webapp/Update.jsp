<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
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
			  <h2 style="text-align: center;">Update/Edit User Page!</h2>
	          <hr>
			   <form action="update" method="post">
			
				<div class="container">
				 <c:if test="${user != null}">
				  <label for="id"><b>UserId</b></label>
					<input type="text" name="id" value="<c:out value='${user.userId}'/>" disabled/>
				</c:if>
                  <label for="uname"><b>Username</b></label>
                  <input type="text" placeholder="Enter Username" name="uname" value="<c:out value='${user.userName}' />" required>
              
                  <label for="psw"><b>Password</b></label>
                  <input type="password" placeholder="Enter Password" name="psw" value="<c:out value='${user.userPassword}' />" required>
              
                  <label for="email"><b>Email Address</b></label>
                  <input type="email" placeholder="Enter Email Address" name="email" value="<c:out value='${user.userEmail}' />" required>
              
                  <label for="city"><b>City</b></label>
                  <input type="text" placeholder="Enter City" name="city" value="<c:out value='${user.userCity}' />" required>
              
                  <label for="mobile"><b>Mobile No.</b></label>
                  <input type="tel" placeholder="Enter Mobile Number" name="mobile"  id="mobile"  value="<c:out value='${user.userMobile}' />" required>
				  <span id="mbError" style="color:red"></span>

                  <button type="submit" class="clickme success">Save</button>
                </div>
				
			 </form>
		</div>
		</div>
	 </div>
	<div class="footer">
        <p>© 2020 Larsen & Toubro Infotech Limited</p>
      </div>  
</body>
</html>