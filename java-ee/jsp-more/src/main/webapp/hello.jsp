<%@ page import="java.util.Scanner" %><%--
  Created by IntelliJ IDEA.
  User: dinindu
  Date: 2023-09-03
  Time: 00.12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Directive(import Directive)--%>
<%@page import="java.util.Scanner" %>
<html>
<head>
    <title>Learn JSP</title>
</head>
<body>
    <h1>Learn JSP</h1>

<%--scriptlet--%>
    <%
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        int num1 = 10;
        out.println(num1+"<br>");
    %>

<%--    Expression--%>
    <%=
        "Hi, "+name + ". You are "+age+ " years old. You are from "+address +"."
    %>

<%--    Declarations--%>
    <%!
        String address = "Colombo";
        Scanner scanner =new Scanner(System.in);


        {
            System.out.println("This is outside service()");
        }
    %>


</body>
</html>
