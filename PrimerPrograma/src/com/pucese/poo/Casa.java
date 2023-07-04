package com.pucese.poo;

public class Casa {
	//propiedades
	String nombrePropietario;
	int superficiePlanta1, superficiePlanta2;
	static int numeroViviendas =0;
	//mensaje estatico
	static {
		System.out.println("es un mensaje o bloque estatico");
	}
	
	//uno o varios contructores
	//contructor 1. vacio - con datos iniciales
	public Casa() {
		nombrePropietario="";
		superficiePlanta1=0;
		superficiePlanta2=0;
		numeroViviendas++;
	}
	
	//construcotr 2. con paraemtros
	public Casa(String nombrePropietario, int superficiePlanta1) {
		
		this.nombrePropietario=nombrePropietario;
		this.superficiePlanta1=superficiePlanta1;
		superficiePlanta2=0;
		numeroViviendas++;
	}
	
	//construcotr 3. con paraemtros
	public Casa(String nombrePropietario, int superficiePlanta1, int superficiePlanta2) {
		
		this.nombrePropietario=nombrePropietario;
		this.superficiePlanta1=superficiePlanta1;
		this.superficiePlanta2= superficiePlanta2;
		numeroViviendas++;
	}
	
	//metodos de acceso a la clase casa
	//encapsular las propiedades
	
	//dar o agregar el valor
	public void setPropietario(String nombrePropietario) {
		this.nombrePropietario=nombrePropietario;
	}
	//enviar el valor
	public String getPropietario() {
		return nombrePropietario;
	}
	
	public void setSuperficiePlanta1(int superficiePlanta1) {
		this.superficiePlanta1=superficiePlanta1;
	}
	//enviar el valor
	public int getSuperficiePlanta1() {
		return superficiePlanta1;
	}
	
	public void setSuperficiePlanta2(int superficiePlanta2) {
		this.superficiePlanta2=superficiePlanta2;
	}
	//enviar el valor
	public int getSuperficiePlanta2() {
		return superficiePlanta2;
	}
	//metodos extras
	//metodo para devolver numero de viviendas que se generaron
	static int devolverNumeroViviendas() {
		return numeroViviendas;
	}
	
	//metodo para devolver la operacion superficie total
	public int devolverSuperficieVivienda() {
		int superficieTotal;
		superficieTotal= superficiePlanta1+superficiePlanta2;
		return superficieTotal;
	}
	
	
	
	
	
}








