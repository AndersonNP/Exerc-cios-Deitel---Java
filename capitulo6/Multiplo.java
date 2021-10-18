package capitulo6;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int valor1;
		int valor2;
		while(true) {
			System.out.printf("%n%nInsira o lado 1: ");
			valor1 = input.nextInt();
			System.out.printf("Insira o lado 2: ");
			valor2 = input.nextInt();
		System.out.printf("O valor %d %s é mutiplo de %d", valor2,(isMultiple(valor1,valor2))?"":"não", valor1);
		}
	}
	
	public static boolean isMultiple(int a, int b) {
		
		if(b%a == 0)
			return true;
		else
			return false;
	}

}
