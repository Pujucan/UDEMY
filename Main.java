import java.util.Scanner;

public class Main {
			
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int codigo, qtd;
		double total;
		
		System.out.println("DIGITE CÓDIGO:");
		codigo = sc.nextInt();
		
		System.out.println("DIGITE QTD:");
		qtd = sc.nextInt();
		
		if ( codigo == 1 ) {
			total = qtd * 4.0;
				System.out.println();
					System.out.println("Valor pago pelo Cachorro Quente é: " + total);
		}
		
		else if (codigo == 2) {
			total = qtd * 4.5;
				System.out.println();
					System.out.println("Valor pago pelo X-Salada é: " + total);
		}	
		
		else if (codigo == 3) {
			total = qtd * 5.0;
				System.out.println();
					System.out.println("Valor pago pelo X-Bacon é: " + total);
		}
		
		else if (codigo == 4) {
			total = qtd * 2.0;
				System.out.println();
					System.out.println("Valor pago pelo Torrada Simples é: " + total);
		}
		
		else if (codigo == 5) {
			total = qtd * 1.5;
				System.out.println("Valor pago pelo Refrigerante é: " + total);
		}	

		sc.close();
		
	}

}