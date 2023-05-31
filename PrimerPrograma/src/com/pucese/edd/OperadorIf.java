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
		//operador terciario = if resumido
		
		int x =4, y=2, mayor=0;
		
		mayor = (x < y) ? x : 0;
		System.out.println(mayor);
		
		
		
		
		
		
		
		
		
		
		
		
	}//fin main

}//fin operadorif
