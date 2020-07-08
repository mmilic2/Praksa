package hr.atos.praksa.markomilic.zadatak14;

public class Krug extends Rezultat{

	private double radius;
	
	public Krug() {
		this.setRadius(0);
	}

	public Krug(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
