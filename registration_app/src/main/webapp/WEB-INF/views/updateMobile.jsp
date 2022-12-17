<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
<h2>update here</h2>
<form action="update" method="post">
email<input type="email" name="email" value="<%=request.getAttribute("email")%>"/>
mobile<input type="number" name="mobile" value="<%=request.getAttribute("mobile")%>"/>
<input type="submit" value="update"/>

</form>
</body>
</html>