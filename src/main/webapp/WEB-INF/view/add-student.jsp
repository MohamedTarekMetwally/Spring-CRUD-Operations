<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h3>Add Student</h3>
    <%--@elvariable id="student" type="api"--%>
    <form:form action="save-student" modelAttribute="student" method="POST">


        <label>Name: </label>
        <form:input path="name"/>
        <br>

        <label>Mobile: </label>
        <form:input path="mobile"/>
        <br>

        <label>Country: </label>
        <form:input path="country"/>
        <br>

        <input type="submit" value="submit">

    </form:form>
</div>

</body>
</html>
