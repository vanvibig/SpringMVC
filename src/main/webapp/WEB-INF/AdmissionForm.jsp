<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<body>

	<link rel="stylesheet" href="<spring:theme code="styleSheet"/>" type="text/css"/>

	<p><a href="/admissionForm.html?siteTheme=green">Green</a> |
		<a href="/admissionForm.html?siteTheme=red">Red</a></p>
	
	<a href="/admissionForm.html?siteLanguage=en">En</a> |
	<a href="/admissionForm.html?siteLanguage=vi">Vi</a>

	<h1><spring:message code="label.headerMessage"/></h1>

	<h3><spring:message code="label.admissionForm"/></h3>

	<form:errors path="student1.*"/>

	<form action="/submitAdmissionForm.html" method="post">
		<table>
			<tr>
				<td><spring:message code="label.studentName"/>:</td>
				<td><input type="text" name="studentName"></td>
			</tr>
			<tr>
				<td><spring:message code="label.studentHobby"/>:</td>
				<td><input type="text" name="studentHobby"></td>

			</tr>
			<tr>
				<td><spring:message code="label.studentMobile"/>:</td>
				<td><input type="text" name="studentMobile"></td>
			</tr>
			<tr>
				<td><spring:message code="label.studentDOB"/>:</td>
				<td><input type="text" name="studentDOB"></td>
			</tr>
			<tr>
				<td><spring:message code="label.studentSkills"/>:</td>
				<td>
					<select name="studentSkills" multiple>
						<option label="Java Core">Java Core</option>
						<option label="Spring Core">Spring Core</option>
						<option label="Spring MVC">Spring MVC</option>
					</select>
				</td>
			</tr>
		</table>

		<table>
			<tr><td><spring:message code="label.studentAddress"/>:</td></tr>
			<tr>
				<td>country: <input type="text" name="<spring:message code="label.country"/>"></td>
				<td>city:    <input type="text" name="<spring:message code="label.city"/>"></td>
				<td>street:  <input type="text" name="<spring:message code="label.street"/>"></td>
				<td>pincode: <input type="text" name="<spring:message code="label.pincode"/>"></td>
			</tr>
		</table>

		<input type="submit" value="<spring:message code="label.submit.admissionForm"/>">
	</form>

</body>
</html>