<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- struts2的核心控制器会默认处理以。action 为后缀的url  或者说是没有如何后缀的url -->
	<a href="show">struts2框架测试-.无侵入式</a>
	
	<a href="show2">struts2框架测试-半侵入式</a>
	
	<a href="show3">struts2框架测试-继承ActionSupport类  </a>
	
	<hr>
	
	<a href="addUser">添加用户</a>
	<hr>
	<a href="add_User">添加用户2</a>
	<hr>
	<a href="user!addUser">第三种(使用动态方法调用) </a>
</body>
</html>