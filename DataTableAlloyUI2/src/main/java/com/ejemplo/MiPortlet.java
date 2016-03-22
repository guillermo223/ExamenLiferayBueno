package com.ejemplo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class MiPortlet extends MVCPortlet {
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		
		
		List<Persona> personas = new ArrayList<Persona>();

		personas.add(new Persona("Donato Pastor","234", "Madrid", "Gran Via 1", "España"));
		personas.add(new Persona("Conchi Peña","123", "Barcelona", "Av.Diagonal 1", "España"));
		personas.add(new Persona("Elia Pastor","345", "Sevilla", "Plaza España 1", "España"));
		personas.add(new Persona("Jorge Pastor","999", "Valencia", "El mejor 1", "España"));
		personas.add(new Persona("Guillermo Pastor","888", "La Coruña", "Humildad 1", "España"));
		
		
		String personasJSON = JSONFactoryUtil.serialize(personas);
				
		
		resourceResponse.getWriter().print(personasJSON);
	}

}
