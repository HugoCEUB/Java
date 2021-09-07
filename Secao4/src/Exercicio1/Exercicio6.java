package Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Locale.setDefault(Locale.US);
			
			double x, y, z;
			double triangulo, circulo, trapezio, quadrado, retangulo;
			
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			
			triangulo = (x * z) / 2;
			circulo = 3.14159 * Math.pow(z, 2.0);;
			trapezio = ((x + y) * z) / 2;
			quadrado = y * 4;
			retangulo = x * y;
			
			System.out.printf("TRIANGULO: %.3f%n", triangulo);
			System.out.printf("CIRCULO: %.3f%n", circulo);
			System.out.printf("TRAPEZIO: %.3f%n", trapezio);
			System.out.printf("QUADRADO: %.3f%n", quadrado);
			System.out.printf("RETANGULO: %.3f%n", retangulo);
			
		}
	}
}
