<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="Stylesheet" href="${contextRoot}/static/css/stylestudent.css">
<title>student profile</title>
</head>
<body>


	<c:choose>
		<c:when test="${mode=='MODE_STUDENT_PROFILE' }">

			<div class="content">

				<div class="upload">
					<input type="file" name="pic" accept="image/*" value="Upload">
					<img alt="default student image"
						src="${contextRoot }/static/images/profile.png">

				</div>
				<div class="fullname">
					<div>${student.user.firstname} ${student.user.lastname }</div>
				</div>
				<div class="clearfloat"></div>
				<h3>
					<i></i> ABOUT
				</h3>
				<div class="clearfloat"></div>
				<ul>
					<li><a id="personal" href="#">Personal information</a></li>
					<li><a id="edu" href="#">Educational</a></li>
					<li><a id="notif" href="#">Notification</a></li>
					<li><a id="chat" href="#">ChatRoom</a></li>
				</ul>
				<div class="clearfloat"></div>
				<hr>

				<div id="row" class="row">

					<label>First Name:</label>
					<div>${student.user.firstname}</div>
					<!-- col-sm-10 -->

					<label>Last Name:</label>
					<div>${student.user.lastname}</div>
					<!-- col-sm-10 -->

					<label>User Name:</label>
					<div>${student.user.userName}</div>
					<!-- col-sm-10 -->

					<label class="mail">Email:</label>
					<div>${student.user.email}</div>
					<!-- col-sm-10 -->

					<label>Address:</label>
					<div>${student.user.address}</div>
					<!-- col-sm-10 -->


					<label>Age:</label>
					<div>${student.user.age}</div>
					<!-- col-sm-10 -->

					<label>mobile phone:</label>
					<div>${student.user.mobile}</div>
					<!-- col-sm-10 -->

				</div>

				<!--start educational-->
				<div id="ahmd" class="ahmd">
					<label>Year:</label><div>${student.level}</div>
					 <a href="/show-courses-to-user/${student.level}">Courses</a><br> <a
						href="#">Grades</a><br> <a href="#">Quiz</a><br> <a
						href="#">Assignments</a>
				</div>
				<!--end educational-->


				<!--start notification-->
				<div id="eissa" class="eissa">

					<a href="#">Courses</a><br> <a href="#">Quiz</a><br> <a
						href="#">Assignments</a>
				</div>
				<!--end notification-->


				<!--start chatroom-->
				<div id="sasa" class="sasa">

					<a href="#">Chat with admins</a><br> <a href="#">Chat with
						instructors</a><br> <a href="#">Chat with Students</a>

				</div>
				<!--end chatroom-->

			</div>
			<script src="${contextRoot}/static/js/scriptstudent.js"></script>

		</c:when>
	</c:choose>
</body>
</html>