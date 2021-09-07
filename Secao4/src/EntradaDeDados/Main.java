package EntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		String x;
		int y;
		double z;
		char w;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		w = sc.next().charAt(0);
		
		System.out.println("Voce digitou: " + x);
		System.out.println("Voce digitou: " + y);
		System.out.println("Voce digitou: " + z);
		System.out.println("Voce digitou: " + w);
		
		sc.close();

	}

}
