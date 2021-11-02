package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
// variáveis	
		Employee employee = new Employee();
// entrada 1
		System.out.print("Nome: ");
		employee.name = sc.next();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
// processamento
		// feito na Classe Employee.java, pacote entities.
// saída 1
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n%n", employee.name, employee.netSalary());
// entrada 2
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble(); // declarou a varável e deu um valor
		employee.increaseSalary(percentage); // mandou o valor digitado para a classe
// saída 2
		System.out.println();
		System.out.printf("Updated data: %s, $ %.2f", employee.name, employee.netSalary());
		sc.close();
	}
}
