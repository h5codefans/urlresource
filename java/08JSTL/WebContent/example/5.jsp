<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/example" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   
   <%
      List list=new ArrayList();
      list.add("aaaa");
      list.add("bbbb");
      list.add("ccccc");
      request.setAttribute("list", list);
   %>
   
   <c:foreach2 var="str" items="${list }">
       ${str }
   </c:foreach2>
   
   <br/>-----------------------------------------------<br/>
   <%
      Map map=new HashMap();
      map.put("aa","111");
      map.put("bb","222");
      map.put("cc","333");
      map.put("dd","444");
      request.setAttribute("map", map);
   %>

   <c:foreach2 var="entry" items="${map }">
       ${entry.key} = ${entry.value }
   </c:foreach2>
   
   <br/>-----------------------------------------------<br/>
   <%
      Integer num[]={1,2,3,4};
      request.setAttribute("num", num);
   %>
   
   <c:foreach2 var="i" items="${num}">
       ${i }
   </c:foreach2>
   
   <br/>-----------------------------------------------<br/>
   <%
      int arr[]={1,2,3,4};
      request.setAttribute("arr", arr);
   %>
   
   <c:foreach2 var="i" items="${arr}">
       ${i }
   </c:foreach2>
   
   <br/>-----------------------------------------------<br/>
   <%
      boolean b[]={true,false,true};
      request.setAttribute("b", b);
   %>
   
   <c:foreach2 var="i" items="${b}">
       ${i }
   </c:foreach2>
</body>
</html>