package exercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();
	}
}
/*
 		for(int i = 0; i <= x; i++) {
			if (x == 0) {
				System.out.println("1");
			} else {
				x = x * (x-1);

			}
		}
*/