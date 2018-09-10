<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Form Handling</title>
</head>
<body>
	<h2>Add App User Data</h2>
	<form:form method="POST" action="save.html">
		<table>
			<tr>
				<td><form:label path="userId">User Id</form:label></td>
				<td><form:input path="userId" value="${appUser.userId}"
						readonly="true" /></td>
			</tr>
			<tr>
				<td><form:label path="firstName">First Name:</form:label></td>
				<td><form:input path="firstName" value="${appUser.firstName}" /></td>
			</tr>
			<tr>
				<td><form:label path="lastName">Last Name:</form:label></td>
				<td><form:input path="lastName" value="${appUser.lastName}" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address:</form:label></td>
				<td><form:input path="address" value="${appUser.address}" /></td>
			</tr>

			<tr>
				<td><form:label path="emailId">Email Id:</form:label></td>
				<td><form:input path="emailId" value="${appUser.emailId}" /></td>
			</tr>

			<tr>
				<td><form:label path="userRoleIds">Roles</form:label></td>
				<td><form:select path="userRoleIds" multiple="true">
						<c:forEach items="${userRoles}" var="userRole">
							<form:option value="${userRole.roleId}">${userRole.role}</form:option>
						</c:forEach>
					</form:select></td>
			</tr>


			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

	<c:if test="${!empty appUsers}">
		<h2>List Employees</h2>
		<table align="left" border="1">
			<tr>
				<th>User ID</th>
				<th>User First Name</th>
				<th>User Last Name</th>
				<th>User Email Id</th>
				<th>User Address</th>
				<th>Roles</th>
				<th>Actions on Row</th>
			</tr>

			<c:forEach items="${appUsers}" var="appUser">
				<tr>
					<td><c:out value="${appUser.userId}" /></td>
					<td><c:out value="${appUser.firstName}" /></td>
					<td><c:out value="${appUser.lastName}" /></td>
					<td><c:out value="${appUser.emailId}" /></td>
					<td><c:out value="${appUser.address}" /></td>
					<td><c:out value="${appUser.roles}" /></td>
					<td align="center"><a
						href="edit.html?userId=${appUser.userId}">Edit</a> | <a
						href="delete.html?userId=${appUser.userId}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>