<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sm
  Date: 9/2/19
  Time: 1:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit task</title>
</head>
<body>
<c:url value="/edit" var="var"/>
<form action="${var}" method="post">
    <input type="hidden" name="id" value="${task.id}">
    <label for="description">Description</label>
    <input type="text" name="description" id="description">
    <label for="priority">Priority</label>
    <input type="text" name="priority" id="priority">
    <label for="done">Done</label>
    <input type="text" name="done" id="done">
    <input type="submit" value="Edit task">
</form>

</body>
</html>
