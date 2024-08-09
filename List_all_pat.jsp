<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Patient</title>
</head>
<body bgcolor="pink">
<pre>
					<h2>List All Patients in our Hospital</h2>
<hr>
<table border="1" cellpadding="10" cellspacing="10">
<tr>
<th>id</th>
<th>FirstName</th>
<th>LastName</th>
<th>email</th>
<th>Mobile</th>
<th>Blood group</th>
<th>Age</th>
<th>Delete</th>

</tr>


<c:forEach var="patients" items="${patients}">
<tr>
<td>${patients.id}</td>
<td>${patients.fname}</td>
<td>${patients.lname}</td>
<td>${patients.email}</td>
<td>${patients.mobile}</td>
<td>${patients.blood_group}</td>
<td>${patients.age}</td>
<td><a href="deletepat?id=${patients.id}">delete</a></td>

</tr>
</c:forEach>

</table>
</pre>
</body>
</html>