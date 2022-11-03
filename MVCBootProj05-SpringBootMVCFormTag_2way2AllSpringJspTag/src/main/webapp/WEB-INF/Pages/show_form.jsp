<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
	<h1 style="text-align:center;color:blue">Form page</h1>
	
	<frm:form  modelAttribute="stud">
		<table align="center" bgcolor="pink" border="1px">
			<tr>
				<td>sid :</td>
				<td><frm:input path="sno" type="number"/></td>
			</tr>
			<tr>
				<td> student Name :</td>
				<td><frm:input path="sname" type="text"/></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><frm:input path="email" type="email" /></td>
			</tr>
			<tr>
				<td>DOB :</td>
				<td><frm:input path="dob" type="date" /></td>
			</tr>
			<tr>
				<td>password :</td>
<%-- 				<td><frm:input path="pwd" type="password" /></td> --%>
				<td><frm:password path="pwd"/></td>
			</tr>
			<tr>
				<td>Marries :</td>
				<td><frm:checkbox path="ms"/></td>
			</tr>
			<tr>
				<td>Hobbies :</td>
				<td>
					Playing Games<frm:checkbox path="hobbies" value="play"/>
					Watching Movies<frm:checkbox path="hobbies" value="watch"/>
					Reading Books<frm:checkbox path="hobbies" value="read"/>
					Outing<frm:checkbox path="hobbies" value="outing"/>
				</td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td>Male<frm:radiobutton path="gender" value="male"/></td>
				<td>FeMale<frm:radiobutton path="gender" value="female"/></td>
			</tr>
			<tr>
				<td>Education:</td>
				<td><frm:select path="education">
					<frm:option value="">select</frm:option>
					<frm:option value="b.tech">B.Tech</frm:option>
					<frm:option value="b.ed">B.Ed</frm:option>
					<frm:option value="b.ca">B.CA</frm:option>
				</frm:select></td>
			</tr>
			<tr>
				<td>Language:</td>
				<td><frm:select path="lang" multiple="true">
					<frm:option value="">select</frm:option>
					<frm:option value="english">English</frm:option>
					<frm:option value="hindi">Hindi</frm:option>
					<frm:option value="bengali">Bengali</frm:option>
					<frm:option value="oria">oria</frm:option>
				</frm:select></td>
			</tr>
			<tr>
				<td>notes :</td>
				<td><frm:textarea path="notes" rows="3" cols="20"/></td>
			</tr>
			<tr>
				<td><input type="submit" /></td>
				<td><input type="reset" /></td>
			</tr>
		</table>
</frm:form>
