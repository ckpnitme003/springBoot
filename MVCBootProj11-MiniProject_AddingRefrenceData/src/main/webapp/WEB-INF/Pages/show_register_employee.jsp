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
	<h1 style="text-align:center;color:red">====Employee Register====</h1>
<%-- 	<frm:form action="insertEmp" method="POST" modelAttribute="emp"> --%>
	<frm:form  modelAttribute="emp">
		<table align="center" bgcolor="pink">
			<tr>
				<td>Ename :</td>
				<td><frm:input path="ename" /></td>
			</tr>
			<tr>
				<td>Eaddrs :</td>
				<td><frm:input path="eaddr" /></td>
			</tr>
			<tr>
				<td>job :</td>
				<td><frm:input path="job" /></td>
			</tr>
			<tr>
				<td>sal :</td>
				<td><frm:input path="sal" /></td>
			</tr>
			<tr>
				<td>deptNo :</td>
				<td><frm:select path="deptNo">
						<frm:options items="${deptNoInfo}"/>
					</frm:select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="register" /></td>
				<td><input type="reset" /></td>
			</tr>

		</table>
	</frm:form>
</body>
</html>