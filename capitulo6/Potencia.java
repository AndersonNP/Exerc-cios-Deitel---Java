package capitulo6;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int base;
		int exp;
		while(true) {
			System.out.printf("Insira a base: ");
			base = input.nextInt();
			System.out.printf("Insira o expoente: ");
			exp = input.nextInt();
		System.out.println(potencia(base,exp));
		}
	}
	
	public static int potencia(int base, int exp) {
		int total = base;
		if(exp == 1) {
			return base;
		}else {
		for(int i = 1; i < exp; i++) {
			total *= base;
		}
		return total;
		}
		
	}

}
