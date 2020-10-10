<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="cn.itcast.domain.Person" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试jstl</title>
</head>
<body>

   <br/>---------------------c:out------------------------<br/>
    <%
        request.setAttribute("data", null);
    %>
    <c:out value="${data }" default="aaaa" escapeXml="true"/>
    
    <br/>--------------------c:set可以操作各个域 javabean Map结合------------------------<br/>
    <c:set var="data" value="xxxx" scope="page"></c:set>
    ${data }
    
    <%
       Map map=new HashMap();
       request.setAttribute("map", map);
    %>
    <c:set property="dd" value="xxxxx" target="${map }"></c:set>
    ${map.dd }
    
    <%
       Person p=new Person();
       request.setAttribute("p", p);
    %>
    <c:set property="name" value="uuuu" target="${p }"></c:set>
    ${p.name }
    
    <br/>--------------------c:catch------------------------<br/>
    <c:catch var="myex">
       <%
          int x=1/0;
       %>
    </c:catch>
    ${myex.message }
    
    <br/>--------------------c:if------------------------<br/>
     <c:if var="aaa" test="${user==null }" scope="page"> 
        aaaaaaaaaaaa
     </c:if>
     ${aaa }
     
     <br/>--------------------c:foreach------------------------<br/>
     <%
        List list=new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        request.setAttribute("list", list);
     %>
     <c:forEach var="str" items="${list }">
        ${str }
     </c:forEach>
     
     <br/>
     <c:forEach var="num" begin="1" end="9" step="1">
         ${num }
     </c:forEach>
     
     <br/>--------------------c:foreach表格间色显示------------------------<br/>
    <%
        list=new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        list.add("ggg");
        list.add("hhh");
        request.setAttribute("list", list);
     %>
     <%-- ${status }获取到了一个对象，这个对象记住了当前是第几次迭代--%>
     <style type="text/css">
        .odd{background-color: #ff99ff;}
        .even{background-color: #ff6633;}
        tr:hover{background-color: #0000ff;}
     </style>
     <table border="1" width="20%">
        <c:forEach var="str" items="${list }" varStatus="status">
           <tr class="${status.count%2==0?'even':'odd' }">   
              <td>${str }</td>
           </tr>
        </c:forEach>
     </table>
     
     <br/>--------------------c:url标签------------------------<br/>
     
     <c:url var="index" value="08JSTL/xx">
         <c:param name="name" value="中国"></c:param>
     </c:url>
       <a href="${index }">购买</a>
       
     <br/>--------------------c:forTokens标签------------------------<br/>
     <%
         request.setAttribute("data1", "aa,bb,cc,dd");
     %>
     <c:forTokens var="ss" items="${data1 }" delims=",">
         ${ss }
     </c:forTokens>
</body>
</html>