<%@ page language="java" isELIgnored="false" import="java.util.*"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--   Employee info: ${empInfo} --%>

<c:if test="${!empty empInfo}" >
	Employee info :${empInfo.eno },${empInfo.ename },${empInfo.sal },${empInfo.isVaccinated }
</c:if>
    
  