import java.util.Scanner;

/** 
 * 4.Algoritmo  que  escriba  los  números  impares  comprendidos  entre  dos  
 * enteros introducidos por el usuario.
 */

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el primer numero ");
		int num1=teclado.nextInt();
		
		System.out.println("Introduce el segundo numero ");
		int num2=teclado.nextInt();
		
		int menor=num1;
		int mayor=num2;
		
		if (num1>num2) {
			mayor=num1;
			menor=num2;
		}
		
		if(menor%2==0) {
			menor++;
		}
		
		for (int i=menor;i<=mayor;i=i+2){
				System.out.printf("%d ",i);
		}
		
		teclado.close();
	}
}
