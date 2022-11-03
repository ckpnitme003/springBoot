<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="java.util.*,com.nt.entity.*"%>
    
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <h1 style="text-align:center;color:red">Get Result : </h1>
    	<c:if test="${!empty result }" >
    	<h2>Student no: ${result.sno}</h2>
    	<h2>Student name: ${result.sname}</h2>
    	<h2> email: ${result.email}</h2>
    	<h2> dob: ${result.dob}</h2>
    	<h2> password: ${result.pwd}</h2>
    	<h2> married: ${result.ms}</h2>
    	<%Student st=(Student)request.getAttribute("result"); %>
    	<h2> Hobbies: <%= Arrays.toString(st.getHobbies()) %></h2>
    	<h2>Language : ${result.lang }</h2>
    	<h2> Gender: ${result.gender}</h2>
    	<h2> Education: ${result.education}</h2>
    	<h2> Notes: ${result.notes}</h2>
    		
    	</c:if>
    	<a href="./">home</a>

    