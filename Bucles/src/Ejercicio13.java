import java.util.Scanner;

/**
 * 13.Algoritmo que pida un número natural y determine si es primo o no.  *
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un numero natural");
		int num=teclado.nextInt();
		
		boolean primo=true;
		
		for(int i=2;i<num &&primo;i++) {
			if (num%i==0) 
				primo=false;
		}
		
		if (primo) {
			System.out.println("El numero es primo");
		}else if (!primo){
			System.out.println("El numero no es primo");
		}
		
		teclado.close();
	}
}
