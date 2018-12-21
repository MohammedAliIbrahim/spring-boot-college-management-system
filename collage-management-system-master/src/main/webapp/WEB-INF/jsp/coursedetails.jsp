<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Course Details Page</title>

<link href="${contextRoot}/static/css/bootstrap.min.css" rel="stylesheet">
<link href="${contextRoot}/static/css/style.css" rel="stylesheet">
<link href="${contextRoot}/static/css/styles.css" rel="stylesheet">


</head>
<body>

<div id='courses'>
	
		<ul>
			<li><a href='/welcome'>Courses Welcome Page</a></li>

			<li><a href="/addCourse">New Course</a></li>
			<li><a href="/show-courses">All Courses</a></li>
			<!-- <li><a href="/showstudents">All Students</a></li> -->
			<li><a href="/show-courses-to-users">All Courses To users</a></li>
			<li><a href="/schedule">Schedule</a></li>
			<!-- <li><a href='#'>Contact</a></li>-->
		</ul>
	</div>
	<!--start clearFloat-->
	<div class="clearFloat"></div>

	<c:choose>
		<c:when test="${mode=='MODE_COURSE_DETAILS' }">

			<h1>${courseDetails.name}</h1>
			<div class="videos">
				<div class="image">
					<img src=${courseDetails.imageUrl
					}
						alt="image may contain:course logo">
				</div>
				<div class="description">

					<p>${courseDetails.type}</p>
					<p>${courseDetails.description}</p>
					<p>${courseDetails.code}</p>
					<p>${courseDetails.instructor}</p>
					<p>${courseDetails.term}</p>
					<p>${courseDetails.type}</p>
				</div>
			</div>

		</c:when>
	</c:choose>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="${contextRoot}/static/js/jquery-1.11.1.min.js"></script>
	<script src="${contextRoot}/static/js/bootstrap.min.js"></script>
	<script src="http://code.jquery.com/jquery-latest.min.js"
		type="text/javascript"></script>
	<script src="${contextRoot}/static/js/script.js"></script>
</body>
</html>