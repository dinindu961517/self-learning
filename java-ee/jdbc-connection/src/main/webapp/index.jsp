<%@ page import="javax.imageio.metadata.IIOMetadataFormatImpl" %>
<%@ page import="java.sql.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello.jsp">Hello Servlet</a>

<%
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://dep10.lk:3306/dep10_pos", "root", "mysql");
            Statement stm = connection.createStatement();
            ResultSet rs3= stm.executeQuery("SELECT * from item");
            out.println("<ol>");
            while (rs3.next()) {

                out.println("<li>" + rs3.getString("code")+"</li>");
                out.println("<li>" + rs3.getString("description") + "</li>");
                out.println("<li>" + rs3.getString("qty")+"</li>");
            }
            out.println("</ol>");
        } catch (Exception e) {
            throw new Exception(e);
        }
        %>
</body>
</html>