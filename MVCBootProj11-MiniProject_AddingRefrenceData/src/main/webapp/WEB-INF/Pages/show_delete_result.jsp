<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${!empty del_result}">
	<h1 style="text-align:center;color:red"> ${del_result } </h1>
</c:if>
<a href="./">home</a>