<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>


<html>
<head>
    <title>Employee List</title>
    <link rel="stylesheet" type="text/css" href="">
    <link href="https://fonts.googleapis.com/css2?family=VT323&display=swap" rel="stylesheet">

</head>

<body>
<h2>Login</h2>
<form method="post" action="${pageContext.request.contextPath}/users/registered">
    <div>
        <label>Name:</label>
        <input type="text" name="name" required />
    </div>
    <div>
        <label>Phone:</label>
        <input type="number" name="phone" required />
    </div>
    <div>
    <label>Email:</label>
    <input type="text" name="email" required />
    </div>
    <div>
        <label>Password:</label>
        <input type="password" name="password" required />
    </div>

    <div>
        <button type="submit">Register</button>
    </div>
</form>
</body>
</html>
