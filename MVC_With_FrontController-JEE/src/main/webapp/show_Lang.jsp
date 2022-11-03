<%@  page  import="java.util.*"%>

<%Set<String> li=(Set<String>)request.getAttribute("allLang"); %>
<h1>All languages :</h1>
<%for(String s:li){ %>
	<%=s+", "%>
	<%}%>