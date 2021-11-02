package exercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double item;
		System.out.println("Digite o código e quantidade: ");
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			item = 4.00 * quantidade;
		}
		else if (codigo == 2) {
			item = 4.50 * quantidade;
		}
		else if (codigo == 3) {
			item = 5.00 * quantidade;
		}
		else if (codigo == 4) {
			item = 2.00 * quantidade;
		}
		else {
			item = 1.50 * quantidade;
		}
		System.out.printf("Total: R$ %.2f", item);
		
		sc.close();		
	}

}
