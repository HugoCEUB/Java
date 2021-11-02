package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double intervalo;
		
		intervalo = sc.nextDouble();
		
		if (intervalo >= 00.25 || intervalo <= 25.50) {
			System.out.println("Intervalo 0,25");
		}
		else if (intervalo >= 25.50 || intervalo <= 50.75) {
			System.out.println("Intervalo 25,50");
		}
		else if (intervalo >= 50.75 || intervalo <= 100.00) {
			System.out.println("intervalo 75,100");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		sc.close();
	}
}
