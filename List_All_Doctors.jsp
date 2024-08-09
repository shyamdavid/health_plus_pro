<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ include file="Menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Doctors</title>

</head>
<body bgcolor="pink" >

<pre>
					<h2>List All Doctors in our Hospital</h2>
<hr>
<table cellpadding="10" cellspacing="10" border="1">
<tr>
<th>id</th>
<th>FirstName</th>
<th>LastName</th>
<th>email</th>
<th>Mobile</th>
</tr>


<c:forEach var="doctor" items="${doctor}">
<tr>
<td>${doctor.id}</td>
<td>${doctor.fname}</td>
<td>${doctor.lname}</td>
<td>${doctor.email}</td>
<td>${doctor.mobile}</td>
</tr>
</c:forEach>

</table>
</pre>
</body>
</html>