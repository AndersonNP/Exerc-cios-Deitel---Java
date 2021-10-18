package capitulo6;

import java.util.Scanner;

public class ArredondandoDecimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		double original;
		double arredondadoI = 0;
		double arredondadoD = 0;
		double arredondadoC = 0;
		double arredondadoM = 0;

		while(true) {
			System.out.printf("Insira o valor a ser arredondado: ");
			original = input.nextDouble();
			
			arredondadoI = roundToInteger(original);
			arredondadoD = roundToTenths(original);
			arredondadoC = roundToHundredths(original);
			arredondadoM = roundToThousandths(original);
			
			System.out.printf("O valor %.1f%n"
					+ "foi arredondado para o inteiro %.4f%n"
					+ "foi arredondado para o decimal %.4f%n"
					+ "foi arredondado para o centesinal %.4f%n"
					+ "foi arredondado para o milesimal %.4f%n%n%n",original, arredondadoI,arredondadoD,arredondadoC,arredondadoM);
			
		}
	}
	
	public static double roundToInteger(double original) {
		return Math.floor(original + 0.5);
	}
	
	public static double roundToTenths(double original) {
		return Math.floor(original*10 + 0.5)/10;
	}
	
	public static double roundToHundredths(double original) {
		return Math.floor(original*100 + 0.5)/100;
	}
	
	public static double roundToThousandths(double original) {
		return Math.floor(original*1000 + 0.5)/1000;
	}

}
