<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Doctor Registration</title>
<style>
.form{
background-color:"pink"
}
body{
background-color:"black"
font-color:"white"
background-image:url("")

}


</style>
</head>
<body>
				<h2>New Doctor Registration</h2>
<hr>
<form action="savedoctor" method="post">
<pre>
			First name :<input type="text" name="fname"/>

			Last name  :<input type="text" name="lname" />

			Email	   :<input type="text" name="email" />

			Mobile number :<input type="number" name="mobile" />

<input type="submit" value="Register Doctor"/>
</pre>
</form>
</body>
</html>