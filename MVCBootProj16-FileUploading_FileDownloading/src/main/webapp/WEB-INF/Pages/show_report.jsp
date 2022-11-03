<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:choose>
	<c:when test="${!empty jsInfo }">
		<table align="center" border="1px" cellspacing="2px">
			<tr>
				<td>jsId</td>
				<td>jsName</td>
				<td>jsAddress</td>
				<td>Resume</td>
				<td>photo</td>
			</tr>
			<c:forEach var="js" items="${jsInfo }">
				<tr>
					<td> ${js.jsId}</td>
					<td> ${js.jsName}</td>
					<td> ${js.jsAddrs}</td>
					<td><a href="js_download?id=${js.jsId}&type=resume">download</a></td>
					<td><a href="js_download?id=${js.jsId}&type=photo">download</a><img src="${js.photoPath}" width="50px" heigth="50px"/></td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
</c:choose>