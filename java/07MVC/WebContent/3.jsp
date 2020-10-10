<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cn.itcast.domain.Address"%>
<%@page import="java.util.List" %>
<%@page import="javax.servlet.jsp.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="cn.itcast.domain.Person" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
       
       <%
           String data="abcd";
           request.setAttribute("data",data);
       %>
       
       ${data }    <%-- pageContext.findAttribute("data") page request session application --%>
       <br/>
       <%
            Person p=new Person();
            p.setName("aaaaaa");
            
            request.setAttribute("person",p);
       %>
       ${person.name }
       <br/>
       
       <%
           Person p1=new Person();
           Address a=new Address();
           a.setCity("上海");
           p1.setAddress(a);
           
           request.setAttribute("p1",p1);
       %>
       
       ${p1.address.city }
       
       <br/>
       <%
           List list=new ArrayList();
           list.add(new Person("aaaaa"));
           list.add(new Person("bbbbb"));
           list.add(new Person("ccccc"));
           
           request.setAttribute("list",list);
           
       %>
       ${list[1].name }  
       
       <br/>
       <%
         Map map=new HashMap();
         map.put("aa", new Person("aaaaaaaa"));
         map.put("bb", new Person("bbbbbbbb"));
         map.put("cc", new Person("cccccccc"));
         map.put("dd", new Person("dddddddd"));
         request.setAttribute("map",map);
       %>
      
       	${map.cc.name }
        
        <!-- 获取当前web应用的名称 -->
        ${pageContext.request.contextPath }
        <a href="${pageContext.request.contextPath }/index.jsp">点点</a>
</html>