<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${not empty msg}">
                        
 ${msg}
 </c:if>
<form method="post" action="/welcome">
UserName <input type="text" name="name"/>
Password <input type="password" name="passwd"/>
<input type="submit" /> 
</form>
</body>
</html>