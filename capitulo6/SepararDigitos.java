package capitulo6;

import java.util.Scanner;

public class SepararDigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int valor;
		
		//System.out.print(99%10);
		System.out.print("Favor insira um digito entre 1 e 99999: ");
		valor = input.nextInt();
		
		
		displayDigits(valor);
	}
	
	public static int separarInteiro(int valor, int tamanho) {
		int divisor = 10;
		if(tamanho > 2)
			divisor = (int) Math.pow(divisor, tamanho-1);
		return valor / divisor;
	}
	
	public static int separarResto(int valor, int tamanho) {
		int divisor = 10;
		if(tamanho > 2)
			divisor = (int) Math.pow(divisor, tamanho-1);
		
		return valor % divisor;
	}
	
	public static void displayDigits(int valor) {
		String valorS = Integer.toString(valor);
		int tamanho = valorS.length();
		int digito = 0;
		
		
		for(int i = tamanho; i >= 1; i--) {
			
			if(i == 1) {
				System.out.printf("%d ", valor);
				break;
			}
			if(i == 2) {
				System.out.printf("%d ", separarInteiro(valor, i));
				System.out.printf("%d ", separarResto(valor, i));
				break;
			}else {
			digito = separarInteiro(valor, i);
			System.out.printf("%d ", digito);
			valor = separarResto(valor, i);
			//System.out.printf(" resto %d ", digito);
			}
		}
		
	}

}
