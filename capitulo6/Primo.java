package capitulo6;

public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j = 1; j <= 10000; j++) {
			if(isPrimo(j))
				System.out.println(j);
		}
	}
	
	public static boolean isPrimo(int valor) {
		int flag = 0;
		for(int i = 1; i <=valor;i++) {
			if(valor%i == 0)
				flag++;
		}
		
		if(valor == 1 || flag > 2) {
			return false;
		}else {
			return true;
		}
	}

}
