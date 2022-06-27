import java.util.Scanner;

/**
 10.Algoritmo que escriba la tabla de multiplicar usando esquemas while. 

 */
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el numero ");
		int num=teclado.nextInt();
		
		int i=0;
		
		while (i<=10) {
			System.out.printf("%d x %d =%d\n",num,i,num*i);
			i++;
		}
		teclado.close();
	}
}
