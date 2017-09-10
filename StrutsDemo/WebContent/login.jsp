<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login Screen</title>
</head>
<body>
	<h1>SVK Login Page</h1>
		<s:form action = "success">
			<s:textfield name="user.firstName" label = "First_Name"></s:textfield>
			<s:textfield name="user.lastName" label = "Last_Name"></s:textfield>
			<s:password name="user.passCode" label ="Password" ></s:password>
			<s:submit/>
		</s:form>
	
</body>
</html>