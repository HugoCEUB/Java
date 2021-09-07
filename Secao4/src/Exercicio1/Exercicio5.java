package Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Locale.setDefault(Locale.US);
			
			int cd1, cd2, pc1, pc2;
			double valor1, valor2, pg;
			
			cd1 = sc.nextInt();
			pc1 = sc.nextInt();
			valor1 = sc.nextDouble();
			
			cd2 = sc.nextInt();
			pc2 = sc.nextInt();
			valor2 = sc.nextDouble();
			
			pg = (pc1 * valor1) + (pc2 * valor2);
			
			System.out.printf("VALOR A PAGAR: R$ %.2f", pg);
			
		}

	}

}
