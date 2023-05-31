package com.pucese.edd;

public class OperadorIf {//operadorif

	public static void main(String[] args) {//main
		// condicionales IF y SWITCH
		//repetetitos loops --- WHILE FOR DO WHILE
		
		int intento = 15;
		int solucion = 15;
		int resultado = 0;
		
		//if
		//condicion
		if (intento > solucion) { //if 1
			resultado=-1;
		}//fin if 1
			else if (intento < solucion) {//otra condicion anidada de la primera if2
				resultado=1;
			}//fin if 2
				else { //if 3
				System.out.println("no cumple condicion");
				}//fin if 3
		//mensaje
		System.out.println(resultado);
		//operador terciario = if resumidossss
		
		int x =4, y=2, mayor=0;
		
		mayor = (x < y) ? x : 0;
		System.out.println(mayor);
		
		//TAREA EN CLASE
		/*
		 * ESCRIBIR UN PROGRAMA QUE INGRESE POR TECLADO 5 NUMEROS ENTEROS AL AZAR
		 * PARA CADA VALOR UTILIZAR UNA SENTENCIA IF ELSE PARA CLASIFICARLO COMO MAYOR MENOR O IGUAL
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
	}//fin main

}//fin operadorif
