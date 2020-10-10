<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>out隐式对象</title>
</head>
<body>
    <p> 满足任何一个条件时，out对象才去调用ServletResponse.getWriter方法， 
     并通过该方法返回的PriterWriter对象将out对象的缓存区中的内容真正写入到</p>
     Servlet引擎提供的缓存区中：
     <p>1.设置page指令的buffer属性关闭了out对象的缓存功能</p>
     <p>2.out对象的缓冲去以满</p>
     <p>3.整个JSP页面结束</p>
     
      <p>aaaaaaaaaaaa  转换为out.write()输出</p>
     <p>
     <%
        //out.write("hahhahahhahahahhaha");
        response.getWriter().write("wowowowowowowo");
     %>
     </p>
</body>
</html>