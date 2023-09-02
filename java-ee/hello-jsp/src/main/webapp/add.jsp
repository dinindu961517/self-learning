<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: dinindu
  Date: 2023-09-01
  Time: 21.51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Hello JSP</title>
</head>
<body>
    <h1>Hello JSP</h1>
    <%
        String name = request.getParameter("name");
        PrintWriter writer = response.getWriter();
        writer.println("Welcome " + name);
        out.println(name);
    %>

</body>
</html>