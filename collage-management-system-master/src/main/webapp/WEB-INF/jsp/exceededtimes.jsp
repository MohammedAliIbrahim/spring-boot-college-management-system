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

<br/>

	<div class="panel panel-danger">
      <div class="panel-heading">Student name : ${sname}  </div>
      <div class="panel-body">Course title :  ${courseno}   </div>
       <div class="panel-body">no of times : ${attendance} </div>
       <c:choose>
    <c:when test="${attendance > 5}">
       <td  ><%-- <input type="checkbox" disabled >--%> <span style="color:red;font-weight:bold"> <b>attention , you have exceed the attendance permitted limit in  ${courseno } <br/> percentage of absence is : ${percentage} % </b></span> </td> 
        <br />
    </c:when>    
    <c:otherwise>
        <td  ><%-- <input type="checkbox" checked="checked" disabled> --%> <span style="color:green;font-weight:bold"> present </span>  </td> 
        <br />
    </c:otherwise>
</c:choose>
       
    </div>
</body>
</html>