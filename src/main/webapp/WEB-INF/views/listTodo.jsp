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
<c:if test="${empty list}">                        
 Dear ${name} you have no todos
</c:if>
Dear ${name}, Here are you todos 
 
<h4>Tasks List</h4>
                             
  <table class="table">                                  
 <thead>
					<tr>
						
						<th>Id</th>
						<th>UserName</th>
						<th>Task</th>
						<th>Due Date</th>
						<th>IsCompleted</th>
<!-- 						<th>DateOfCompletion</th>
 -->					<th>Action</th>
					</tr>
</thead>
<tbody>
				<c:forEach var="todo" items="${list}">
                       
					<tr><td>${todo.id}</td>
						<td>${todo.userName}</td>
						 <td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.isCompleted}</td>
					<td><a type="button" class="btn btn-warning" href="/deleteTodo?id=${todo.id}">Delete</a></td>
 
					
						
					</tr>
					</c:forEach>

				</tbody>
   </table>
  <div></div>
  <a class="button" href="/add">add todo</a>
  </div>
  
  <script src="webjars/bootstrap/4.5.3/css/bootstrap.min.css"></script>
    <script src="webjars/jquery/3.5.1/jquery.min.js"></script>
  
  
</body>
</html>