package capitulo6;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double temperatura;
		int opcao = 0;
		System.out.printf("Favor selecione a temperatura de entrada:%n"
				+ "1 - Celsius%n2 - Fahrenheit%n%n");
		opcao = input.nextInt();
		
		if(opcao == 1) {
			System.out.printf("Favor insira a temperatura em Celsius: ");
			temperatura = input.nextDouble();
			
			System.out.printf("%nA temperatura em Fanhrenheit é %.1f", fahrenheit(temperatura));
		}else if(opcao == 2) {
			System.out.printf("Favor insira a temperatura em Fanhrenheit: ");
			temperatura = input.nextDouble();
			
			System.out.printf("%nA temperatura em Celsius é %.1f", celsius(temperatura));
		}
		
	}
	
	public static double celsius(double temperatura) {
		return 5.0/9.0 * (temperatura - 32);
	}
	
	public static double fahrenheit(double temperatura) {
		return 9.0/5.0 * temperatura + 32;
	}

}
