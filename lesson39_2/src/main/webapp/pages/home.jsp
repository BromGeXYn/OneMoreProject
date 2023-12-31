
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Films repository</title>
</head>
<body>
<form action="/save" method="post">
    <input type="text" name="title" placeholder="Film title"><br>
    <input type="text" name="genre" placeholder="Film genre"><br>
    <input type="number" name="year" placeholder="Release year"><br>
    <input type="number" name="rate" placeholder="Rate from 1 to 10"><br>
    <input type="submit" value="Save">
</form>

<hr>

<form action="/get" method="get">
    <input type="number" name = "id" placeholder="id"><br>
    <input type="submit" value="Find">
</form>

${film.title}
<hr>
<ul>
    <c:forEach items="${films}" var="film">
        <li>${film.title}</li>
    </c:forEach>
</ul>
</body>
</html>
