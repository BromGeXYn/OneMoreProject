<%@ page import="java.util.Date" %>
<%@ page import="org.lesson23.DataBase" %>
<%@ page import="org.lesson23.domain.Car" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<%
    Object cars1 = request.getAttribute("cars");
    if (cars1 != null){
        List<Car> cars = (List<Car>)request.getAttribute("cars");
        for (Car car : cars) {
            out.print("<form action='/delete' method = 'post'>");
            out.print("<tr><td>" + car.getModel() + "</td><td>" + car.getBrandName());
            out.print("<input type = 'hidden' name = 'deleteId' value = '" + car.getId() + "'>"  + "</td>");
            out.print("<td><input type='submit' value='Delete'>");
            out.print("</form></td></tr>");
        }
    }
%>
</table>
</body>
</html>
