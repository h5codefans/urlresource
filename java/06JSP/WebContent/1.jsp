<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp入门(输出时间)</title>
</head>
<body>
   <font color="red">
            当前时间值是：
    <%
       Date date=new Date();
       //out.write(date.toLocaleString());
       String time=date.toLocaleString();
    %>
    <%=time %> <!-- 脚本表达式 ,它的作用就是向浏览器输出数据-->
    </font>
</body>
</html>