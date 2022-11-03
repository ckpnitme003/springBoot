<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <h1 style="text-align:center;color:red">====Student Record====</h1>
  
   	<c:choose >
	<c:when test="${!empty allStud }">
		<table align="center" bgcolor="yellow" border="1px">
			<tr>
				<th>sno</th>
				<th>Name</th>
				<th>email</th>
				<th>dob</th>
				<th>password</th>
				<th>married</th>
				<th>hobbies</th>
				<th>language</th>
				<th>gender</th>
				<th>education</th>
				<th>notes</th>
				<th>photo</th>
				<th>resume</th>
				<th>Operation</th>
			</tr>
			<c:forEach var="st" items="${allStud}">
				<tr>
					<td>${st.sno}</td>
					<td>${st.sname}</td>
					<td>${st.email}</td>
					<td>${st.dob}</td>
					<td>${st.pwd}</td>
					<td>${st.ms}</td>
					
					<td><c:forEach var="hb" items="${st.hobbies}">
						 ${hb } ,
					</c:forEach></td>
					<td>
						<c:forEach var="lang" items="${st.lang}">
							 ${lang },
						</c:forEach>
					</td>
					<td>${st.gender}</td>
					<td>${st.education}</td>
					<td>${st.notes}</td>
					<td><img src="${st.photoPath}" width="50px" height="50px"/></td>
					<td><a href="">Download</a></td>
					<td><a href="edit?sno=${st.sno }">edit</a></td>
				</tr>
			</c:forEach>
	</c:when>
	<c:otherwise>
   				<h1 style="text-align:center;color:red">Record not found</h1>
   			</c:otherwise>
   		</c:choose>
   		
   
   </table>
   <h1 style="text-align:center;color:green">${result }</h1>
   <a href="./">home</a>
    
