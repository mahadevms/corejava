<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menuPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration details</title>
</head>
<body>
<h2>Registration details</h2>
<table>
	<thead>
		<tr>
			<th>NAME</th>
			<th>CITY</th>
			<th>EMAIL</th>
			<th>MOBILE</th>
			<th>action</th>
		</tr>	
	</thead>
	<tbody>
	
		<% ResultSet res = (ResultSet)request.getAttribute("result");
		while(res.next()){%>
		<tr>
		<td><%=res.getString(1)%></td>
		<td><%=res.getString(2)%></td>
		<td><%=res.getString(3)%></td>
		<td><%=res.getString(4)%></td>
		<td><a href="delete?email=<%=res.getString(3)%>">delete</a> ,<a href="updateMobile?mobile=<%=res.getString(4)%>&email=<%=res.getString(3)%>">update</a></td>
		</tr>
					<%} %>
	
	</tbody>

</table>
</body>
</html>