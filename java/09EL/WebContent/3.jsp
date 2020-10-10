<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>隐式对象</title>
</head>
<body>
    
    ${pageContext}
    
    <br/>---------------------使用el隐式对象访问指定域---------<br/>
    
    <%
       pageContext.setAttribute("aa","123");
    %>
    ${aa }<br/>
    ${pageScope.aa }<br/>
    
    ${sessionScope.user!=null }
    
   <br/>---------------------获取保存了所有的请求参数的MAP集合---------<br/>
   ${param.name }
   <!-- http://localhost:8888/09EL/3.jsp?like=aaa&like=bbb -->
   ${paramValues.name[0] }
   ${paramValues.name[1] }
   
   <br/>---------------------获取请求头---------<br/>
     ${header['Accept-Language'] }
     
     <br/>---------------------获取Cookie---------<br/>
     ${cookie.JSESSIONID.name}<br/>
     ${cookie.JSESSIONID.value}
     
     <br/>---------------------initParam获取web应用参数---------<br/>
     ${initParam.xx }
</body>
</html>