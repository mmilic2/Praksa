package hr.atos.praksa.markomilic.zadatak06;

import javax.swing.JOptionPane;

public class Zadatak06 {

	
	public Zadatak06() {
		
		String ime = JOptionPane.showInputDialog("Unesi ime:");
		
		for(int i=0;i<31;i++) {
			System.out.print("-");
		}
		System.out.println();
		
		System.out.println(": : : TABLICA MNOZENJA : : :");
		for(int i=0;i<31;i++) {
			System.out.print("-");
		}
		System.out.println();
		
		System.out.print(" * |  ");
		for(int i=1;i<10;i++) {
			System.out.print(i +"  ");
		}
		System.out.println();
		
		for(int i=0;i<31;i++) {
			System.out.print("-");
		}
		System.out.println();
		
		for(int i=1;i<10;i++) {
			System.out.print(" "+ i + " |");
			for(int j=1;j<10;j++) {
				System.out.printf("%3d",i*j);
			}
			System.out.println();
		}
		
		for(int i=0;i<31;i++) {
			System.out.print("-");
		}
		System.out.println();
		
		
		
		String potpis =    ":  :  :  :  :  :  :  :  :  :  :";
        System.out.println(potpis.substring(0, 31-ime.length()) + ime);
	}
	
	
	public static void main(String[] args) {
		new Zadatak06();

	}

}
