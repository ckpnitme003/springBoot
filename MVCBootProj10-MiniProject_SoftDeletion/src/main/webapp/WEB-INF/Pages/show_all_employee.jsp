<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 	<h1 style="text-align:center;color:red">=====Employee Record====</h1>
 <c:choose>
 	<c:when test="${!empty empList}">
 		<table align="center" bgcolor="yellow" border="1px" >
 			<tr bgcolor="cyan" style="color:red">
 				<th>eid</th>
 				<th>Employee Name</th>
 				<th>Address</th>
 				<th>Job</th>
 				<th>Salary</th>
 				<th>status</th>
 				<th colspan="2">Opeartions</th>
 			</tr>
 			<c:forEach var="emp" items="${empList}">
 				<tr>
 					<td>${emp.eno}</td>
 					<td>${emp.ename}</td>
 					<td>${emp.eaddr}</td>
 					<td>${emp.job}</td>
 					<td>${emp.sal}</td>
 					<td>${emp.status}</td>
 					<td><a href="edit?eno=${emp.eno}"><img src="./images/update.jpg" width="30" height="30"></a></td>
 					<td><a href="delete?eno=${emp.eno}" onclick="return confirm('are you sure,u want to delete Employee record with id ${emp.eno}')"><img src="./images/delete.jpg" width="30" height="30"></a></td>
 				</tr>
 			</c:forEach>
 		</table>
 	</c:when>
 	<c:otherwise>
 		<h1 style="text-align:center;color:red">Employee record not available</h1>
 	</c:otherwise>
 
 	
 
 </c:choose>
 <h1 style="text-align:center;color:green"> ${resultMsg }</h1>
 
 <h2 style="text-align:center;color:green"><a href="emp_insert"><img src="./images/add.jpg" width="30" height="30">Register Employee</a></a></h2>
 
 <a href="./">home</a>
