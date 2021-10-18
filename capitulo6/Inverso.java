package capitulo6;

import java.util.Scanner;

public class Inverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int valor;
		
		System.out.printf("Favor informar valor: ");
		valor = input.nextInt();
		inverso(valor);
	}
	
	public static void inverso(int valor) {
		String valorS = Integer.toString(valor);
		int tamanho = valorS.length();
		int novo = 0;
		
		for(int i = tamanho; i >= 1; i--) {
			if(i == 2) {
				System.out.print(valor%10);
				System.out.print(valor/10);
				break;
			}else {
			System.out.print(valor%10);
			valor = valor/10;
			}
		}
	}

}
