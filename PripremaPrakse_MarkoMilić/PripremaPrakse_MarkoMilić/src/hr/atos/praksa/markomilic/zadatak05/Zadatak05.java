package hr.atos.praksa.markomilic.zadatak05;

import javax.swing.JOptionPane;

public class Zadatak05 {

	public Zadatak05() {
		
		int counter = 0;
		int pocetakIntervala = Integer.parseInt(JOptionPane.showInputDialog("Pocetak intervala"));
		int krajIntervala = Integer.parseInt(JOptionPane.showInputDialog("Kraj intervala"));
		if(pocetakIntervala>10 && krajIntervala<100) {
			System.out.println("Pogreska. Pocetak i kraj intervala nisu ispravno definirani");
		}else {
			for(int i=pocetakIntervala;i<krajIntervala+1;i++) {
				if(i<=15) {
					counter += 5;
					System.out.println(counter);
				}
				if(i>15 && i<20) {
					counter--;
					System.out.println(counter);
				}
				if(i%20 == 0) {
					continue;
				}
				if(i==75) {
					System.out.println("Vrijednost brojača: " + counter);
				}
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new Zadatak05();

	}

}
