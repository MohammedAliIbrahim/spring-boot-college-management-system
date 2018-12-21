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

<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>





<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Iattendance</title>
</head>
<body>
<script>
$(document).ready(function(){
    $("#button").click(function(){
        $("#test").hide(10000);
    });
});
</script>

<script >


$("#success-alert").fadeTo(2000, 500).slideUp(500, function(){
    $("#success-alert").slideUp(500);
});


function overlay()
{
    var cookieValue = document.getElementById("demo").value;    
   // alert(cookieValue);
  //  console.log(cookieValue);
     document.getElementById("input").value=  cookieValue ;
    
    //overlay();
    
}

</script>
                        <select id = "demo" name="course" onchange="overlay();">
  <option value="2">math</option>
  <option value="2">Android</option>
  <option value="3">security</option>
  <option value="4">Audi TT</option>
</select>

<h3> Submitting  Students' Attendance in ${courseno}  
<br/>

<hr/>
 order of section :  ${orderofsection}  </h3>
 
 <!--  <div  id = "test" class="alert alert-danger fade in">
                <a href="#" class="close" data-dismiss="alert">&times;</a>
                 the student is already submitted ${message}
</div>-->
 <div>  ${message}   </div>

<c:forEach var="student" items="${students }">
<%-- <c:forEach var="att" items="${atts }">--%>
		<form:form  class="form-horizontal" method="POST" modelAttribute="attendance" action="attendance-saved" >
	<%-- 	<form class="form-horizontal" method="POST" action="attendance-saved">--%>
	
	<div class="container">
				<div class="table-responsive">
				
				
				
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								
								<th>Student</th>
                        <th>Present?</th>
                        <th>remark</th>
                        
                      
							
							</tr>
						</thead>
						<tbody>
						
							
								<tr>
								
									<td>
									
									${student.name}
									<%-- ${student.user.firstname}--%></td>
								<td>
								
								<form:checkbox path = "pre" /></div>
									<input type="hidden" name="id" value="${attendance.id }" />
									<input type="hidden" name="sname" value=" ${student.name}" />
									<input type="hidden" name="secorder" value=" ${orderofsection}" />
									<input type="hidden" name="coursename" id="input" value="${courseno}" />
									<input type="hidden" name="secserial" value=" ${orderofsection}" />
								<td>
								<input type="text" class="form-control" name="remarkText"
								value="${attendance.remarkText }" />
								
								<input type="hidden" name="studentId"  value="${student.id}"/></td>
									
						<%-- 		<td><form:checkbox path = "done" /></td> --%>
								 <%-- <td><form:hidden path = "done" /></td>--%>
								<td>
						<input type="submit" id="button" class="btn btn-primary" value="assign" />
					</td>
								
								<%-- 
								   <c:choose>
    <c:when test="${atts=='ggggg'}">
    <td  ><!-- <input type="checkbox" checked="checked" disabled> --> <span style="color:green;">  &#9989;  </span>  </td>
    	<td><div class="form-group ">
						<input type="submit" class="btn btn-primary" value="assign" />
					</div></td>	
      
        <br />
        
        -
    </c:when>    
    <c:otherwise>
   <td><div class="form-group ">
						<input type="submit" class="btn btn-primary" value="assign" />
					</div></td>	
         
        <br />
    </c:otherwise>
</c:choose> 

--%>

							<%-- 	<td><div class="form-group ">
						<input type="submit" class="btn btn-primary" value="assign" />
					</div></td>	--%>
								<%-- 	<td>${student.user.firstname}</td>
									<td>${student.user.joinDate}</td>
									<td><a href="/delete-student?id=${student.id }"><span
											class="glyphicon glyphicon-trash"></span></a></td>
									<td><a href="/edit-student?id=${student.id }"><span
											class="glyphicon glyphicon-pencil"></span></a></td>--%>
								</tr>
							
						</tbody>
					</table>
				</div>
				</div>
			 <center>
		<%-- <div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Add attendance" />
					</div>--%>
					</center>
					
					</form:form>
				
					</c:forEach>
</body>
</html>