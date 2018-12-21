<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<meta name="Time Table Mangment" content="This A Time Table Mangment">


<title>courses | home</title>

<link href="${contextRoot }/static/css/bootstrap.min.css" rel="stylesheet">
<link href="${contextRoot }/static/css/style.css" rel="stylesheet">
<link href="${contextRoot }/static/css/styles.css" rel="stylesheet">
<script src="${contextRoot }/static/js/jquery-1.11.1.min.js"></script>
<script src="${contextRoot }/static/js/bootstrap.min.js"></script>
<script src="${contextRoot }/static/js/script.js"></script>




<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div id='courses'>
		<ul>
			<li class='active'><a href='/welcome'>Courses Welcome Page</a></li>

			<li><a href="/addCourse">New Course</a></li>
			<li><a href="/show-courses">All Courses</a></li>
			<!-- <li><a href="/showstudents">All Students</a></li> -->
			<li><a href="/show-courses-to-users">All Courses To users</a></li>
			<li><a href="/show-schedule">Schedule</a></li>
			<li><a href="/add-shedule-data">AddSchedule</a></li>
			<!-- <li><a href='#'>Contact</a></li>-->
		</ul>
	</div>
	<!--start clearFloat-->
	<div class="clearFloat"></div>

	.
	<!-- <div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/welcome" class="navbar-brand">Courses</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="/addCourse">New Course</a></li>
					<li><a href="/show-courses">All Courses</a></li>
					<li><a href="/showstudents">All Students</a></li>
					<li><a href="/show-courses-to-users">All Courses To users</a></li>
				</ul>
			</div>
		</div>
	</div>  -->

	<c:choose>


		<c:when test="${mode=='ALL_COURSES_TO_USERS' }">

			<!--start drop box-->

			<div class="dropdown">
				<button onclick="myFunction()" class="dropbtn">Courses</button>
				<div id="myDropdown" class="dropdown-content">
					<a href="#first">First Year</a> <a
						href="/show-courses-to-user/2nd year">Second Year</a> <a
						href="/show-courses-to-user/3rd year">Third Year</a> <a
						href="#fourth">Fourth Year</a>
				</div>
			</div>

			<c:forEach var="course" items="${courses }">
				<div class="videos">
					<div class="image">
						<img src=${course.imageUrl } alt="image may contain:course logo">
					</div>
					<div class="description">
						<a href="/show-courses-to-users/${course.id }"><h3>${course.name}</h3></a>
						<!-- <h3>${course.name}</h3> -->

						<p>${course.description}</p>
					</div>
				</div>
			</c:forEach>
		</c:when>

	</c:choose>



</body>
</html>
