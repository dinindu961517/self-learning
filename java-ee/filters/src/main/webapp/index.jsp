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
<a href="hello-servlet">Hello Servlet</a>

<form action="hello-servlet" >
    Enter your name : <input type="text" name="name"><br><br>
    Enter your age :<input type="text" name="age"><br><br>
    <input type="submit" name="Submit">
</form>

<form action="">
</form>
</body>
</html>