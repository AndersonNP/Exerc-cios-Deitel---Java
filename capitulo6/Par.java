package capitulo6;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int valor1;
		while(true) {
			System.out.printf("%n%nInsira o valor: ");
			valor1 = input.nextInt();
		System.out.printf("O valor %d %s é par", valor1,(isEven(valor1))?"":"não");
		}
	}
	
	
public static boolean isEven(int a) {
		
		if(a%2 == 0)
			return true;
		else
			return false;
	}

}
