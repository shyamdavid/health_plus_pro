<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Patient Registration</title>
</head>
<body >
				<h2>New Patient Registration</h2>
<hr>
<form action="savepatient" method="post">
<pre>
			First name :<input type="text" name="fname"/>

			Last name  :<input type="text" name="lname" />

			Email	   :<input type="text" name="email" />
			
			Age	   	   :<input type="text" name="age" />
			
			Blood group	   :<input type="text" name="bgroup" />

			Mobile number :<input type="number" name="mobile" />

<input type="submit" value="Register Patient"/>
</pre>
</form>
</body>
</html>