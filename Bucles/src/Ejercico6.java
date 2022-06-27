import java.util.Scanner;

/**
 *6.Algoritmo que calcule el factorial de un número entero introducido por 
 *el usuario.
 */

public class Ejercico6 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un numero ");
		int num=teclado.nextInt();
		
		int factorial=1;
		
		for(int i=2;i<=num;i++) {
			factorial= factorial*i;
		}
		System.out.printf("El factorial de %d es: %d.",num,factorial);
		
		teclado.close();
	}
}
