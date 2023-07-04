package com.pucese.poo;

public class AppAuto {

	public static void main(String[] args) {
		// instanciar un objeto de la clase
		Auto aveo;
		//inicializar el objeto
		aveo = new Auto();
		//Auto aveo = new Auto();
		
		//obtener las propiedades de mi objeto
		System.out.println("las ruedas del objeto aveo son: " + aveo.ruedas);
		aveo.imprimir();
		//otro objeto persona
		Persona persona1 = new Persona();
		persona1.setNombre("juanito");
		System.out.println(persona1.getNombre());
		
		Persona persona = new Persona();
		//agregar un nombre al objeto persona
		persona.setNombre("jaime");
		//obtener el nombre del objeto persona
		System.out.println(persona.getNombre());
		
	}

}
