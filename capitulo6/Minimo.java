package capitulo6;

import java.util.Scanner;

public class Minimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double v1,v2,v3;
		
		System.out.printf("Insira o primeiro valor: ");
		v1 = input.nextDouble();
		System.out.printf("Insira o segundo valor: ");
		v2 = input.nextDouble();
		System.out.printf("Insira o terceiro valor: ");
		v3 = input.nextDouble();
		
		System.out.printf("%n%nO menor valor é %.1f", minimum3(v1, v2, v3));
	}
	
	public static double minimum3(double v1, double v2, double v3) {
		double min = v1;
		min = Math.min(v1, v2);
		min = Math.min(v3, min);
		
		return min;
	}

}
