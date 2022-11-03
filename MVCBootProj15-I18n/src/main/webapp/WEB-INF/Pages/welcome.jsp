<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<h1 style="text-align:center;color:red"><spring:message code="home.title"/></h1>


<h2 style="text-align:center;"><a href="register"><spring:message code="home.link"/></a></h2>


<br>

Currency active local is: ${pageContext.response.locale}
<br>
<%-- <fmt:setLocale value="${pageContext.response.locale }"/> --%>
<jsp:useBean id="dt" class="java.util.Date"/>
	<fmt:formatDate value="${dt}" var="fdt"/>
formatted date:   ${fdt}
<br>
<fmt:formatDate value="${dt}" var="fdat" type="date" dateStyle="FULL"/> 
Full date format :${fdat}
<br>
<fmt:formatDate value="${dt}" var="ftime" type="time" dateStyle="FULL"/> 
Full Time format :${ftime }
<br>
<fmt:formatNumber value="1000000" var="fnumber" type="number" /> 
Formatted number :${fnumber}
<br>
<fmt:formatNumber value="1000000" var="fcurrency" type="currency" /> 
Formatted currency :${fcurrency }
<br>
<fmt:formatNumber value="0.25" var="fpercent" type="percent" /> 
formatted percent :${fpercent}
<br><br>
<a href="./?lang=fr_FR">Français</a>&nbsp;&nbsp;&nbsp;
<a href="./?lang=en_US">English</a>&nbsp;&nbsp;&nbsp;
<a href="./?lang=hi_IN">हिंदी</a>&nbsp;&nbsp;&nbsp;
<a href="./?lang=de_DE">Deutsch</a>&nbsp;&nbsp;&nbsp;
