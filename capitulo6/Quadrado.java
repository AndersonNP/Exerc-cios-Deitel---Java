package capitulo6;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int lado;
		char elemento;
		
		System.out.printf("Favor inserir o valor correspondente ao lado do quadrado: ");
		lado = input.nextInt();
		
		System.out.printf("Favor inserir o elemento que preencherá o quadrado: ");
		elemento = input.next().charAt(0);
		
		squareOfAsterisks(lado, elemento);
	}
	
	public static void squareOfAsterisks(int lado, char fillCharacter) {
		
		for(int i = 0; i < lado;i++) {
			for(int k = 0; k < lado; k++) {
				System.out.print(fillCharacter);
			}
			System.out.println();
		}
	}

}
