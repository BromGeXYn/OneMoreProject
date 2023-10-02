<%@ page import="java.util.Date" %>
<%@ page import="org.lesson24.DataBase" %>
<%@ page import="org.lesson24.domain.Car" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="search" method="post">
    Search by brand: <input type="text" name="car_brand">
    <input type="submit" value="Search">
</form>
<br>
<hr>
    <form action="/add" method="post">
        Model:<input type="text" name="model"><br>
        Brand:<input type="text" name="car_brand"><br>
        Year: <input type="number" name="year"><br>
        Color:<input type="text" name="color"><br>
        <input type="submit" value="Add">
</form>
    <hr>
<table border = '1' width="350">
    <col width="150" >
    <col width="150" >
    <col width="50" >

    <c:forEach items="${cars}" var="car">
        <form action="/delete" method="post">
        <tr><td><${car.model}></td><td>${car.brandName}</td></tr>
        <input type="hidden" name="deleteId" value="${car.id}">
        <input type="submit" value="Delete">
        </form>
    </c:forEach>
</table>
</body>
</html>
