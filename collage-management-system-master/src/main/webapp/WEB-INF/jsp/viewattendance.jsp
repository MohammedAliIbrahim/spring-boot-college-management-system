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



<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Iattendance</title>
</head>
<body>
<h3> Students' Attendance </h3>
		 <div class="container">
            <div class="table-responsive">
					<table class="table table-striped table-bordered">
                <thead>
                    <tr>
                    
                        <th>Student</th>
                        
                        <th>Present?</th>
                        
                        <th>hours</th>
                    <!--     <th>Course
                        <select>
                            <optgroup label="Name" >
                            <option name="course" value="mechanica">Mechanenica</option>
                            <option name="course" value="Math">Math</option>
                            <option name="course" value="Security">Security</option>
                            <option name="course" value="E-commerce">E-commerce</option>
                            <option name="course" value="Android">Android</option>
                            </optgroup>
                        </select>
                        </th> -->
                        <th>Remark</th>
                        
                    </tr>
                    </thead>
                    <tbody>
                    	<c:forEach var="att" items="${attendance }">
                    
                    <tr >
                    
                    <td >${att.sname}</td>
                 <%--  
                 
                 <td >${att.student.user.firstname}</td>
                   <td >${att.student.user.id}</td>--%>
                        
       <c:choose>
    <c:when test="${att.pre=='0'}">
       <td  ><%-- <input type="checkbox" disabled >--%> <span style="color:red;font-weight:bold"> <b>absent</b></span> </td> 
        <br />
    </c:when>    
    <c:otherwise>
        <td  ><%-- <input type="checkbox" checked="checked" disabled> --%> <span style="color:green;font-weight:bold"> present </span>  </td> 
        <br />
    </c:otherwise>
</c:choose>
                        
                        <td >${att.hours} %</td> 
                       
                        
                        <td >${att.remarkText }</td>
                    </tr>
              		
									
									
									
									
								
							</c:forEach>
           </tbody>
                </table>
                </div>
                
            </div>
		
		<%--
		
			<div class="container text-center" id="tasksDiv">
				<h3>All Attendances</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>time</th>
								<th>studentname</th>
								<th>remarks</th>
								<th>Type</th>
								
							</tr>
						</thead>
						<tbody>
							<c:forEach var="att" items="${attendance }">
								<tr>
									<td>${att.id}</td>
									<td>${att.hours}</td>
									<td>${att.student.user.firstname}</td>
									<td>${att.remarkText } </td>
									
									- <td>${attendance.term}</td>
									<td>${att.course.name}</td>
									<td>${attendance.type}</td>
									<td>${attendance.instructor}</td>
									<td>${attendance.year}</td>
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
			--%>
</body>
</html>