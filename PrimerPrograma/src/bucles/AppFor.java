package bucles;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AppFor {

	public static void main(String[] args) {
		/*
		 * for (inicializacion; comprobacion; actualizacion){
		 * codificacion
		 * }
		 */

		for(int i=1, j = i +10; i<=100; j = i *2 , i++) {
			System.out.println("valor de i: " + i);
			System.out.println("valor de j: " + j);
		}
		
		//pedir 10 sueldos. mostrar su suma y cuantos hay mayores a 1000
		int suma=0, mayorDe1000=0, sueldo;
		//Scanner input = new Scanner(System.in);
		String entrada;
		
		for(int k =1; k<=10; k++) {
		
			//sueldo = input.nextInt();
			entrada= JOptionPane.showInputDialog("ingrese el sueldo");
			sueldo = Integer.parseInt(entrada);
			if (sueldo > 1000)
				mayorDe1000++; //cuenta cuantos sueldos son mayores a  1000
			suma= suma + sueldo; //suma de los sueldos
		}
		
		System.out.println("mayor de 1000 existen: " + mayorDe1000);
		System.out.println("la suma es: " + suma);
		
	}

}
