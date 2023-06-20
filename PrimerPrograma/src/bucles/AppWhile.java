package bucles;

import java.util.Scanner;

public class AppWhile {

	public static void main(String[] args) {
		/*funciona
		 * while (condicion)
		 * instrucciones
		 * contador +1
		 */

		//imprimir del 1 al 5
		int i=0;
		while(i<5) {
			System.out.println("valor de i: " + i);
		i++; //aumente o dismuya el contador
		}
		//calificaciones con funciones
		
		//llamar funcion mensaje
		mostrarMensaje();
		System.out.println();
		determinarPromedioClase();
		
		
	}
	//ingreso de datos ingresar calificaciones
	public static void determinarPromedioClase(){
		Scanner entrada = new Scanner(System.in);
		int total; //suma de calificaciones
		int contadorCalif; //numero de calificaicones
		int calificacion;// valor de la calificacion
		int promedio;//promedio de la calificaciones
		//inicializar las variables que van a acumular datos
		total=0;
		contadorCalif=0;
		//fase de procesamiento de datos
		
		while(contadorCalif <=10) {
			System.out.println("escribe la calificaion: ");
			calificacion = entrada.nextInt();
			total = total + calificacion; //sumando las calificaciones
			contadorCalif = contadorCalif+1; //aunmentar el contador
		}//fin de bucle while
		
		//fase de terminacion
		promedio= total/10;
		//mostrar los resultados
		System.out.println("el total de las 10 calificaciones es " + total);
		System.out.println("el promedio es " + promedio);
		
		
	}
	
	//mostrar un mensaje
	public static void mostrarMensaje() {
		System.out.printf("bienvenido al libro de calificaciones ", "calificaciones");
	}
	
	
	
	
	
	
	
	
	
	

}
