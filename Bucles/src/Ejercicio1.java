import java.util.Scanner;

/**
 * 1.Algoritmo  que  imprima  la  tabla  de  multiplicar  correspondiente  a  un
 * número comprendido entre uno y diez, introducido por el usuario, 
 * usando un esquema for
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un numero comprendido entre 1 y 10: ");
		int num=teclado.nextInt();
		
		for (int i=0;i<=10;i++){
			System.out.printf("\n %dx%d =%d",num,i,num*i);
		}
		
		teclado.close();
	}
}
