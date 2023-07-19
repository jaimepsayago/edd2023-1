package com.pucese.poo;

public class Ciudadano extends Persona {
	//variable
	protected String documento;
	
	//construcotr
	public Ciudadano(String dni, String nombre, int contrasenia, String direccion, String documento ) {
		super(dni,nombre,contrasenia,direccion);
		this.documento = documento;
	}
	//metodos redefinido
	public String identificacion() {
		return super.identificacion() +  " ,  documento: " + this.documento;
	}
	

}
