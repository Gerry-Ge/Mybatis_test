<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

 <%@ page isELIgnored="false" %> jsp页面无法使用C标签的EL表达式解决方法一--%>
<%@ page import="org.gerry.beans.UserBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<p>${DBUrl}</p>
<c:forEach items="${Users}" var="user" varStatus="status">
${user.username},${user.password},${status.index}</br>
</c:forEach>
</body>
</html>