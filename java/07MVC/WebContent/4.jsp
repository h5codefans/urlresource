<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="cn.itcast.domain.Person" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>使用jstl+el完成集合迭代</title>
</head>
<body>
    
        <%
           List list=new ArrayList();
           list.add(new Person("aaa"));
           list.add(new Person("bbb"));
           list.add(new Person("ccc"));
           
           request.setAttribute("list",list);
        %>
        
        <c:forEach var="person" items="${list }">
           ${person.name }<br/>
        </c:forEach>
        
        <br/>
        <%
           Map map=new HashMap();
           map.put("aa",new Person("aaa"));
           map.put("bb",new Person("bbb"));
           map.put("cc",new Person("ccc"));
           request.setAttribute("map",map);
        %>
        
        <c:forEach var="entry" items="${map }">           list.add(new Person("bbb"));
           list.add(new Person("ccc"));
           
               ${entry.key }:${entry.value.name }<br/>
        </c:forEach>
        
        <c:if test="${user!=null }">
                              欢迎您：${user.username }
        </c:if>
        
        <c:if test="${user==null }">
                                   用户名：<input type="text">
                                   密码:<input type="password">
        </c:if>
</body>
</html>