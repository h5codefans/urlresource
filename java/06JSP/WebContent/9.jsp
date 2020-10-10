<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext隐式对象</title>
</head>
<body>
      <!-- 用在自定义标签开发技术里面 -->
      
      <%
         String data=(String)request.getAttribute("aaaaaa");
         out.write(data);
         
         pageContext.setAttribute("data", data);
      %>
      
</body>
</html>