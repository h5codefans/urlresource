<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp:setProperty标签</title>
</head>
<body>
    <jsp:useBean id="person" class="cn.itcast.domain.Person"/>
    
    <!-- 手工为bean属性赋值 -->
    <jsp:setProperty name="person" property="name"  value="xxxx"/>
    <%=person.getName() %><br/>
    
    <!-- 用请求参数给bean的属性赋值     http://localhost:8888/07MVC/2.jsp?name=wwwwww-->
    <jsp:setProperty name="person" property="name"  param="name"/>
    <jsp:setProperty name="person" property="age"  param="age"/>  <!-- 支持8种基本数据类型的转换（把客户机提交的字符串，转成相应的8种数据类型，赋到bean的属性上） -->
   
   <!-- http://localhost:8888/07MVC/2.jsp?name=wwww&age=123 -->
   <%-- 
      <jsp:setProperty name="person" property="birthday"  value="<%=new Date() %>"/>
   --%>
    
    <%=person.getName() %><br/>
    <%=person.getAge() %><br/>
    <%=person.getBirthday() %><br/>
    
    <br/>-------------------------------<br/>
    
    <!-- 用所有的请求参数为bean赋值 -->
    <jsp:setProperty name="person" property="*" />
    <%=person.getName() %><br/>
    <%=person.getAge() %><br/>
    
    <br/>---------------------------------<br/>
    <jsp:getProperty  name="person" property="name"/><br/>
    <jsp:getProperty  name="person" property="age"/><br/>
    <jsp:getProperty  name="person" property="birthday"/><br/>
    
</body>
</html>