import java.util.Scanner;

/**
 * 14.Algoritmo  que  pida  dos  números  naturales  e  imprimir  su  
 * cociente entero  por  el método de las restas sucesivas. 
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el primer dividendo");
		int dividendo= teclado.nextInt();
		System.out.println("Introduce el divisor");
		int divisor=teclado.nextInt();
		
		int resta=dividendo-divisor;
		
		int i=0;
		if (dividendo>=divisor)
			for(i=1;resta>=divisor;i++){
				resta=resta-divisor;
			}
		System.out.printf("El cociente es: %d",i);

		teclado.close();	
	}

}
