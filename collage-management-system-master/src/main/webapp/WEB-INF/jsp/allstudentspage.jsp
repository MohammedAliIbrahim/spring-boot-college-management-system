<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>all students</title>
</head>
<body>

	<c:choose>
		<c:when test="${mode=='ALL_STUDENTS' }">


			<c:forEach var="student" items="${students}">
				<div class="videos">
					<div class="description">
						<a href="/showstudents/${student.id}">
							<h3>${student.user.firstname}
								${student.user.lastname}</h3>
						</a>
					</div>
				</div>
			</c:forEach>

		</c:when>


	</c:choose>

</body>
</html>