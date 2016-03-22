<%@page import="com.ejemplo.Persona"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />




<%
	List<Persona> personas = new ArrayList<Persona>();

	personas.add(new Persona("Donato Pastor","234", "Madrid", "Gran Via 1", "España"));
	personas.add(new Persona("Conchi Peña","123", "Barcelona", "Av.Diagonal 1", "España"));
	personas.add(new Persona("Elia Pastor","345", "Sevilla", "Plaza España 1", "España"));
	personas.add(new Persona("Jorge Pastor","999", "Valencia", "El mejor 1", "España"));
	personas.add(new Persona("Guillermo Pastor","888", "La Coruña", "Humildad 1", "España"));
%>


<portlet:resourceURL var="urlListadoPersonas"></portlet:resourceURL>




<div id="miTabla"></div>

<script type="text/javascript">
	YUI().ready('aui-datatable', 'aui-io-request', 
		function(Y) {
		var columns = [ 'usuario', 'id', 'ciudad', 'direccion', 'pais' ];

		Y.io.request('<%=urlListadoPersonas%>',
				{
			on : {
				success : function() {
					var data = this.get('responseData');
					
					data = JSON.parse(data);

					new Y.DataTable.Base(
							{
						columnset : columns,
						recordset : data.list
					}).render('#miTabla');

				}
			}
		});

	});
</script>
