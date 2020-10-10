<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/example" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   
    <%
        session.setAttribute("user", "aaa");
    %>
    <c:if test="${user==null }">
       aaaaaaaa
    </c:if>
    <c:if test="${user!=null }">
     bbbbbbbbbb
    </c:if>
</body>
</html>