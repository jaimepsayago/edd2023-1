package com.pucese.edd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Funciones {

	public static void main(String[] args) {
		/*
		 * sintaxis
		 * TIPO_FUNCION NOMBRE (TIPO1 PARAMETRO1, TIPO2,P2...N )
		 * {
		 * 	BLOQUE DE CODIGO
		 * 
		 * RETURN 
		 * }
		 */
		
		//AGREGO public static 
		
		int x=12, y=14;
		int s = suma(x,y);
		System.out.println("suma es " + s);
		//funcion para ingresar datos
		String texto = leerDatos("introduce algun dato");
		System.out.println("el texto ingresado es: "+ texto);
	}//fin main
	//aqui se define la funcion
	public static int suma(int x, int y) {
		int s=0;
		s=x+y;
		return s;
	}
	//funcion 2 ingreso de datos
	
	public static String leerDatos(String mensaje) {
		String texto;
		try {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		texto=in.readLine();
		} catch (Exception e) {
			texto="error";
		}
		return texto;
		
	}
	
	/*Escribe un metodo llamado calcular distancia entre dos puntos (x1, y1) y (x2,y2).
	 * todos los numeros y valores de retorno deben ser double. Incorpore este metodo
	 * en una aplicacion que permite al usuario introducir las coordenadas de los puntos.
	 * Investigar formular distancia entre dos puntos.
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}//fin funciones
