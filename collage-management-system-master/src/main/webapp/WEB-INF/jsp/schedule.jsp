<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Time Table Page</title>

<link href="${contextRoot}/static/css/styles.css" rel="stylesheet">
<link href="${contextRoot}/static/css/normal.css" rel="stylesheet">
<link href="${contextRoot}/static/css/TimeTable.css" rel="stylesheet">
</head>
<body>

	<div id='courses'>
		<ul>
			<li><a href='/welcome'>Courses Welcome Page</a></li>
			<li><a href="/addCourse">New Course</a></li>
			<li><a href="/show-courses">All Courses</a></li>
			<!-- <li><a href="/showstudents">All Students</a></li> -->
			<li><a href="/show-courses-to-users">All Courses To users</a></li>
			<li><a href="/show-schedule">Schedule</a></li>
			<li><a href="/add-shedule-data">AddSchedule</a></li>
			<!-- <li><a href='#'>Contact</a></li>-->
		</ul>
	</div>

	<div class="clearFloat"></div>


	<c:choose>
		<c:when test="${mode=='MODE_SHOWSCHEDULEDATA' }">



			<div class="tabel1">
				<table class="tabel1">
					<div class="container1">


						<tr>
							<div class="header">
								<th class="Year">Year</th>
								<th>Sat</th>
								<th>Sun</th>
								<th>Mon</th>
								<th>Tue</th>
								<th>Wed</th>
								<th>Thr</th>
								<th>Fri</th>
							</div>
						</tr>

						<c:forEach var="schedule" items="${schedule }">

							<c:choose>
								<c:when test="${schedule.year=='1st'}">
									<tr>
										<div class="First-Year">
											<td class="col"><h4>${schedule.year }</h4></td>
											<td><textarea readonly="readonly">${schedule.sat }</textarea></td>
											<td><textarea readonly="readonly">${schedule.sun }</textarea></td>
											<td><textarea readonly="readonly">${schedule.mon } </textarea></td>
											<td><textarea readonly="readonly">${schedule.tues }</textarea></td>
											<td><textarea readonly="readonly">${schedule.wed }</textarea></td>
											<td><textarea readonly="readonly">${schedule.thr }</textarea></td>
											<td><textarea readonly="readonly">${schedule.fri }</textarea></td>
										</div>
									</tr>
								</c:when>


								<c:when test="${schedule.year=='2nd'}">
									<tr>
										<div class="Secon-Year">
											<td class="col"><h4>${schedule.year }</h4></td>
											<td class="dif"><textarea class="dif" readonly="readonly">${schedule.sat}</textarea></td>
											<td class="dif"><textarea class="dif" readonly="readonly">${schedule.sun}</textarea></td>
											<td class="dif"><textarea class="dif" readonly="readonly">${schedule.mon}</textarea></td>
											<td class="dif"><textarea class="dif" readonly="readonly">${schedule.tues}</textarea></td>
											<td class="dif"><textarea class="dif" readonly="readonly">${schedule.wed}</textarea></td>
											<td class="dif"><textarea class="dif" readonly="readonly">${schedule.thr}</textarea></td>
											<td class="dif"><textarea class="dif" readonly="readonly">${schedule.fri}</textarea></td>
										</div>
									</tr>
								</c:when>




								<c:when test="${schedule.year=='3rd'}">
									<tr>
										<div class="Third-Year">
											<td class="col"><h4>${schedule.year}</h4></td>
											<td><textarea readonly="readonly">${schedule.sat}</textarea></td>
											<td><textarea readonly="readonly">${schedule.sun}</textarea></td>
											<td><textarea readonly="readonly">${schedule.mon}</textarea></td>
											<td><textarea readonly="readonly">${schedule.tues}</textarea></td>
											<td><textarea readonly="readonly">${schedule.wed}</textarea></td>
											<td><textarea readonly="readonly">${schedule.thr}</textarea></td>
											<td><textarea readonly="readonly">${schedule.fri}</textarea></td>
										</div>
									</tr>
								</c:when>


								<c:when test="${schedule.year=='4rh'}">
									<tr>
										<div class="Forth-Year">
											<td class="col"><h4>${schedule.year}</h4></td>
											<td class="dif"><textarea class="dif" readonly="readonly">${schedule.sat }</textarea></td>
											<td class="dif"><textarea class="dif" readonly="readonly">${schedule.sun }</textarea></td>
											<td class="dif"><textarea class="dif" readonly="readonly">${schedule.mon }</textarea></td>
											<td class="dif"><textarea class="dif" readonly="readonly">${schedule.tues }</textarea></td>
											<td class="dif"><textarea class="dif" readonly="readonly">${schedule.wed }</textarea></td>
											<td class="dif"><textarea class="dif" readonly="readonly">${schedule.thr }</textarea></td>
											<td class="dif"><textarea class="dif" readonly="readonly">${schedule.fri }</textarea></td>
										</div>
									</tr>
								</c:when>

							</c:choose>
						</c:forEach>
					</div>
				</table>
			</div>

		</c:when>
	</c:choose>
	<c:choose>
		<c:when test="${mode=='MODE_ADDSCHEDULEDATA' }">
			<div class="container text-center">
				<h3>New Schedule</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="schedule-saved">
					<input type="hidden" name="id" value="${schedule.id }" />
					<div class="form-group">
						<label class="control-label col-md-3">Year</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="year"
								value="${schedule.year }" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Saturday</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="sat"
								value="${schedule.sat }" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Sunday</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="sun"
								value="${schedule.sun }" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Monday </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="mon"
								value="${schedule.mon }" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Tuesday</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="tues"
								value="${schedule.tues}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Wednesday</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="wed"
								value="${schedule.wed }" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Thursday </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="thr"
								value="${schedule.thr}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Friday </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="fri"
								value="${schedule.fri}" />
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Add Schedule" />
					</div>
				</form>
			</div>
		</c:when>

	</c:choose>






</body>
</html>
