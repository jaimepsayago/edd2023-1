package com.pucese.collections;

import java.util.Arrays;

public class Collections {
	/**
	 * generar dos arrays
	 * construccion de algunos metodos para el manejo de arrays
	 * mostrar
	 * buscar
	 */
	
	//definir 4 arrays
	private int intArray [] = {1,2,3,4,5};
	private double doubleArray[] = {8,9,4,6,2,5,3,4};
	private int llenadoArray []; // array vacio declarado
	private int copiadoArray[];
	
	//constructor
	public Collections() {
		llenadoArray = new int [10]; //10 elementos
		copiadoArray = new int[intArray.length];
		
		//llenar los datos
		//metodo fill llenar datos con cierta cantida
		Arrays.fill(llenadoArray, 7); //lleando con el valor de 7 con el metodo fill
		//ordenar otro array
		//metodo sort
		Arrays.sort(doubleArray); //ascendente
		
		//copiar arrays
		System.arraycopy(intArray, 0, copiadoArray, 0, intArray.length);
	}
	
	//metodo para ver
	public void printArrays() {
		System.out.println("double array: " );
		for (double d: doubleArray)
			System.out.println(d);
		System.out.println();
		
		System.out.println("int array: " );
		for (int a:intArray)
			System.out.println(a);
		System.out.println();
		
		System.out.println("llenado array: " );
		for (int x:llenadoArray)
			System.out.println(x);
		System.out.println();
		
		System.out.println("copiado array: " );
		for (int y:copiadoArray)
			System.out.println(y);
		System.out.println();
	}
	//metodo para buscar
	public int buscar(int value) {
		return Arrays.binarySearch(intArray, value);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
