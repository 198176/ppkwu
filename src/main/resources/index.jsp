<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formularz</title>
</head>
<body>
    <form:form method="POST" modelAttribute="formRequest">
        MAIL: <form:input path="mail"/><font color="red"><form:errors path="mail"/></font><br>
        NIP: <form:input path="nip"/><font color="red"><form:errors path="nip"/></font><br>
        PESEL: <form:input path="pesel"/><font color="red"><form:errors path="pesel"/></font><br>
        REGON: <form:input path="regon"/><font color="red"><form:errors path="regon"/></font><br>
        KOD POCZTOWY: <form:input path="kod"/><font color="red"><form:errors path="kod"/></font><br>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
