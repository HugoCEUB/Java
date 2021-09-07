package Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Locale.setDefault(Locale.US);
		
			int A, B, C, D;
			int dif;
			
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			D = sc.nextInt();
			
			dif = (A * B - C * D);
			
			System.out.println(dif);
		}

	}

}
