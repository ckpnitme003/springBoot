<%@ page language="java" isELIgnored="false" import="java.util.*"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%--     fav color :<%= Arrays.toString((String[])request.getAttribute("favcolor"))%><br>
    friends :${friends}<br>
    contact Number :${contact}<br>
    id details :${idDetails}<br> --%>
    
    fav color: 
    <c:forEach var="color" items="${favcolor}">
    	${color},
    </c:forEach>
    <br>
    friends :
     <c:forEach var="friend" items="${friends}">
    	${friend},
    </c:forEach>
    <br>
    contact Number :
     <c:forEach var="con" items="${contact}">
    	${con },
    </c:forEach>
    <br>
     id details :
      <c:forEach var="id" items="${idDetails}">
    	${id.key},${id.value }<br>
    </c:forEach>
    <br>
    
    
  