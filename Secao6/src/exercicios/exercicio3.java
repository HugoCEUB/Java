package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		
		for (int i = 0; i < x; i++) {
			double z = sc.nextDouble();
			double y = sc.nextDouble();
			double w = sc.nextDouble();

			double media = ((z * 2) + (y * 3) + (w * 5)) / 10;
			
			System.out.printf("%.1f%n", media);
		}		
		sc.close();
	}
}
