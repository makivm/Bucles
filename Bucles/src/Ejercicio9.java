import java.util.Scanner;

/**
 * 9.Algoritmo que escriba la tabla de multiplicar usando esquemas for. 
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el numero ");
		int num=teclado.nextInt();
		
		for(int i=0;i<=10;i++) {
			System.out.printf("%d x %d =%d\n",num,i,num*i);
		}
		teclado.close();
	}
}
