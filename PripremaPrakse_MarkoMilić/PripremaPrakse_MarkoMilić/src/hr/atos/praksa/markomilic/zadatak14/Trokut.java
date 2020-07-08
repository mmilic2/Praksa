package hr.atos.praksa.markomilic.zadatak14;

public class Trokut extends Rezultat{

	private double firstSide;
	private double secondSide;
	private double thirdSide;
	
	public Trokut() {
		this.firstSide = 0;
		this.secondSide = 0;
		this.thirdSide = 0;
	}

	public Trokut(double firstSide, double secondSide, double thirdSide) {
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
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

	public double getThirdSide() {
		return thirdSide;
	}

	public void setThirdSide(double thirdSide) {
		this.thirdSide = thirdSide;
	}

	
	
	
}
