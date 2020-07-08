package hr.atos.praksa.markomilic.zadatak14;

public class Kvadrat extends Rezultat{

	private double side;
	
	public Kvadrat() {
		this.setSide(0);
	}
	
	public Kvadrat(double side) {
		this.setSide(side);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	
	
}
