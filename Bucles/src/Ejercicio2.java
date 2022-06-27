import java.util.Scanner;

/**
 * 2.Algoritmo  que  imprima  la  tabla  de  multiplicar  correspondiente  a  un
 * número comprendido  entre  uno  y  diez,  introducido  por  el  usuario,  
 * usando  un  esquema while.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un numero comprendido entre 1 y 10: ");
		int num=teclado.nextInt();
		
		int i=0;
		
		while (i<=10){
			System.out.printf("\n %dx%d =%d",num,i,num*i);
			i++;
		}
		
		teclado.close();
	}

}
