<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
	<h1 style="text-align:center;color:blue">Form page</h1>
<%-- 	<frm:form action="register" method="POST" modelAttribute="stud"> --%>
<%-- 	<frm:form action="register"  modelAttribute="stud"> --%>
	<frm:form  modelAttribute="stud">
		<table align="center" bgcolor="pink" border="1px">
			<tr>
				<td>sid :</td>
				<td><frm:input path="sno"/></td>
			</tr>
			<tr>
				<td> student Name :</td>
				<td><frm:input path="sname"/></td>
			</tr>
			<tr>
				<td>student address :</td>
				<td><frm:input path="sadd"/></td>
			</tr>
			<tr>
				<td>student average :</td>
				<td><frm:input path="avg"/></td>
			</tr>
			<tr>
				<td><input type="submit" /></td>
				<td><input type="reset" /></td>
			</tr>
		</table>
</frm:form>
