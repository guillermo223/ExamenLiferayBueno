package com.ejemplo;

public class Persona {
	
	private String usuario;
	private String id;
	private String ciudad;
	private String direccion;
	private String pais;
	
	
	public Persona(String usuario, String id, String ciudad, String direccion, String pais) {
		super();
		this.usuario = usuario;
		this.id = id;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.pais = pais;
	}
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
}
