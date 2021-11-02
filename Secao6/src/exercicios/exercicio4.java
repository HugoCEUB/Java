package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double resultado = 0;
		
		for(int i = 0; i < x; i++) {
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			
			if (z == 0) {
				System.out.println("Divisão impossivel");
			} else {
				resultado = y / z;
				System.out.printf("%.1f%n",resultado);
			}
		}
		sc.close();
	}

}
