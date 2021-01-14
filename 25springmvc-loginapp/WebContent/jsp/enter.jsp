<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body bgcolor="pink">
<form:form action="check"  commandName="uto">
	<table>
		<tr>
			<td>Enter your name:</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Enter your password:</td>
			<td><form:password path="password" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="SIGN IN" /></td>
		</tr>
	</table>
</form:form>
</body>
</html>