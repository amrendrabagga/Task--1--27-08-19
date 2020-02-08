<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<html>
<body>
<h2>Transportation Deal Portal</h2>
<hr>
<frm:form action="">
<table>
	<tr>
	<td>username</td>
	<td><frm:input path="username"/></td>
	</tr>
	<tr>
	<td>password</td>
	<td><frm:input path="pasword"/></td>
	</tr>
	<tr>
	<td colspan="2" align="center"><input type="submit" value="SUBMIT"/></td>
	</tr>
	<tr>
	<td>Transporter</td>
	<td><frm:radiobutton path="userType" value="transporter"/></td>
	</tr>
	<tr>
	<td>Customer</td>
	<td><frm:radiobutton path="userType" value="customer"/></td>
	</tr>
</table>
</frm:form>
</body>
</html>
