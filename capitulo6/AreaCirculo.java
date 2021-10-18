package capitulo6;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double raio;
		double area;
		System.out.printf("Favor inserir o valor do raio do circulo: ");
		raio = input.nextDouble();
		
		area = circleArea(raio);
		
		System.out.printf("%nO valor da área do círculo é %.2f", area);
				
	}
	
	public static double circleArea(double raio) {
		return 3.14 * (raio*raio);
	}

}
