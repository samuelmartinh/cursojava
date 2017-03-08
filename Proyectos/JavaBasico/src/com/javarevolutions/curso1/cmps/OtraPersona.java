package com.javarevolutions.curso1.cmps;

public abstract class OtraPersona {
	private Integer folio;

	public Integer getFolio() {
		return folio;
	}

	public void setFolio(Integer folio) {
		this.folio = folio;
	}
	
	public abstract void guardar();
	
	public void actualizar(){
		System.out.println("Update alumno....");
	}
}
