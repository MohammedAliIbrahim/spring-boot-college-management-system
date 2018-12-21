<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Courses Shown To Administrators</title>

<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<link href="static/css/styles.css" rel="stylesheet">
<script src="static/js/jquery-1.11.1.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
<script src="static/js/script.js"></script>

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


	<c:choose>
		<c:when test="${mode=='ALL_COURSES' }">
			<div class="container text-center" id="tasksDiv">
				<!--start drop box-->
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<div class="dropdown">

							<button onclick="myFunction()" class="dropbtn">Courses</button>
							<div id="myDropdown" class="dropdown-content">
								<a href="#first">First Year</a> <a href="/show-courses/2rd year">Second
									Year</a> <a href="/show-courses/3rd year">Third Year</a> <a
									href="#fourth">Fourth Year</a>
							</div>

						</div>
					</table>
				</div>

				<h3>All Courses</h3>

				
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>Description</th>
								<th>Term</th>
								<th>Type</th>
								<th>Instructor</th>
								<th>Year</th>
								<th>Code</th>
								<th>ImageUrl</th>
								<th>Delete</th>
								<th>Edit</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="course" items="${courses }">
								<tr>
									<td>${course.id}</td>
									<td>${course.name}</td>
									<td>${course.description}</td>
									<td>${course.term}</td>
									<td>${course.type}</td>
									<td>${course.instructor}</td>
									<td>${course.year}</td>
									<td>${course.code}</td>
									<td>${course.imageUrl}</td>
									<td><a href="/delete-course?id=${course.id }"><span
											class="glyphicon glyphicon-trash"></span></a></td>
									<td><a href="/edit-course?id=${course.id }"><span
											class="glyphicon glyphicon-pencil"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
	</c:choose>
</body>
</html>