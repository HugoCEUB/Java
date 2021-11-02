package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double persentage;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	// classe não pode ser chamada por não ter retorno
	public void increaseSalary(double persentage) {
		grossSalary += grossSalary * persentage / 100.0;
	}
}