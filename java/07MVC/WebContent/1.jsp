<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp:usebean标签的使用</title>
</head>
<body>
    <!-- useBean标签体字在useBean标签 实例化bean时才执行-->
    <jsp:useBean id="person" class="cn.itcast.domain.Person" scope="session">
    bbbbbbb
    </jsp:useBean>
    
    <%=person.getName() %>
</body>
</html>