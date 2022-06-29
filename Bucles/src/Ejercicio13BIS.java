import java.util.Scanner;

public class Ejercicio13BIS {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un numero natural");
		int num=teclado.nextInt();
		
		int divisores=0;
		
		for(int i=2;i<num &&divisores==0;i++)
		{
			if (num%i==0)
				divisores++;
		}
		if (divisores>0) {
			System.out.println("El numero no es primo");
		}else {
			System.out.println("El numero es primo");
		}
		teclado.close();
	}

}
