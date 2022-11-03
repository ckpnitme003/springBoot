<%@ page language="java" isELIgnored="false" import="java.util.*,com.nt.model.Employee"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>Collection of Employees :</h1>
<br>
<%-- <% List<Employee> li=(List<Employee>)request.getAttribute("empDetails");%>

<table align="center" bgcolor="cyan" border="1px">

	<tr>
		<th>eno</th>
		<th>ename</th>
		<th>sal</th>
		<th>isVaccinated</th>
	</tr>
<% for(Employee e:li){ %>
	<tr>
		<td> <%=e.getEno() %></td>
		<td> <%=e.getEname() %></td>
		<td> <%=e.getSal() %></td>
		<td> <%=e.getIsVaccinated() %></td>
	</tr>
<%} %>
</table>
 --%>
<c:choose>
	<c:when test="${!empty empDetails }">
		<table align="center" bgcolor="cyan" border="1px">

			<tr>
				<th>eno</th>
				<th>ename</th>
				<th>sal</th>
				<th>isVaccinated</th>
			</tr>
			<c:forEach var="emp" items="${empDetails}">
				<tr>
					<td>${emp.eno}</td>
					<td>${emp.ename}</td>
					<td>${emp.sal}</td>
					<td>${emp.isVaccinated}</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1>record not found</h1>
	</c:otherwise>

</c:choose>



