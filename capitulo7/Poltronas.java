package capitulo7;

import java.util.Arrays;
import java.util.Scanner;

public class Poltronas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean[] assentos = new boolean[10];
		Arrays.fill(assentos, false);
		int opcao = 0;
		int flag = 0;
		
		System.out.printf("Favor selecione uma opção abaixo:%n"
				+ "1 - Primeira Classe%n"
				+ "2 - Classe Economica%n");
		opcao = input.nextInt();
		
		if(opcao == 1) {
			if(assentos[4] == true) {
				System.out.printf("A primeira classe se encontra lotada, deseja ficar na classe economica?%n"
						+ "1 - SIM%n"
						+ "2 - NÃO%n");
				flag = input.nextInt();
				if(flag == 1) {
					for(int i = 5;i<10;i++) {
						if(assentos[i]==false) {
							assentos[i]=true;
							break;
						}
					}
				}else {
					System.out.println("O próximo voo parte em 3 horas");
				}
				
			}else {
				for(int i = 0;i<5;i++) {
					if(assentos[i]==false) {
						assentos[i]=true;
						break;
					}
				}
				
			}	
			
		}else if(opcao == 2) {
			if(assentos[9] == true) {
				System.out.printf("A classe economica se encontra lotada, deseja ficar na primeira classe?%n"
						+ "1 - SIM%n"
						+ "2 - NÃO%n");
				flag = input.nextInt();
				if(flag == 1) {
					for(int i = 0;i<5;i++) {
						if(assentos[i]==false) {
							assentos[i]=true;
							break;
						}
					}
				}else {
					System.out.println("O próximo voo parte em 3 horas");
				}
			}else {
				for(int i = 5;i<10;i++) {
					if(assentos[i]==false) {
						assentos[i]=true;
						break;
					}
				}
				
			}
			
		}
		
	
	
	}
		
		

}


