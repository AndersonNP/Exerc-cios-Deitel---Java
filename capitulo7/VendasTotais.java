package capitulo7;

public class VendasTotais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0;
		int produto = 1;
		double[][] vendas = {{10,20,15,40},
							 {20,13,18,24},
							 {14,12,7,31},
							 {19,8,35,19},
							 {14,16,10,5}};
		System.out.printf("               ");
		for(int vendedor = 0;vendedor < vendas[0].length;vendedor++ ) {
			System.out.printf("%s %d\t", "Vendedor", vendedor +1);
		}
		System.out.printf("Total por produto%n");
		
		for(double[] vendaVendedor:vendas) {
			total = 0;
			System.out.printf("Produto %d",produto);
			for(double venda:vendaVendedor) {
				System.out.printf("%15.1f",venda);
				total += venda;
			}
			System.out.printf("%20.1f%n",total);
			produto++;
		}
		
		total = 0;
		
		System.out.printf("Total por vendedor");
		
		for(int i = 0; i < 4;i++) {
			total = 0;
			for(int j = 0; j < 5;j++) {
				total+=vendas[j][i];
			}
			System.out.printf("  %-13.1f",total);
		}
	}

}
