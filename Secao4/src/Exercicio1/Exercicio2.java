package Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			Locale.setDefault(Locale.US);
			
			double pi = 3.14159;
			double raio;
			
			double area;
			
			raio = sc.nextDouble();
			
			area = (double) pi * Math.pow(raio, 2);
			
			System.out.printf("A= %.4f", area);
		}
	}
}
