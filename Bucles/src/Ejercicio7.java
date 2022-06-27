import java.util.Scanner;

/**
 * 7.Algoritmo  que  cuente  cuántos  múltiplos  de  7  hay  entre  dos  enteros
 * dados  por  el usuario. 
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el primer numero ");
		int num1=teclado.nextInt();
		
		System.out.println("Introduce el segundo numero ");
		int num2=teclado.nextInt();
		
		int menor=num1;
		int mayor=num2;
		
		if(num1>num2) {
			menor=num2;
			mayor=num1;
		}
		
		int cuenta=0;
		
		for(int i=menor;i<=mayor;i++) {
			if(i%7==0) {
				cuenta++;
			}
		}
		
		System.out.printf("Hay %d multiplos de 7 entre los numeros %d y %d.",cuenta,menor,mayor);
		
		teclado.close();
	}

}
