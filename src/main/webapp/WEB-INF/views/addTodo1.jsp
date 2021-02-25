<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
  <link  href="webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">

<body>
<div class="conatiner">
Dear ${name},Plz add your todo here
 <form method ="post" action="/addTodo">
 <filedset class="form-group  "> 
 <label>Description </label>
   <input type="text" name ="desc" class="form-control" required="required"/>
 </filedset>
   <input type="submit" class="btn btn-success"/> 
 
 </form>
 </div>
  <script src="webjars/bootstrap/4.5.3/css/bootstrap.min.css"></script>
    <script src="webjars/jquery/3.5.1/jquery.min.js"></script>
   
</body>
</html>