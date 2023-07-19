package com.pucese.poo;

public class AppGrupoPersonas {

	public static void main(String[] args) {
		// 3 objetos de tipo persona
		//agregarlos en obj arraylist tipo grupo personas
		//ejecutar los metodos construidos
		
		Persona p1 = new Persona(); //instancio un objeto
		p1.setDni("01");
		p1.setNombre("juanito");
		p1.setContrasenia(123);
		p1.setDireccion("casa");
		
		Persona p2 = new Persona("02", "pablo", 456, "quito"); //instacia y datos iniciales
		Persona p3 = new Persona("03", "maria", 456, "gye");
		Persona p4 = new Persona("04", "lucas", 345, "cue");
		
		//2. agregar en arraylist y luego utilizar losmetodos creados
		GrupoPersonas gp = new GrupoPersonas();
		gp.anadePersona(p1);
		gp.anadePersona(p2);
		gp.anadePersona(p3);
		gp.anadePersona(p4);
		
		//mostrar datos
		gp.mostrar();
		gp.mostrarconFor();
		
		//eliminar datos con objetos
		gp.eliminaPersona(p2);
		
		//mostrar datos
		gp.mostrar();
		
		//eliminar datos con paraemtros
		gp.eliminaPersona(p3.getDni());
		
		//mostrar datos
		gp.mostrar();
		
		//otro ejemplo polimorfico con clases
		
		Persona p5 = new Persona("05", "mateo", 345, "cue");
		Ciudadano c1 = new Ciudadano("01", "mateo", 345, "cue","documento 1");
		Ciudadano c2 = new Ciudadano("02", "mateo", 345, "uio","documento 2");
		
		//array normal de tipo Persona
		Persona [] arrayPersona = new Persona[4];
		arrayPersona[0] = p5;
		arrayPersona[1] = c1;
		arrayPersona[2] = c2;
		arrayPersona[3] = p4;
		//leer todos los datos agregados en el array
		lectorArrayPersona(arrayPersona);
	}//fin del main
	
	//metodo polimorfico para lectura de array
	public static void lectorArrayPersona(Persona [] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("identificacion: " + array[i].identificacion());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
