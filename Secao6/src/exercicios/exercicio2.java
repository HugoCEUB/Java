package exercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int in = 0, out = 0;
		
		for (int i = 0; i < x; i++) {
			int z = sc.nextInt();
			if (z >= 10 && z <= 20) {
				in += 1;
			} else {
				out +=1;
			}
		}
		System.out.printf("%d in%n", in);
		System.out.printf("%d out", out);
		sc.close();
	}
}