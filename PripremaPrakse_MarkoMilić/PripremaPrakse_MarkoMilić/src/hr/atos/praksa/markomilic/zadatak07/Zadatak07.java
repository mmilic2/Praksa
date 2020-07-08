package hr.atos.praksa.markomilic.zadatak07;

import javax.swing.JOptionPane;

public class Zadatak07 {

	public Zadatak07() {
		
		int firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi prirodni broj"));
		int secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi prirodni broj"));
		int counter = 0;
		for(int i=firstNumber;i<secondNumber+1;i++) {
			if(i%7 == 0) {
				counter++;
			}
		}
		System.out.println("U zadanom intervalu brojeva djeljivih sa 7 ima: " + counter);
		
		
	}
	
	public static void main(String[] args) {
		new Zadatak07();

	}

}
