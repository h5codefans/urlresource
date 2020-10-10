<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext对象访问其它域</title>
</head>
<body>
   
    <%
       request.setAttribute("data", "aaa");
    
       String data=(String)pageContext.getAttribute("data", PageContext.REQUEST_SCOPE);
       out.write(data);
       
       pageContext.findAttribute("data");   //查找顺序page request session application 重点
    %>
       
       
</body>
</html>