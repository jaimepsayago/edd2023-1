package com.pucese.collections;

public class AppCajaGEnerica {

	public static void main(String[] args) {
		// objeto d etipo caja
		
		Caja c = new Caja();
		
		CajaGenerica<Integer> cajaG = new CajaGenerica<>();
		cajaG.poner(12);
		
		CajaGenerica<String> cajagS = new CajaGenerica<>();
		cajagS.poner("hola");
		
		
	
		

	}

}
