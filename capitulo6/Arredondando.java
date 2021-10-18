package capitulo6;
import java.util.Scanner;


public class Arredondando {

	public static void main(String[] args) {
		//olá

		//novo teste
		Scanner input = new Scanner(System.in);
		
		double original;
		double arredondado = 0;
		
		while(true) {
			System.out.printf("Insira o valor a ser arredondado: ");
			original = input.nextDouble();
			
			arredondado = Math.floor(original + 0.5);
			System.out.printf("O valor %.1f foi arredondado para %.1f%n%n%n",original, arredondado);
			
		}
	}

}
