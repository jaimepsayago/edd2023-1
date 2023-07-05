package com.pucese.poo;

public class AppCoche {

	public static void main(String[] args) {
	
		Coche coche = new Coche();
		System.out.println(coche.ruedas);
		
		//crear otro objeto 
		Coche coche1 = new Coche(8, 30, "azul");
		
		//ejecutar los metodos
		System.out.println(coche.acelerar(30)); //metodo viene del padre
		System.out.println(coche.repostar()); //metodo viene hijo
				
	}

}
