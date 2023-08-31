<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add-Two-Numbers</title>
</head>
<body>
<h1> "Get the addition of two numbers" >
</h1>
<br/>
    <form action="add" method="get"> <!--default method is get -->
        Enter first number     : <input type="text" name="num1"> <br><br>
        Enter second number : <input type="text" name="num2"> <br>
        <input type="submit">
    </form>
<h1> "Get the multiplication of two numbers" >
</h1>
<br/>
<form action="add" method="post">
    Enter first number     : <input type="text" name="num1"> <br><br>
    Enter second number : <input type="text" name="num2"> <br>
    <input type="submit">
</form>
</body>
</html>