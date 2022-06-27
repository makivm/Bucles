import java.util.Scanner;

/** 
11.Algoritmo que escriba la tabla de multiplicar usando esquemas do while. 
*/
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el numero ");
		int num=teclado.nextInt();
		
		int i=0;
		
		do {
			System.out.printf("%d x %d =%d\n",num,i,num*i);
			i++;
		} while (i<=10);
		
		teclado.close();
	}
}
