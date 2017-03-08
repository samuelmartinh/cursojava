package com.javarevolutions.curso1.cmps;

public class ImplCalculadora implements Calculadora{
	//cuando no se define constructor, java define uno por default
	//Constructor de la clase ImplCalculadora
	//Se pueden definir n constructures
	
	public ImplCalculadora(int num1, int num2){
		System.out.println("Suma: " + suma(num1,num2));
		System.out.println("Division: " + division(num1,num2));
	}
	
	public ImplCalculadora(int num1){
		System.out.println("Suma: " + suma(num1,100));
		System.out.println("Division: " + division(num1,2));
	}

	public float suma(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	public float resta(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	public float multipilicacion(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	public float division(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}
	
}
