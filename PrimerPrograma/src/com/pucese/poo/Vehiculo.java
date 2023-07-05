package com.pucese.poo;

public class Vehiculo {
	//propiedades
	public int ruedas;
	public double velocidad;
	public String color;
	
	//constructor
	public Vehiculo() {
		
	}
	
	//metodos
	public int acelerar(int a) {
		int v=0;
		v = v + a;
		return v;
	}
	
	public int frenar() {
		return 0;
	}
	
	
	
}
