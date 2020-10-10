<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>运算符示例</title>
</head>
<body>

   <%
      request.setAttribute("username","aaa");
      request.setAttribute("password",123);
   %>
   ${username=='aaa'&&password=='123' }
   <br/>-----------------empty运算符--------------------------<br/>
   <%
      request.setAttribute("list",null);
      request.setAttribute("list",new ArrayList());
   %>
   ${empty(list) }
   
   <br/>-----------------二元运算符--------------------------<br/>
   
   ${user!=null?user.username:'' }
   
   <br/>-----------------二元运算符(数据回显)--------------------------<br/>
   
   <%
      request.setAttribute("gender","male");
   %>
   <input type="radio" name="gender" value="male" ${gender=='male'?'checked':'' }>男
   <input type="radio" name="gender" value="female" ${gender=='female'?'checked':'' }>女
   
   <br/>-----------------------取出用户填写的爱好回显----------------------------------------------<br/>
   <%
       request.setAttribute("likes", new String[]{"football","sing"});     
   %>
   
   <input type="checkbox" name="likes" value="sing" ${fn:contains(fn:join(likes,","),"sing")?'checked':'' }>唱歌
   <input type="checkbox" name="likes" value="dance" ${fn:contains(fn:join(likes,","),"dance")?'checked':'' }>跳舞
   <input type="checkbox" name="likes" value="basketball" ${fn:contains(fn:join(likes,","),"basketball")?'checked':'' }>篮球
   <input type="checkbox" name="likes" value="football" ${fn:contains(fn:join(likes,","),"football")?'checked':'' }>足球
</body>
</html>