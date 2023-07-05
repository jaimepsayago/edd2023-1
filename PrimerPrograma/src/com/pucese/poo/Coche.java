package com.pucese.poo;

public class Coche extends Vehiculo{
		public int ruedas; //override
		public int gasolina;
		
		//constructor inicial
		public Coche() {
			ruedas=4;
			gasolina=0;
		}
		//constructor con parametros
		public Coche(int ruedas, int gasolina, String color) {
			super(); //carga a los hijos la herencia del padre es decir las propiedades
			
			this.gasolina= gasolina;
		}
		//metodo
		public int repostar() {
			return 20;
		}
		
		

}
