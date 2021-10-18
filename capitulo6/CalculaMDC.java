package capitulo6;

import java.util.Scanner;

public class CalculaMDC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b;
		
		System.out.printf("Insira o primeiro valor: ");
		a = input.nextInt();
		
		System.out.printf("Insira o segundo valor: ");
		b = input.nextInt();
		
		System.out.printf("O MDC dos valores %d e %d é %d", a, b, mdc(a, b));
	}
	
	public static int mdc(int a, int b) {
		int resto = 0;
		while(b!=0) {
			resto = a%b;
			a = b;
			b = resto;
		}
		return a;
	}

}
