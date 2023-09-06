<%--
  Created by IntelliJ IDEA.
  User: dinindu
  Date: 2023-09-06
  Time: 13.57
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="lk.ijse.dep10.jstl.Student" %>
<%@ page import="lk.ijse.dep10.jstl.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>JSTL Demos</title>
</head>
<body>
<h1>Here the objects that we created in Hello servlet</h1>
<p>Your student index number is ${s1.id}. His name is ${s1.name}</p>

<br>
<br>
<p>
<p>Welcome, ${user.firstName} ${user.lastName}!</p>
<p>Your age is ${user.age}</p>
<c:if test="${user.admin}">
    <p>You have administrator privileges.</p>
</c:if>
</p>

${s1}<br>
${user}<br>
${studentList}
<hr>

<%--    How to loop a arrayList>--%>
<c:forEach items="${studentList}" var="s">
    ${s}<br>
</c:forEach>
<hr>


<%--sql connection--%>

<%--Getiing the sql connecton--%>
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/dep10_pos"
                   user="root" password="mysql"/>

<%--setting the sql query--%>
<sql:query var="rs" dataSource="${db}">
    select * from item
</sql:query>

<%-- printing the result set--%>
<c:forEach items="${rs.rows}" var="item">
    <c:out value="${item.code}"/> :<c:out value="${item.description}"/> : <c:out value="${item.qty}"/> : <c:out
        value="${item.unit_price}"/> <br>
</c:forEach>
<hr>


<%--JSTL functions--%>

<%--to count the characters--%>
<c:set var="myStr" value="My name is Dinindu Lokugamage"/>
${myStr}<br>
Length : ${fn:length(myStr)}<br>

<%--To split a string--%>
<c:set var="myStr2" value="Dinindu Tharuka Pasindu Dasun Nuwan"/>
<c:set var="age" value="23 24 25 23 24"/>
<c:set var="address" value="Mathara Galle Yakkal Ekala Kandy"/>

<p>This is split method</p>
<ol>
    <c:forEach items="${fn:split(myStr2, ' ')}" var="name">
        <li>${name}</li>
    </c:forEach>
</ol>

<hr>
<%--To get the index of --%>
index of : ${fn:indexOf(myStr, "is")}<br>

<%--contain--%>
contain : ${fn:contains(myStr, 'Dinindu')}<br>

<%--ends with>--%>
Does it ends with Lokugamage?${myStr} <c:if test="${fn:endsWith(myStr, Lokugamage)}">
    it does end with Lokugamage
</c:if>
<br>

<%--lowercase and uppercase--%>
${fn:toLowerCase(myStr)}<br>
${fn:toUpperCase(myStr)}<br>


</body>
</html>
