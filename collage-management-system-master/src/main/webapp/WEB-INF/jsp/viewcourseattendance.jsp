    <!DOCTYPE html >
<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>courses | home</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<link href="static/css/table.css" rel="stylesheet">
<script src="static/js/query-1.11.1.min.js"></script>
<script src="static/js/placeholder.js"></script>

<style >


.pagination {
    display: inline-block;
}

.pagination a {
    color: black;
    float: left;
    padding: 8px 16px;
    text-decoration: none;
}

.pagination a.active {
    background-color: #ddd;
    color: black;
    border-radius: 5px;
}

.pagination a:hover:not(.active) {
    background-color: #ddd;
    border-radius: 5px;
}
</style>



<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Iattendance</title>
</head>
<body>
<div class="container">

<center>  <h2>select which course to show its attendance 

<br/>

<hr/>
 <!--  order of section :  ${orderofsection} -->

</h2>

</center>
  
  
  <br/>
   <br/>
    <br/>
<c:forEach var="course" items="${courses }">
		
		
			<center>					

<h3>  <a href="#" class="btn btn-info" role="button">${course.name}</a></h3>
<div class="pagination">
 <!--   <a href="#">&laquo;</a>-->
  <a href="viewcourseattendance2?coursename=${course.name}&secorder=1" class="active">1</a>
  <a href="viewcourseattendance2?coursename=${course.name}&secorder=2" class="active">2</a>
  <a href="viewcourseattendance2?coursename=${course.name}&secorder=3" class="active">3</a>
 <a href="viewcourseattendance2?coursename=${course.name}&secorder=4" class="active">4</a>
  <a href="viewcourseattendance2?coursename=${course.name}&secorder=5" class="active">5</a>
  <a href="viewcourseattendance2?coursename=${course.name}&secorder=6" class="active">6</a>
  <a href="viewcourseattendance2?coursename=${course.name}&secorder=7" class="active">7</a>
  <a href="viewcourseattendance2?coursename=${course.name}&secorder=8" class="active">8</a>
  <a href="viewcourseattendance2?coursename=${course.name}&secorder=9" class="active">9</a>
  <a href="viewcourseattendance2?coursename=${course.name}&secorder=10" class="active">10</a>
  <a href="viewcourseattendance2?coursename=${course.name}&secorder=11" class="active">11</a>
  <a href="viewcourseattendance2?coursename=${course.name}&secorder=12" class="active">12</a>
  <a href="viewcourseattendance2?coursename=${course.name}&secorder=13" class="active">13</a>
  <a href="viewcourseattendance2?coursename=${course.name}&secorder=14" class="active">14</a>
  <a href="viewcourseattendance2?coursename=${course.name}&secorder=15" class="active">15</a>
 <!--   <a href="#">&raquo;</a> -->
</div>  
		
		<br/>
		<br/>
	<hr/>
									
				</center>
		
								
					
							</c:forEach>
							</div>	
</body>
</html>