import java.util.Scanner;

/**
 * 14.Algoritmo  que  pida  dos  números  naturales  e  imprimir  su  
 * cociente entero  por  el método de las restas sucesivas. 
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce el primer dividendo");
		int dividendo= entrada.nextInt();
		System.out.println("Introduce el divisor");
		int divisor=entrada.nextInt();
		
		entrada.close();

		int resto=dividendo;
		int cociente=0;
	
		while(resto>=divisor) {
			resto=resto-divisor;
			cociente++;
		}
		System.out.printf("El cociente de %d entre %d es:\n%d con resto %d" ,dividendo,divisor,cociente,resto);
	}

}
