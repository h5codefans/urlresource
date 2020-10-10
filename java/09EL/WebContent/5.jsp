<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   
   ${fn:toLowerCase("AAAAAA") }
   
   <%
       request.setAttribute("arr", new String[5]);
   %>
   
   ${fn:length(arr) }
   
   <%
      List list=new ArrayList();
      list.add("aa");
      list.add("bb");
      request.setAttribute("list", list);
   %>
   <c:forEach var="i" begin="0" end="${fn:length(list) }">
      ${list[i] }
   </c:forEach>
   
   ${fn:join(fn:split("www,itcast,cn",","),".") }
   
   ${fn:contains("aaabbbbcc","ab") }
   
   ${fn:escapeXml("<a href=''>点点</a>") }
</body>
</html>