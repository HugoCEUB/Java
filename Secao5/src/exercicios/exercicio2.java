package exercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Digite um n�mero para saber se � impar ou par: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		sc.close();
	}

}
