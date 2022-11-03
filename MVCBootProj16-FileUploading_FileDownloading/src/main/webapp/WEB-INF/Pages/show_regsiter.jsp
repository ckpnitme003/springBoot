<%@ page language="java" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align:center;color:red">Registration Page</h1>
	<frm:form modelAttribute="js" enctype="multipart/form-data">
		<table align="center">
			<tr>
				<td>js Name :</td>
				<td><frm:input path="jsName"/></td>
			</tr>
			<tr>
				<td>js address :</td>
				<td><frm:input path="jsAddrs"/></td>
			</tr>
			<tr>
				<td>js Resume :</td>
				<td><frm:input path="resume" type="file"/></td>
			</tr>
			<tr>
				<td>js Photo :</td>
				<td><frm:input path="photo" type="file"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="register"/></td>
				<td><input type="reset"/></td>
			</tr>
		</table>
	</frm:form>
	

</body>
</html>