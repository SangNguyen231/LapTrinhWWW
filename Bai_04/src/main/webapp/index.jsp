<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="trangloi.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<style type="text/css">
	input {
		width: 100%;
	}
	
	h1{
		color: #fff;
	}
	
	p {
		color: #fff;
	}
	
	.place {
		font-size: 12px;
	}
</style>
</head>
<body>
	<form method="get/post" action="demo" name="registrationForm">
		<div
			style="display: flex; flex-direction: column; align-items: center; background-color: #4d545c; height: 100%">
			<h1>Register</h1>
			<div style="width: 30%">
				<p>Name</p>
				<div style="display: flex; justify-content: flex-start;">
					<div>
						<input type="text" placeholder="Last Name" name="FirstName"/>
						<p class="place">First</p>
					</div>
					<div style="padding-left: 20px">
						<input type="text" placeholder="First Name" name="LastName"/>
						<p class="place">Last</p>
					</div>
				</div>
			</div>
			<div style="width: 30%;">
				<p>Username</p>
				<input type="text" />
			</div>
			<div style="width: 30%;">
				<p>E-mail</p>
				<input type="email" name="Email"/>
			</div>
			<div style="width: 30%;">
				<p>Password</p>
				<input type="password" />
			</div>
			<div style="width: 30%;">
				<p>Facebook</p>
				<div>
					<input type="text" name="Facebook"/>
					<p class="place">Enter your Facbook profile URL</p>
				</div>
			</div>
			<div style="width: 30%;">
				<p>Short Bio</p>
				<div>
					<input type="text" name="ShortBio"/>
					<p class="place">Share a title information about yourself</p>
				</div>
			</div>
			<div style="width: 30%;">
				<input type="submit" value="Submit" style="width: 20%" />
			</div>
		</div>
	</form>
</body>
</html>