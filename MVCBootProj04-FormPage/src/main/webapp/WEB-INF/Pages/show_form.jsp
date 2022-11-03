<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align:center;color:blue">Form page</h1>
	<form action="register" method="POST">
		<table align="center" bgcolor="pink" border="1px">
			<tr>
				<td>sid :</td>
				<td><input type="text" name="sid"/></td>
			</tr>
			<tr>
				<td> student Name :</td>
				<td><input type="text" name="sname"/></td>
			</tr>
			<tr>
				<td>student address :</td>
				<td><input type="text" name="sadd"/></td>
			</tr>
			<tr>
				<td>student average :</td>
				<td><input type="text" name="avg"/></td>
			</tr>
			<tr>
				<td><input type="submit" /></td>
				<td><input type="reset" /></td>
			</tr>
		</table>
	</form>

</body>
</html>