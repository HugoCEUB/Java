package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um n�mero: ");
		num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("N�O NEGATIVO");
		}
		else if (num < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("POSITIVO");
		}
		
		sc.close();
	}

}
