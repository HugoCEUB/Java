package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ExerciciodeFixacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dolarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double bought = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(dolarPrice, bought);
		System.out.printf("Amount to be paid in reais = %.2f", result);
		
		sc.close();
	}
}
