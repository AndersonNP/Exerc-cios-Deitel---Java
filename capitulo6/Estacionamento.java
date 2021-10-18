package capitulo6;
import java.util.Scanner;

public class Estacionamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int flag = 0;
		String lixo;
		int horaEntrada;
		int minutoEntrada;
		int horaSaida;
		int minutoSaida;
		double total = 0;
		int pos = 0;
		
		while(flag != -1) {
			System.out.printf("%nFavor informar a horário de"
					+" entrada do veículo (HH:MM): ");
			lixo = input.next();
			if(lixo.length() != 5) {
				System.out.println("Formato de data incorreto!");
				continue;
			}
			horaEntrada = Integer.parseInt(lixo.substring(0,2));
			minutoEntrada = Integer.parseInt(lixo.substring(3,5));
			
			
			System.out.printf("%nFavor informar a horário de"
					+" entrada do veículo (HH:MM): ");
			lixo = input.next();
			if(lixo.length() != 5) {
				System.out.println("Formato de data incorreto!");
				continue;
			}
			horaSaida = Integer.parseInt(lixo.substring(0,2));
			minutoSaida = Integer.parseInt(lixo.substring(3,5));
								
			total +=  calculateCharges(horaEntrada, minutoEntrada, horaSaida, minutoSaida);
			System.out.printf("%n%n|-----------------------------------------|%n");
			System.out.printf("|O valor é: %.2f", calculateCharges(horaEntrada, minutoEntrada, horaSaida, minutoSaida));
			System.out.printf("%n|O valor total recebido é: %.2f", total);
			System.out.printf("%n|-----------------------------------------|%n");
			
			System.out.printf("%n%nDigite -1 para encerrar o "
					+ "programa ou 0 para continuar: ");
			flag = input.nextInt();
			
			
			
		}
	}
	
	public static double calculateCharges(int horaE,int minutoE,int horaS,int minutoS) {
		
		horaE = (horaE*60) + minutoE;
		horaS = (horaS*60) + minutoS;
		
		int total = horaS-horaE;
		int resto = 0;
		
		//System.out.println(horaE+" "+minutoE+" "+horaS+" "+minutoS+" "+total);
		if(total <= 180) {
			return 2;
		}else {
			total -= 180;
			resto = total%60;
			if(resto == 0) {
				total = total/60;
				}
			else {
				total = (total/60) + 1;
			}
			
			double valor = (2 + 0.5* (double) total);
			
			return (valor > 10) ? 10 : valor;
		}
			
		
		
	}

}
