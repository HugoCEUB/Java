package Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Locale.setDefault(Locale.US);
			
			int num, hora;
			double renda, total;
			
			num = sc.nextInt();
			hora = sc.nextInt();
			renda = sc.nextDouble();
			
			total = hora * renda;
			
			System.out.println("NUMBER = " + num);
			System.out.printf("SALARY = U$ %.2f", total);
			
		}
	}
}
