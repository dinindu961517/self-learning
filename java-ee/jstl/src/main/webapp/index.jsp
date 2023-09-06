<%@ page import="lk.ijse.dep10.jstl.Student" %>
<%@ page import="lk.ijse.dep10.jstl.User" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a><br>





<%--To create a variable--%>
<%--<c:set var="s1" property="name" value="Tharuka" /><br>--%>

<%--To add a resource--%>
<%--<c:import url="http://www.google.com"/>--%>

<%--Expression language--%>

${1+2}<br>





</body>
</html>