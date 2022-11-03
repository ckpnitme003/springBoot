<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<h1 style="text-align:center;color:red"><spring:message code="cust.register.title"/></h1>
<frm:form modelAttribute="cust"> 
	<table align="center">
		<tr>
			<td><spring:message code="cust.register.name"/></td>
			<td><frm:input path="cname"/></td>
		</tr>
		<tr>
			<td><spring:message code="cust.register.addrs"/></td>
			<td><frm:input path="addrs"/></td>
		</tr>
		<tr>
			<td><spring:message code="cust.register.billAmt"/></td>
			<td><frm:input path="billAmt"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="<spring:message code="cust.register.submit.button"/>"/></td>
			
		</tr>
	</table>

</frm:form>

<br><br>
<a href="?lang=fr_FR">Français</a>&nbsp;&nbsp;&nbsp;
<a href="?lang=en_US">English</a>&nbsp;&nbsp;&nbsp;
<a href="?lang=hi_IN">हिंदी</a>&nbsp;&nbsp;&nbsp;
<a href="?lang=de_DE">Deutsch</a>&nbsp;&nbsp;&nbsp;
