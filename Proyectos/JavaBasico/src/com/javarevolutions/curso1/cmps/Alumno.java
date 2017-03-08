package com.javarevolutions.curso1.cmps;

public class Alumno extends OtraPersona {
	//Es para que el valor de la variable no va a cambiar, se utiliza para constantes y se puede declar static para accesar sin instanciar
	private final static String color = "Rojo";
	private String nuevoFolio;
	//Sirve para accesar sin instancear
	public static int id = 1;
	
	//Sobrecarga de constructores
	public Alumno(){
		
	}
	
	public Alumno(String folioDiferente){
		
	}
	
	public void guardar() {
		// TODO Auto-generated method stub
	
	}
	
	public static void borrar(int id2){
		System.out.println("Id borrado");
	}
	
	//Sobreescritura de metodos
	public void setFolio(Integer folio) {
		nuevoFolio = "Folio : " + folio;
	}
	
	public String toString(){
		return nuevoFolio;
	}
	
	public String toString(String cadena){
		return "Cadena : " + cadena;
	}
	
	public String toString(String cadena, String cadena2){
		return cadena + cadena2;
	}
	
	public void actualizar(){
		System.out.println("update alumno ..." + id);
	}
	
	public void borrar(){
		System.out.println("Id borrado ..." + id);
	}

}
