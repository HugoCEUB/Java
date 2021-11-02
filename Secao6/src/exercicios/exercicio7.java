package exercicios;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = 1; i <=x; i++) {
			System.out.printf("%d %d %.0f%n", i, i * i, Math.pow(i, 3));
		}
		sc.close();
	}
}
