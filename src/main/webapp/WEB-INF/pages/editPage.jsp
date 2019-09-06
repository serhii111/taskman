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
    <c:if test="${empty task.description}">
        <title>Add Task</title>
    </c:if>
    <c:if test="${!empty task.description}">
        <title>Edit Task</title>
    </c:if>
</head>
<body>
<c:if test="${empty task.description}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty task.description}">
    <c:url value="/edit" var="var"/>
</c:if>

<form action="${var}" method="post">
    <c:if test="${!empty task.description}">
        <input type="hidden" name="id" value="${task.id}">
    </c:if>
    <label for="description">Description</label>
    <input type="text" name="description" id="description">
    <label for="priority">Priority</label>
    <input type="text" name="priority" id="priority">
    <label for="done">Done</label>
    <input type="text" name="done" id="done">
    <c:if test="${empty task.description}">
        <input type="submit" value="Add new task">
    </c:if>
    <c:if test="${!empty task.description}">
        <input type="submit" value="Edit task">
    </c:if>
</form>

</body>
</html>
