package com.pucese.edd;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

//una linea de comentario 

/*
 * varias lines de comentarios
 */

public class HolaMundo {

	//metodo permite la ejecucion de una aplicacion java
	public static void main(String[] args) {
		
		//imprimir una linea en consola
		System.out.println("bienvenido a la \n programacion en java");
		System.out.println("\"entre comillas\"");
		//metodo printf
		System.out.printf("%s \n %s \n","hola mundo","soy jaime" );
		//leer datos desde consola
		//scanner lee string int double
		Scanner input = new Scanner(System.in);
		//necesitamos un mensaje para ingresar los datos
		System.out.println("ingrese los datos a continuacion:");
		//leer los datos del teclado
		String text = input.nextLine();
		//mostrar informacion guardada
		System.out.println("datos guardados: " + text);
		input.close();
		
		//sumar dos numeros
		//tipado tipos de datos 
		int x=0; //primitivo
		Integer y; //objeto entero wrapper
		y=20;
				
		int suma;
		
		suma= x + y;
		
		System.out.println("la suma es " + suma);
		
		//formatos
		double n11=1.25036;
		Double n12=1.0/3.0;
		System.out.printf("%.3f \n", n11); //3 decimales
		System.out.printf("%+.4f \n", n11); //4 decimales mas un sig + adelante
		System.out.printf("%5.3f \n", n12); //5 enteros y 3 deciamesl
		
		//formato de fecha
		Calendar  fechaHora = Calendar.getInstance(); //instanciando un objeto y agregando la fecha actual
		System.out.printf("%tc \n", fechaHora); //fecha formato largo
		System.out.printf("%tF \n", fechaHora); //fecha con formato corto
		System.out.printf("%tD \n", fechaHora); //fecha con formato mes dia año
		
		//nombreVariable
		//datosDelDispositivoUno
		//datos_del_dispositivo_uno
		//NO caracteres especiales * / . , 
		//palabras reservadas for if while switch 
		
		//expresiones algebraicas
		
		// igual  ==     x == y
		// no es igual != x != y
		//mayor y menor > < <= =>
		 int a=0;
		int xy = a + (1*1);
		
		//operadores logicos ejercicio
		//valores randomicos aleatorios
		Random aleatorio = new Random();
		int i = aleatorio.nextInt() % 100; 
		int j = aleatorio.nextInt() % 100;
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("i > j es " + (i > j) );
		System.out.println("i < j es " + (i < j) );
		System.out.println("i => j es " + (i >= j) );
		System.out.println("i <= j es " + (i <= j) );
		System.out.println("i == j es " + (i == j) );
		System.out.println("i != j es " + (i != j) );
		
		// and y or 
		//and &&
		System.out.println("i<10 && j>10 es " +((i < 10)&& (j > 10)));
		//or ||
		System.out.println("i<10 || j>10 es " +((i < 10)|| (j > 10)));
		
		
		
		
		
		
		
		

	}//fin del metodo main

}//fin de la clase hola mundo
