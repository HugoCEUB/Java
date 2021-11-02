package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicial;
		int horaFinal;
		int duracao;
		
		System.out.println("Hora inicial: ");
		horaInicial = sc.nextInt();
		System.out.println("Hora final: ");
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaInicial - horaFinal;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.println("O jogo durou " + duracao + "Horas");
		sc.close();
	}
}
