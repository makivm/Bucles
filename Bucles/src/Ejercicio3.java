import java.util.Scanner;

/**
 * 3.Algoritmo  que  imprima  la  tabla  de  multiplicar  correspondiente  
 * a  un  número comprendido entre uno y diez, introducido por el usuario, 
 * usando un esquema do while. Nota: En los tres ejercicios anteriores, 
 * el programa ha de controlar mediante un esquema do-while, 
 * que el número está comprendido entre 1 y 10.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un numero comprendido entre 1 y 10: ");
		int num=teclado.nextInt();
		
		int i=0;
		
		do {
			System.out.printf("\n %dx%d =%d",num,i,num*i);
			i++;
		} while (i<=10);
		
		teclado.close();

	}

}
