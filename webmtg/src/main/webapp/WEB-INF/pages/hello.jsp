<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":"
			+ request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<title>Spring 3.0 MVC demo</title>
</head>
<body>
	<a href="initMtg.html?game_name='mtg'">试试mtg</a>
</body>
</html>

