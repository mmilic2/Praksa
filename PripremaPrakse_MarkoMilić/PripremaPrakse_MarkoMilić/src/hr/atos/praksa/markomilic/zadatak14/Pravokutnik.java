package hr.atos.praksa.markomilic.zadatak14;

public class Pravokutnik extends Rezultat{

	private double firstSide;
	private double secondSide;
	
	public Pravokutnik() {
		this.setFirstSide(0);
		this.setSecondSide(0);
	}
	
	public Pravokutnik(double firstSide, double secondSide) {
		this.setFirstSide(firstSide);
		this.setSecondSide(secondSide);
	}

	public double getFirstSide() {
		return firstSide;
	}

	public void setFirstSide(double firstSide) {
		this.firstSide = firstSide;
	}

	public double getSecondSide() {
		return secondSide;
	}

	public void setSecondSide(double secondSide) {
		this.secondSide = secondSide;
	}
}
