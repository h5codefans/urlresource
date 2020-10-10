<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext对象的其它常用方法</title>
</head>
<body>
   <%
      pageContext.forward("/1.jsp");
      //pageContext.include("/foot.jsp");
   %>
</body>
</html>