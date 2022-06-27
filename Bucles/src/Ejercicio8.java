import java.util.Scanner;

/**
 * 8.Algoritmo que escriba todos los divisores de un número entero introducido 
 * por el usuario.
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el numero ");
		int num=teclado.nextInt();
		
		System.out.printf("Los divisores de %d son: ",num);
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.printf("\n %d ",i);
			}
		}
		teclado.close();
	}

}
