<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Login</title>
    <!-- Include Tailwind CSS -->
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-100 font-sans">
<div class="max-w-md mx-auto mt-10 p-8 bg-white rounded-lg shadow-md">
    <h2 class="text-2xl font-bold text-center mb-6">Login</h2>
    <form method="post" action="${pageContext.request.contextPath}/users/logged">
        <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Email:</label>
            <input type="text" name="email" required
                   class="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500"/>
        </div>
        <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Password:</label>
            <input type="password" name="password" required
                   class="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500"/>
        </div>
        <div class="text-center">
            <button type="submit"
                    class="w-full bg-indigo-600 text-white py-2 px-4 rounded-lg hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-indigo-500">
                Login
            </button>
        </div>
    </form>
</div>
</body>
</html>
