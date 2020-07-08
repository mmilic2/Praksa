package hr.atos.praksa.markomilic.zadatak14;

public class Rezultat implements Dijagonala{

	private double area;
	private double perimiter;
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimiter() {
		return perimiter;
	}
	public void setPerimiter(double perimiter) {
		this.perimiter = perimiter;
	}
	public void calculateCircle(double radius) {
		this.perimiter = 2 * Math.PI * radius;
		this.area =Math.PI * radius * radius;
	}
	public void calculateRectangle(double firstSide,double secondSide) {
		this.perimiter = 2 * (firstSide + secondSide);
		this.area = firstSide * secondSide;
	}
	public void calculateSquare(double side) {
		this.perimiter = 4 * side;
		this.area = side * side;
	}
	public void calculateTriangle(double firstSide,double secondSide,double thirdSide) {
		double temp = (firstSide + secondSide + thirdSide) * 
				(-firstSide + secondSide + thirdSide) * 
				(firstSide - secondSide + thirdSide) * 
				(firstSide + secondSide - thirdSide);
		this.perimiter = firstSide + secondSide + thirdSide;
		this.area = 0.25 * Math.sqrt(temp);
	}
	public void printResult(double area,double perimiter) {
		System.out.printf("Povrsina je %.2f, a opseg je %.2f.",area,perimiter);
	}

	public void getDiagonal(double firstSide,double secondSide) {
		System.out.printf("Diagonala iznosi %.2f.", Math.sqrt(firstSide * firstSide + secondSide * secondSide));
	}

	
	
}
