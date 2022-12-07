<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show-emp-details</title>
</head>
<body>
<%--    <h2>Your sign in as: ${param.employeeName}</h2>--%>
    Your name: ${employee.name}
    <br>
    Your surname: ${employee.surname}
    <br>
    Your salary: ${employee.salary}
    <br>
    Your department: ${employee.department}
    <br>
    You want this car: ${employee.carBrand}

    <br>
    <ul>
        <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
        </c:forEach>
    </ul>

</body>
</html>
