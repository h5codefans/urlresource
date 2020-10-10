<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" isThreadSafe="false" %>
<%@ page errorPage="/errors/error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp指令</title>
</head>
<body>
  This is my JSP page.<br/>
  jsp中page指令属性有：
  language，extends,import,session,buffer，
  autoFlush,isTreadSafe,info,errorPage,
  isErrorPage,contentType,pageEncoding,
  isELIgnored
  <%
    if(true){
    	int x=1/0;
    }
  %>
</body>
</html>