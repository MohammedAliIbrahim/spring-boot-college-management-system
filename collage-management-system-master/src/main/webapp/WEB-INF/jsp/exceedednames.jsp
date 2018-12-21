

    





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
 <!--   <style >


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

<center>  <h2>exceeded Students' Attendance in ${courseno}  </h2>

</center>
  
  
  <br/>
   <br/>
    <br/>
	<c:forEach var="att" items="${attendance }">
              
              					
	<center>					

<h3>  <a href="/attendancedetails?coursename=${courseno}&studentname=${att}" class="btn btn-info" role="button">${att}</a></h3>
 
		
		<br/>
		<br/>
	<hr/>
									
				</center>				
							</c:forEach>
							</div>	
</body>
</html>   
-->


					
		 <div class="container">
		 
		 <center>  <h2>exceeded Students' Attendance in ${courseno}  </h2>

</center>
            <div class="table-responsive">
					<table class="table table-striped table-bordered">
                <thead>
                    <tr>
                    
                        <th>Student</th>
                        
                        <th></th>
                        
                    
                        
                    </tr>
                    </thead>
                    <tbody>
                    	<c:forEach var="att" items="${attendance }">
                    
                    <tr >
                    
                    <td >${att}</td>
                 
                      
                        
                        <td > <a href="/attendancedetails?coursename=${courseno}&studentname=${att}" class="btn btn-info" role="button">details</a>  </td> 
                       
                        
                        
                    </tr>
              		
									
									
									
									
								
							</c:forEach>
           </tbody>
                </table>
                </div>
                
            </div>