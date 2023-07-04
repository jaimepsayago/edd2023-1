package bucles;

public class BuclesAnidados {

	public static void main(String[] args) {
		// es un bucle dentro de otro bucle
		
		for (int n =0; n <= 2; n ++ ) {
			for (int n1 =0; n1 <= 2; n1 ++ ) {
				System.out.println("valor de n: " + n + "n1: " + n1);
			}
		}
		//sentencia que ejecute 5 veces y el bucle interno imprimie 10 numeros
		//finalmente me mostrara 50 numeros
		
		for (int n =1; n <= 5; n ++ ) {
			for (int n1 =1; n1 <= 10; n1 ++ ) {
				System.out.print((n * n1) + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		//cuadrado con asteriscos
		for (int x =1; x <= 5; x ++ ) {
			for (int y1 =1; y1 <= 5; y1 ++ ) {
			//	System.out.print((n * n1) + " ");
			System.out.print(" *");
			}
			System.out.println();
		}
		//triangulo
		for (int x =1; x <= 5; x ++ ) {
			for (int y1 =1; y1 <= x; y1 ++ ) 
			//	System.out.print((n * n1) + " ");
			System.out.print(x);
			
			System.out.println();
		}
		System.out.println("--------------------");
		//generar el siguiente codigo
		//....1
		//...2
		//..3
		//.4
		//5
		
		for (int x =1; x <= 5; x ++ ) {
			for (int y1 =1; y1 <= (-1 * x + 5); y1 ++ ) 
			//	System.out.print((n * n1) + " ");
			System.out.print(".");
			
			System.out.println(x);
		}

	}

}
