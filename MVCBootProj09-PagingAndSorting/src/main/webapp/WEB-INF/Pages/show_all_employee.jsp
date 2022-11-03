<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
 	<h1 style="text-align:center;color:red">=====Employee Record====</h1>
 	<div class="container">
 <c:choose>
 	<c:when test="${!empty empData.getContent()}">
<!--  		<table align="center" bgcolor="yellow" border="1px" > -->
 		<table class="table table-hover">
 			<tr bgcolor="cyan" style="color:red">
 				<th>eid</th>
 				<th>Employee Name</th>
 				<th>Address</th>
 				<th>Job</th>
 				<th>Salary</th>
 				<th colspan="2">Opeartions</th>
 			</tr>
 			<c:forEach var="emp" items="${empData.getContent()}">
 				<tr>
 					<td>${emp.eno}</td>
 					<td>${emp.ename}</td>
 					<td>${emp.eaddr}</td>
 					<td>${emp.job}</td>
 					<td>${emp.sal}</td>
 					<td><a href="edit?eno=${emp.eno}"><img src="./images/update.jpg" width="30" height="30"></a></td>
 					<td><a href="delete?eno=${emp.eno}" onclick="return confirm('are you sure,u want to delete Employee record with id ${emp.eno}')"><img src="./images/delete.jpg" width="30" height="30"></a></td>
 				</tr>
 			</c:forEach>
 		</table>
</div>
	<div align="center">
 	&nbsp;
 	<c:if test="${!empData.isFirst()}">
			<a href="emp_report?page=0">First</a>
		</c:if>
 	&nbsp;
 	<c:if test="${empData.hasNext()}">
			<a href="emp_report?page=${empData.getPageable().getPageNumber()+1}">Next</a>
		</c:if>
 	&nbsp;
 	
 		<c:forEach var="i" begin="0" step="1"
			end="${empData.getTotalPages()-1}">
 			[<a href="emp_report?page=${i}"> ${i+1}</a>]
 		</c:forEach>
 		
 	&nbsp;	
 	<c:if test="${empData.hasPrevious()}">
			<a href="emp_report?page=${empData.getPageable().getPageNumber()-1}">Previous</a>
		</c:if>
 	&nbsp;
 	<c:if test="${!empData.isLast()}">
			<a href="emp_report?page=${empData.getTotalPages()-1}">Last</a>
		</c:if>
 	&nbsp;
 	</div>
	</c:when>
 	
 	<c:otherwise>
 		<h1 style="text-align:center;color:red">Employee record not available</h1>
 	</c:otherwise>
 
 	
 
 </c:choose>
 <h1 style="text-align:center;color:green"> ${resultMsg }</h1>
 
 <h2 style="text-align:center;color:green"><a href="emp_insert"><img src="./images/add.jpg" width="30" height="30">Register Employee</a></a></h2>
 
 <a href="./">home</a>
