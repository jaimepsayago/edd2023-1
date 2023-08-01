package com.pucese.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class AppArrays {

	public static void main(String[] args) {
		// crear un objeto de tipo colletions y ejecutar los metodos creados
		Collections arrayCollections = new Collections();
		arrayCollections.printArrays();
		//buscar
		int value = arrayCollections.buscar(5);
		System.out.println("dato buscado en intArray: " + value);

		/**
		 * trabajar con objetos
		 * 1. instanciar un objeto
		 * 2. arregarlo a un arraylist
		 * 3. recorrerlo
		 * 4. con varias opciones de recorrer
		 */
		
		Estado estado1;
		ArrayList<Estado> estados = new ArrayList<>(); //arraylist
		
		estado1 = new Estado(1, "portugal", 343434343);
		estados.add(estado1); //agregandl estado a la lista estados
		estado1 = new Estado(2, "canada", 32222243);
		estados.add(estado1); //agregandl estado a la l
		estado1 = new Estado(3, "eeuu", 999999);
		estados.add(estado1); //agregandl estado a la l
		estado1 = new Estado(4, "mexico", 8888);
		estados.add(estado1); //agregandl estado a la l
		
		//recorrido
		System.out.println("-------------------recorrido size get: ");
		Estado estado2;
		for (int i=0; i<estados.size(); i++) {
			estado2=estados.get(i);
			System.out.println("id: " + estado2.getIdEstado());
			System.out.println("nombre: " + estado2.getNombre());
		}
		System.out.println("-------------------recorrido for each: ");
	
		for (Estado estado3:estados) {
			System.out.println("id: " + estado3.getIdEstado());
			System.out.println("nombre: " + estado3.getNombre());
		}
		System.out.println("-------------------recorrido iterator: ");
		Estado estado4;
		Iterator<Estado> iteratorEstado = estados.iterator(); 
		while(iteratorEstado.hasNext()) {
			estado4 = iteratorEstado.next(); //muestra el valor iterado
			System.out.println("id: " + estado4.getIdEstado());
			System.out.println("nombre: " + estado4.getNombre());
		}
		System.out.println("-------------------recorrido numerador: ");
		Estado estado5;
		Enumeration<Estado> enumerationEstado = java.util.Collections.enumeration(estados);
		while(enumerationEstado.hasMoreElements()) {
			estado5= enumerationEstado.nextElement();
			System.out.println("id: " + estado5.getIdEstado());
			System.out.println("nombre: " + estado5.getNombre());
		}
		
		System.out.println("-------------------recorrido object array: ");
		Object[] arrayEstado = estados.toArray(); //convertir en un array a estados
		for (int i=0; i<arrayEstado.length; i++) {
			System.out.println("id: " + ((Estado)arrayEstado[i]).getIdEstado());
			System.out.println("nombre: " + ((Estado)arrayEstado[i]).getNombre());
		}
		Estado estado6 = new Estado(5, "ecuador", 1788888);
		estados.add(estado6); 
	
	
		//eliminar
		estados.remove(estado6);
		
	//metodo clear
		estados.clear();
		
		
		
		//clase collections map de tipo objeto estado
		LinkedHashMap<Integer, Estado> estadosLinked = new LinkedHashMap<>();
		
			
		//hashset
		LinkedHashSet<Estado> listaEstadosHashSet = new LinkedHashSet<>();
		estado1 = new Estado(1, "portugal", 343434343);
		listaEstadosHashSet.add(estado1); //agregandl estado a la lista estados
		estado1 = new Estado(2, "canada", 32222243);
		listaEstadosHashSet.add(estado1); //agregandl estado a la l
		estado1 = new Estado(3, "eeuu", 999999);
		listaEstadosHashSet.add(estado1); //agregandl estado a la l
		estado1 = new Estado(4, "mexico", 8888);
		listaEstadosHashSet.add(estado1); //agregandl estado a la l
		
		//si existe un valor o no y si esta duplicado
		Estado estadoDuplicado = new Estado(3, "eeuu", 999999); //ingreso de datos
		
		listaEstadosHashSet.add(estadoDuplicado);
		if (listaEstadosHashSet.contains(estadoDuplicado))
			System.out.println("ya existe el objeto en el set");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
