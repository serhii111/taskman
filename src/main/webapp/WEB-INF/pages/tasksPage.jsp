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
    <%--<link rel="stylesheet" type="text/css" href="<c:url value="/resources/colori.css" />">--%>
    <link rel="stylesheet" type="text/css" href="/resources/colori.css">
</head>

<body>
<h2 class="colorized">Welcome to the Taskman!</h2>

<table>
    <tr>
        <th>id</th>
        <th>description</th>
        <th>priority</th>
        <th>done</th>
        <th>action</th>
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

<h2>Add task</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new task</a>

</body>
</html>
