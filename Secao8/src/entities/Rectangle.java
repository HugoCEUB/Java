package entities;

public class Rectangle {

	public String name;
	public double width; // largura
	public double height; // altura

/*	
	public double area() {
		double a = width * height;
		return a;
	}
	
	public double perimeter() {
		double p = (width *2) + (height * 2);
		return p;
	}
	
	public double diagonal() {
		double d = Math.pow(width, 2) + Math.pow(height, 2);
		return Math.sqrt(d);
	}
*/
	
	public String toString() {
		return name
				+ String.format("AREA = %.2f%n", width * height)
				+ String.format("PERIMETER = %.2f%n", (width *2) + (height * 2))
				+ String.format("DIAGONAL = %.2f", Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)));
	}
}