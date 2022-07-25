<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Students list</title>
</head>
<body>
<div align="center">
    <form action="/registrationapp/showAddStudentPage">
        <input type="submit" value="Add student">
    </form>
<table border="1">
    <thead>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>mobile</td>
        <td>country</td>

    </tr>
    </thead>

    <c:forEach var="student" items="${students}">
        <tr>
            <td> ${student.id} </td>
            <td> ${student.name} </td>
            <td> ${student.mobile} </td>
            <td> ${student.country} </td>
            <td> <a href="/registrationapp/updateStudent?UserId=${student.id}">Update</a> </td>
        </tr>
    </c:forEach>

</table>
</div>
</body>
</html>
