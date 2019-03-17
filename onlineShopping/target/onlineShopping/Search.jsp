<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ page isELIgnored="false" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Batte Angadi</title>
</head>
<body>
	<h1>Search items</h1>
	<form action="search" method="post">
		Search : <input type="text" name="item" value="${item}"> <input
			type="submit" value="Search">
	</form>
	<h2>${message}</h2>
	<h3>${itemList}</h3>

	<c:forEach var="list" items="${itemList}"> 
           <c:out value="${list}"/> 
        </c:forEach>
</body>
</html>