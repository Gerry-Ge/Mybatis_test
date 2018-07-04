<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="org.gerry.main.test_mysql_hibernate"%>
<jsp:useBean id="obj" class="org.gerry.beans.HEmployee"></jsp:useBean>
<jsp:setProperty property="*" name="obj" />

<%
    int i = test_mysql_hibernate.Insert(obj);
    if (i > 0) {
        out.print("You are successfully registered");
    }
%>
</body>
</html>