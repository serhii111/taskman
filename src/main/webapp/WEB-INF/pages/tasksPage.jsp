<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sm
  Date: 9/2/19
  Time: 1:09 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Tasks</title>
    <%--<link rel="stylesheet" type="text/css" href="/resources/colori.css">--%>
    <%--<link rel="stylesheet" type="text/css" href="<c:url value='/resources/colori.css' />"/>--%>
    <%--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/colori.css"/>--%>
    <style>
        <%@ include file="/resources/colori.css"%>
    </style>
</head>

<body>
<h2 class="header">Welcome to the Taskman!</h2>

<table class="table">
    <tr class="tableHeader">
        <th>Id</th>
        <th>Task Description</th>
        <th>Priority</th>
        <th>Done</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="task" items="${tasks}">
        <tr>
            <td>${task.id}</td>
            <td>${task.description}</td>
            <td>${task.priority}</td>
            <td>${task.done()}</td>
            <td>
                <a href="/edit/${task.id}">Edit task</a>
                <a href="/delete/${task.id}">Delete task</a>
            </td>

        </tr>
    </c:forEach>
</table>

<c:url value="/add" var="add"/>
<a href="${add}">Add task</a>

</body>
</html>
