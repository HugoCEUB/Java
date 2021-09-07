package Exercicio1;

import java.util.Scanner;

public class Exercecio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = A + B;
		
		System.out.printf("SOMA = %.2f", C);
		
	}
}
