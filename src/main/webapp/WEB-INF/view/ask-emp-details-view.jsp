<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ask-emp-details</title>
</head>
<body>
    <h2>ask-emp-details</h2>
    <br>

    <form:form action="showDetails" modelAttribute="employee">
        Name <form:input path="name"></form:input>
        <br><br>
        Surname <form:input path="surname"></form:input>
        <br><br>
        Salary <form:input path="salary"></form:input>
        <br><br>
        <input type="submit" value="Send">
    </form:form>
<%--    HTML--%>
<%--    <form action="showDetails" method="post">--%>
<%--        <label>--%>
<%--            <input type="text" name="employeeName"--%>
<%--            placeholder="Write your Name">--%>
<%--        </label>--%>
<%--        <input type="submit">--%>
<%--    </form>--%>

<%--    spring-form--%>


</body>
</html>
