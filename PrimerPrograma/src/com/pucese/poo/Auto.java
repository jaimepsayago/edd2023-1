package com.pucese.poo;

public class Auto {
//propiedades = variables
	//comportamientos = funciones
	
	// 3 tipos de propiedade de variables public, private, protected
	public int ruedas;
	private int ancho, peso;
	
	//constructor incializar las variables
	public Auto() {
		ruedas=5;
		ancho=20;
		peso=120;
	}
	
	//comportamientos o metodos
	
	//metodo imprimir
	public void imprimir() {
		System.out.println("ruedas: " + ruedas + " " + "ancho: " + ancho + " " + "peso: " + peso);
	}
	
	
	
	
}
