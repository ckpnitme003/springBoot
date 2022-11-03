<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center;color:red">Form page</h1>
<div style="text-align:center">
	<frm:form modelAttribute="cust">
		Customer Name :<frm:input path="cname"/> <br>
		Customer dob :<frm:input path="dob" type="date"/><br>
		Customer dop :<frm:input path="dop" type="date"/><br>
		Customer isMember :<frm:checkbox path="isMember" /><br><br>
		Customer doj :<frm:input path="doj" type="date"/><br><br>
		
	
		<input type="submit" value="register"/>&nbsp;&nbsp;
		<input type="reset" />
	</frm:form>
</div>
</body>
</html>