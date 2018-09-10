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
           <td><form:label path="id">Employee ID:</form:label></td>
           <td><form:input path="id" value="${appUser.id}" readonly="true"/></td>
       </tr>
       <tr>
           <td><form:label path="name">Employee Name:</form:label></td>
           <td><form:input path="name" value="${appUser.firstName}"/></td>
       </tr>
       <tr>
           <td><form:label path="age">Employee Age:</form:label></td>
           <td><form:input path="age" value="${appUser.lastName}"/></td>
       </tr>
       <tr>
           <td><form:label path="salary">Employee Salary:</form:label></td>
           <td><form:input path="salary" value="${appUser.address}"/></td>
       </tr>
       
       <tr>
           <td><form:label path="address">Employee Address:</form:label></td>
                    <td><form:input path="address" value="${appUser.email}"/></td>
       </tr>
          <tr>
         <td colspan="2"><input type="submit" value="Submit"/></td>
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
   <th>User Email</th>
   <th>User Address</th>
           <th>Actions on Row</th>
  </tr>

  <c:forEach items="${appUsers}" var="appUser">
   <tr>
    <td><c:out value="${appUser.id}"/></td>
    <td><c:out value="${appUser.firstName}"/></td>
    <td><c:out value="${appUser.lastName}"/></td>
    <td><c:out value="${appUser.email}"/></td>
    <td><c:out value="${appUser.address}"/></td>
    <td align="center"><a href="edit.html?id=${appUser.id}">Edit</a> | <a href="delete.html?id=${appUser.id}">Delete</a></td>
   </tr>
  </c:forEach>
 </table>
</c:if>
 </body>
</html>