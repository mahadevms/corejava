<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update mobile</title>
</head>
<body>
<h2>Change mobile Number here</h2>
<form action="updateMobile" method="post">
<pre>
email<input type="email" name="email" value="<%=request.getAttribute("email")%>"/>
mobile<input type="number" name="mobile" value="<%=request.getAttribute("mobile")%>"/>
<input type="submit" value="update"/>
</pre></form>
</body>
</html>