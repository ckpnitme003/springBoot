<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<link rel="stylesheet" href="css/style.css"/>
<script src="js/validation.js"></script>

<h1 style="text-align:center;color:green">====Edit Employee====</h1>
<frm:form action="edit" method="POST" modelAttribute="emp" onsubmit="return doValidate(this)">
	<table align="center" bgcolor="pink">
		<tr>
			<td>eno :</td>
			<td><frm:input path="eno" readonly="true" /></td>
		</tr>
		<tr>
			<td>ename :</td>
			<td><frm:input path="ename" /><frm:errors path="ename" /><span id="enameErr" ></span></td>
		</tr>
		<tr>
			<td>eaddrs :</td>
			<td><frm:input path="eaddr" /><frm:errors path="eaddr" /><span id="eaddrErr" ></span></td>
		</tr>
		<tr>
			<td>job :</td>
			<td><frm:input path="job" /><frm:errors path="job" /><span id="jobErr" ></span></td>
		</tr>
		<tr>
			<td>sal :</td>
			<td><frm:input path="sal" /><frm:errors path="sal" /><span id="salErr" ></span></td>
		</tr>
		<tr>
			<td>deptNo :</td>
			<td><frm:select path="deptNo">
					<frm:options items="${deptNoInfo}" />
				</frm:select>
			</td>
		</tr>
		<tr>
				<td><frm:hidden path="isVerified" id="verified" />
				</td>
			</tr>
		<tr>
			<td><input type="submit" value="update" /></td>
			<td><input type="reset" /></td>
		</tr>
	</table>

</frm:form>