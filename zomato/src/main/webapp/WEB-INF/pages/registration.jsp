<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menuPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h2>fill the form here</h2>

<form action="registration" method="post">
<pre>
name<input type="text" name="name"/>
city<input type="text" name="city"/>
email<input type="email" name="email"/>
mobile<input type="number" name="mobile"/>
<input type="submit" value="save"/>
</pre></form>

<%if(request.getAttribute("msg")!=null){
	out.println(request.getAttribute("msg"));
	
	
}%>
</body>
</html>