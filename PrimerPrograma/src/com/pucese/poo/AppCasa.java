package com.pucese.poo;

public class AppCasa {

	public static void main(String[] args) {
		//mensaje con el total de objetos instanciados
	System.out.println("en estos momentos existen: " + Casa.devolverNumeroViviendas()+ "viviendas");
	//declarar objetos
	Casa casa1, casa2;
	Casa casa3, casa4;
	//instancia el objeto
	casa1 = new Casa();
	System.out.println("en estos momentos existen: " + 
	Casa.devolverNumeroViviendas()+ "viviendas");
	//instancia otro objeto 2
	casa2 = new Casa("luis garcia", 95);
	System.out.println("en estos momentos existen: " + 
	Casa.devolverNumeroViviendas()+ "viviendas");
	//instancia otro objeto 3
	casa3 = new Casa("pablo calle", 95, 100);
	System.out.println("en estos momentos existen: " + 
	Casa.devolverNumeroViviendas()+ "viviendas");

	//asignar datos a las propiedades del objeto 1
	casa1.setPropietario("jaime");
	casa1.setSuperficiePlanta1(80);
	
	//visualizar la informacion
	System.out.println("casa 1: ");
	System.out.println("propietario: " + casa1.getPropietario());
	System.out.println("superficie: " + casa1.getSuperficiePlanta1());
	
	System.out.println("casa 2: ");
	System.out.println("propietario: " + casa2.getPropietario());
	System.out.println("superficie1: " + casa2.getSuperficiePlanta1());
	System.out.println("superficie2: " + casa2.getSuperficiePlanta2());
	System.out.println("superficie Total: " + casa2.devolverSuperficieVivienda());
	

	}

}
