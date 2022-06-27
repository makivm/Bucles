/** 5.Algoritmo  que  sume  los n primeros  números  enteros,  
 * siendo  n  un  número introducido por el usuario. 
 */

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el primer numero ");
		int num=teclado.nextInt();
		
		int suma=0;
		
		for(int i=1;i<=num;i++) {
			suma=suma+i;
		}
		System.out.printf("El resultado de sumar los %d numeros enteros es: %d.",num,suma);
		
		teclado.close();

	}

}
