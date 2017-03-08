package com.javarevolutions.curso1;

import java.util.List;

import com.javarevolutions.curso1.cmps.Alumno;
import com.javarevolutions.curso1.cmps.Calculadora;
import com.javarevolutions.curso1.cmps.IfaceCliente;
import com.javarevolutions.curso1.cmps.ImplCalculadora;
import com.javarevolutions.curso1.cmps.ImplCliente;
//com = tipo de proyecto, com de comercial, gob de gobierno etc.
//javarevolutions = cliente
//curso1 = nombre del proyecto
import com.javarevolutions.curso1.cmps.Persona;
import com.javarevolutions.curso1.cmps.Cliente;
import com.javarevolutions.curso1.vo.VOCliente;

//Modificador de acceso o prototipo
//Tipo
//Nombre de la clase

/**
 * 
 * @author martsa07
 * Fecha de creación
 * Nombre del proyecto
 * Nombre de la clase
 * etc
 */
public class Principal {
	//Modificadores de acceso
	//public, private, protected, default
	//public: cualquier clase de cualquier paquete accede a este objeto
	//private: solo esta clase tiene acceso a dicho elemento declarado com private, las clases principales no pueden ser private
	//protected: solo las clases que esten dentro del mismo paqute  y las clases heredadas
	//default: no se escribe (class Otra), solo las clases que esten dentro del mismo paquete
	
	//tipos de datos; int, float, double, char, long, byte: primitivos
	//wrapper; String, Integer, Float, Double, Long, Byte. etc.
	private int numero;
	
	//función o metodo
	public int getNumero() {
		return numero;
	}
	//this solo si la variables se llama igual
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	class Otra{
		
	}
	
	public void administracionCuenta(){
		Calculadora calc = new ImplCalculadora(3,7);
		int ahorro = 90;
		int cont = 1;
		
		while(calc.suma(ahorro, cont ++) < 100){
			System.out.println("Ahorro ...");
		}
		
		if(calc.suma(ahorro, cont) == 100)
			System.out.println("tu suma de 100 es exacta");
		else
			System.out.println("Tu suma es : " + calc.suma(ahorro, cont));
		
		ahorro = 90;
		for (int i = ahorro; i < 100; i++) {
			System.out.println("Ahorro mas dentro del for ");
		}
		
		ahorro = 90;
		do{
			System.out.println("Ahorro mas amigo...");
		}while(calc.suma(ahorro, cont ++) < 100);
		
		
		switch(ahorro){
		
		case 100 : {
			System.out.println("Ahorrote 100...");
			break;
		}
		
		case 99 : {
			System.out.println("Ya casi amigo ahorraste 99...");
			break;
		}
		
		case 5 : {
			System.out.println("Ya casi amigo ahorraste 5...");
			break;
		}
		default:{
			System.out.println("Ahorra mas amigo...");
		}
		}
	}
	
	public static void main(String[] args){
		Principal obj = new Principal();
		obj.setNumero(100);
		System.out.println("número : " + obj.getNumero());
		
		//Las intefaces no pueden instancearse
		Calculadora calc = new ImplCalculadora(3,7);
		System.out.println("Resta : " + calc.resta(10, 5));
		
		Persona persona = new Cliente();
		Cliente cliente = (Cliente)persona;
		
		System.out.println("Id : " + Alumno.id);
		//Una clase abstract si se puede instanciar
		
		//Accdes directo a la  clase sin instanciar, no se debe hacer solo que sea necesario y que la variable sea global
		Alumno.borrar(Alumno.id);
		
		//Cuando se pone final a una clase es para que no se pueda heredar de el
		IfaceCliente nuevoCliente = new ImplCliente();
		List<VOCliente> clientes = nuevoCliente.obtnerLista();
		
		for (VOCliente nuevoObjeto : clientes) {
			System.out.println("Id : " + nuevoObjeto.getId());
			System.out.println("Nombre : " + nuevoObjeto.getNombre() + " " + nuevoObjeto.getApp());
			System.out.println("Edad : " + nuevoObjeto.getEdad());
		}
	}
}
