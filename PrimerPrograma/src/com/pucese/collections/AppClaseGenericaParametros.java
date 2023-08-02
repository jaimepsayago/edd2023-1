package com.pucese.collections;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.InternalFrameListener;

public class AppClaseGenericaParametros {

	public static void main(String[] args) {
		//objeto generico y enviar parametros
		//leer e imprimir
		
	ClaseGenericaParametros<Integer, String> 
		claseGenerica = new ClaseGenericaParametros<Integer, String>(28, "clase generica");
		
	//mostrar los tipos de datos
	claseGenerica.mostrarTipos();
	System.out.println("valor obj1: " + claseGenerica.getObj1());

	
	//crear un arraylist y luego un metodo para leer un arraylist de tipo generico
	List<Integer> inList = new ArrayList<Integer>();
	inList.add(4);
	inList.add(5);
	
	
	List<String> sList = new ArrayList<String>();
	sList.add("hola");
	sList.add("mundo");
	
	printList(inList);
	printList(sList);
	
	
	
	
	}
	//funcion generica para leer arrays
	public static <T> void printList(List<T> list) {
		for(T elemento:list) {
			System.out.println(elemento);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
