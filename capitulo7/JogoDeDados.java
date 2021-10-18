package capitulo7;

import java.security.SecureRandom;
import java.util.Arrays;

public class JogoDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] somas = new int[13];
		int soma = 0;
		
		Arrays.fill(somas, 0);
		
		for(int i = 1;i<1000000;i++) {
			soma = lancarDado();
			soma += lancarDado();
			//System.out.println(soma);

			somas[soma]++;
		}
		
		for(int i = 2; i<=12;i++) {
			System.out.printf("Soma %3d : %3d vezes%n", i,somas[i]);
		}
	}
	
	public static int lancarDado() {
		SecureRandom aleatorio = new SecureRandom();
		return aleatorio.nextInt(6)+1;
	}

}
