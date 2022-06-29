/** Pedir 10 numeros por teclado y calcular el menor.
 */

import java.util.Scanner;

public class EjercicioExtra {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Introduce el 0 numero\n");
		int num = entrada.nextInt();
		int menor=num;
		
		for(int i=1;i<10;i++)	
		{
			System.out.printf("Introduce el %d numero\n",i);
			num = entrada.nextInt();
			
			if (num<menor)
				menor=num;
			
		}
		System.out.printf("El menor es: %d",menor);
		entrada.close();
	}

}
