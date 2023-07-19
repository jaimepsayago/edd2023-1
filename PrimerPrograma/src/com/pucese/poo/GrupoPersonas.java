package com.pucese.poo;

import java.util.ArrayList;

public class GrupoPersonas {
	
	//operaciones con datos para agregar o eliminar
	
	//delcara un arraylista de tipo persona
	private ArrayList<Persona> listaPersonas;
	
	//inicializar nuestro arraylist
	public GrupoPersonas() {
			listaPersonas = new ArrayList<Persona>();
	}
	//anadir persona al arrayList
	public void anadePersona(Persona persona) {
		listaPersonas.add(persona);
	}
	
	//dos metodos y son polimorficos
	public void eliminaPersona(Persona persona) {
		//lista de personas borrar el elemento
		listaPersonas.remove(persona);
	}
	
	public void eliminaPersona(String dni) {
		//recorrido a la lista hasta encontrar el valor del parametro
		for(int i=0; i<listaPersonas.size(); i++) {
			if (listaPersonas.get(i).getDni() == dni) {
				listaPersonas.remove(i);
			}
		}
		
	}
	//mostrar informacion
	@Override
	public String toString() {
		return "GrupoPersonas [listaPersonas=" + listaPersonas + "]";
	}
	
	public void mostrar() {
		System.out.println("mostrar datos de la lista de personas");
		for(Persona p: listaPersonas) {
			System.out.println(p.toString());
		}
	}
	
	public void mostrarconFor() {
		System.out.println("mostrar datos de la lista de personas");
		for(int i=0; i < listaPersonas.size(); i++) {
			System.out.println(listaPersonas.get(i).getNombre() 
					+ " " +  listaPersonas.get(i).getDireccion());
				
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
