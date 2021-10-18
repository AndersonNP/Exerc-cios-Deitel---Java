package capitulo6;

public class Perfeito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int j = 1; j <= 10000; j++) {
			isPerfect(j);
		}

	}
	
	public static void isPerfect(int valor) {
		int total = 0;
		
		for(int i = 1; i < valor;i++) {
			if(valor%i == 0)
				total +=i;
		}
		
		if(total == valor) {
			System.out.printf("O valor %d é perfeito: %d"
					+ " = ", valor, valor);
			for(int i = 1; i < valor;i++) {
				if(valor%i == 0) {
					
					System.out.printf("%d ", i);
				}	
			}
			
			System.out.println();
		}
			
	}

}
