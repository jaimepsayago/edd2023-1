package com.pucese.edd;

public class TiposVariables {

	public static void main(String[] args) {
		// CAST
	//conversion de tipos de datos
		int a=2;
		double a1=3.2;
		//convertir int a double
		double x = (double)a;
		int z = (int) a1;
	
	//int, dobule, float 
		//string utilizo otros metodos toString()
	//objetos envoltorios wrapper
		//valueOf()
		// a tipo primitivo
		//doubleValue(), intValue()
		
		//ejemplo convertir int a string
		Integer.toString(z); 
		Integer.parseInt("75");
		Double y= Double.valueOf("3.14").doubleValue();
		
		String cadena = String.valueOf("75"); 
		
		//String a integer
		Integer x1= Integer.valueOf("900");
		Integer x2= Integer.parseInt("800");
		
		//constantes
		final double pi=3.14;
		

	}

}
