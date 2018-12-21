<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>course adding page</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<link href="static/css/styles.css" rel="stylesheet">
<script src="static/js/jquery-1.11.1.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
<script src="${contextRoot}/static/js/script.js"></script>
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
		<c:when test="${mode=='MODE_ADDCOURSE' }">
			<div class="container text-center">
				<h3>New Course</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="course-saved">
					<input type="hidden" name="id" value="${course.id }" />
					<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="name"
								value="${course.name }" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Description</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="description"
								value="${course.description }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Term</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="term"
								value="${course.term }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Type </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="type"
								value="${course.type }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Instructor</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="instructor"
								value="${course.instructor}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Year</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="year"
								value="${course.year }" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Code </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="code"
								value="${course.code }" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Image Url </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="imageUrl"
								value="${course.imageUrl }" />
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Add Course" />
					</div>
				</form>
			</div>
		</c:when>



		<c:when test="${mode=='MODE_UPDATE' }">
			<div class="container text-center">
				<h3>Update Course</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="course-saved">
					<input type="hidden" name="id" value="${course.id }" />
					<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="name"
								value="${course.name }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Description</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="description"
								value="${course.description }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Term</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="term"
								value="${course.term }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Type </label>
						<div class="col-md-3">
							<input type="text" class="form-control" name="type"
								value="${course.type }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Instructor</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="instructor"
								value="${course.instructor }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Year</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="year"
								value="${course.year }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Code</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="code"
								value="${course.code }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Image Url</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="imageUrl"
								value="${course.imageUrl }" />
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Update" />
					</div>
				</form>
			</div>
		</c:when>

	</c:choose>

</body>
</html>