<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Technician Registration</title>
</head>
<body >
				<h2>New Technician Registration</h2>
<hr>
<form action="savetechnician" method="post">
<pre>
			First name :<input type="text" name="fname"/>

			Last name  :<input type="text" name="lname" />

			Email	   :<input type="text" name="email" />
			
			Age	   	   :<input type="number" name="age" />
			
			Domain	   :<input type="text" name="domain" />

			Mobile number :<input type="number" name="mobile_number" />

<input type="submit" value="Register Technician"/>
</pre>
</form>
</body>
</html>