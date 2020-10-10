<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="cn.itcast.domain.User" %>
<%@taglib uri="/my" prefix="my" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
      
     <%
        User user=new User();
        user.setUsername("aaaa");
        session.setAttribute("user", user);
     %>
     ${user!=null?my:add("欢迎您：",user.username):"" }
</body>
</html>