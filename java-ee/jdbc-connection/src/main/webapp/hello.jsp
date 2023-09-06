<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %><%--
  Created by IntelliJ IDEA.
  User: dinindu
  Date: 2023-09-04
  Time: 20.20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Database</title>
</head>
<body>
  <table>
    <thead>
    <th>code</th>
    <th>description</th>
    <th>qty</th>
    <th>unit_price</th>
    </thead>

      <%
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://dep10.lk:3306/dep10_pos", "root", "mysql");
        Statement stm = connection.createStatement();
        ResultSet rs3= stm.executeQuery("SELECT * from item");
        out.println("<tbody>");
        while (rs3.next()) {
          out.println("<tr>");
          out.println("<td>" + rs3.getString("code")+"</td>");
          out.println("<td>" + rs3.getString("description") + "</td>");
          out.println("<td>" + rs3.getString("qty")+"</td>");
          out.println("<td>" + rs3.getString("unit_price")+"</td>");
          out.println("</tr>");
        }
        %>
    </tbody>
  </table>

</body>
</html>
