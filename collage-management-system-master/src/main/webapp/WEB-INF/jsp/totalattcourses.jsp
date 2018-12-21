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

<h3>  <a href="/totalnamesattendance?coursename=${course.name}" class="btn btn-info" role="button">${course.name}</a></h3>
  
		
		
		
		<br/>
		<br/>
	<hr/>
									
				</center>				
							</c:forEach>
							</div>	
</body>
</html>