<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="java.util.Collection" %>
<%@page  import="com.liferay.portal.model.User"%>
<%@page import="java.util.List"%>
<%@page import="com.test.OtroPortletExam"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<portlet:defineObjects />

<h1> Listado de Usuarios</h1>

<%

List<User> usuarios = (List<User>)request.getAttribute(OtroPortletExam.USERS);

%>




<table>
	<thead>
		<tr>
			<td>ID </td>
			<td>Nombre</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="<%=usuarios%>" var="usuario">
			<tr>
				<td>${usuario.userId}</td>
				<td>${usuario.fullName}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>