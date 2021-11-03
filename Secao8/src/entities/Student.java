package entities;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	public double aprovado() {
		double p = finalGrade();
			if (p < 60.00) {
				p = 60 - p;
				System.out.println("FAILED");
				System.out.printf("MISSING %.2f POINTS", p);
			} else {
				System.out.println("PASS");
			}

			// problema, o return se aplica a todos os casos
		return p;
	}
}
