<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrations</title>
</head>
<body>
	<h2>All Registrations</h2>
	<table>
	<thead>
		<tr>
			<th>Name</th>
			<th>city</th>
			<th>email</th>
			<th>mobile</th>
			<th>Action</th>
			<th>update mobile no</th>
		</tr>
	</thead>
	<%
		ResultSet res = (ResultSet)request.getAttribute("result");
	while(res.next()){ %>
		<tbody>
		<tr>
			<td><%=res.getString(1) %></td>
			<td><%=res.getString(2) %></td>
			<td><%=res.getString(3) %></td>
			<td><%=res.getString(4) %></td>
			<td> <a href="delete?emailId=<%=res.getString(3) %>">delete</a></td>
			<td><a href="update?emailid=<%= res.getString(3) %>&mobile=<%=res.getString(4) %>">update mobile number</a> </td>
		</tr>
		</tbody>
	<%} %>

	</table>
</body>
</html>