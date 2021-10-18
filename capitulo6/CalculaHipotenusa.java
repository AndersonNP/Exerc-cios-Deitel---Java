package capitulo6;

import java.util.Scanner;

public class CalculaHipotenusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double lado1;
		double lado2;
		while(true) {
			System.out.printf("Insira o lado 1: ");
			lado1 = input.nextDouble();
			System.out.printf("Insira o lado 2: ");
			lado2 = input.nextDouble();
		System.out.printf("O valor da hipotenusa é %.2f%n%n",hipotenusa(lado1, lado2));
		}
	}
	
	public static double hipotenusa(double l1, double l2) {
		
		double total = Math.sqrt(Math.pow(l1, 2) + Math.pow(l2, 2));
		return total;
	}
	
	
	

}
