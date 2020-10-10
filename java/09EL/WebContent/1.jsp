<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="cn.itcast.domain.Person"%>
<%@page import="cn.itcast.domain.Address"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>el表达式获取数据示例</title>
  </head>
  
  <body>
    
    <% 
    	request.setAttribute("name","aaa");
    %>
    
    ${name }  <%--pageContext.findAttribute("name") --%>
    
    <br/><hr><br/>
   
    <!-- 在jsp页面中，使用el表达式可以获取bean的属性 -->
    <% 
    	Person p = new Person();
    	p.setAge(12);
    	request.setAttribute("person",p);
    %>
    ${person.age }

    <br/><hr><br/>
    <!-- 在jsp页面中，使用el表达式可以获取bean中的。。。。。。。。。的属性 -->
    <% 
    	Person person = new Person();
    	Address address = new Address();
    	person.setAddress(address);
    	request.setAttribute("person",person);
    %>
   ${person.address.name }
    
    <br/><hr><br/>
    <!-- 在jsp页面中，使用el表达式获取list集合中指定位置的数据 -->
    <% 
    	Person p1 = new Person();
    	p1.setName("aa111");
    	
    	Person p2 = new Person();
    	p2.setName("bb");
    	
    	List list = new ArrayList();
    	list.add(p1);
    	list.add(p2);
    	
    	request.setAttribute("list",list);
    %>
    
    ${list[1].name }  <!-- 取list指定位置的数据 -->
    
    <!-- 迭代集合 -->
    <c:forEach var="person" items="${list}">
    	${person.name }
    </c:forEach>
    
   <br/><hr><br/>
    
    
    <!-- 在jsp页面中，使用el表达式获取map集合的数据 -->
    
    <% 
    	Map map = new HashMap();
    	map.put("a","aaaaxxx");
    	map.put("b","bbbb");
    	map.put("c","cccc");
    	map.put("1","aaaa1111");
    	request.setAttribute("map",map);
    %>
    
  	${map.c }  <!-- 根据关键字取map集合的数据 -->
  	${map["1"] }
  	
  	<c:forEach var="me" items="${map}">
  		${me.key }=${me.value }<br/>
  	</c:forEach>
  	
    <br/><hr><br/>
    
  </body>
</html>
