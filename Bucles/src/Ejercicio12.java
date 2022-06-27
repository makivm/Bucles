import java.util.Scanner;

/**
12.Algoritmo que determine si un número entero dado es perfecto o no. 
Se dice que un número es perfecto cuando es igual a la suma de sus divisores, 
excluido él mismo. Por ejemplo 6 es perfecto, ya que 6 = 1 + 2 + 3. 
 */

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el numero ");
		int num=teclado.nextInt();
		
		int suma=0;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				suma=suma+i;
			}
		}
		
		if(suma==num) {
			System.out.printf("\n El numero %d es perfecto.",num);
		}else 
			System.out.printf("\n El numero %d no es perfecto.",num);
		teclado.close();

	}

}
