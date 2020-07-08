package hr.atos.praksa.markomilic.zadatak08;

import javax.swing.JOptionPane;

public class Zadatak08 {

	public Zadatak08() {
		
		int month = Integer.parseInt(JOptionPane.showInputDialog("Unesite redni broj mjeseca u prijestupnoj godini"));
		char[] day = {'P', 'U', 'S', 'C', 'P', 'S', 'N'};
		
		if(month>12 || month<=0) {
			System.out.println("Greska!");
		}else if(month==2){
			for(int i=1;i<=7;i++) {
					System.out.printf("%3s", day[i-1]);
			}
			System.out.println();
			for(int j=1;j<=29;j++) {
				System.out.printf("%3d",j);
				if(j%7==0) {
					System.out.println();
				}
			}
		}else if(month%2!=0 && month<=7) {
			for(int i=1;i<=7;i++) {
				System.out.printf("%3s", day[i-1]);
			}
			System.out.println();
			for(int j=1;j<=31;j++) {
			System.out.printf("%3d",j);
				if(j%7==0) {
					System.out.println();
				}
			}
		}else if(month%2==0 && month!=2 && month<=7) {
			for(int i=1;i<=7;i++) {
				System.out.printf("%3s", day[i-1]);
			}
			System.out.println();
			for(int j=1;j<=30;j++) {
			System.out.printf("%3d",j);
				if(j%7==0) {
					System.out.println();
				}
			}
		}else if(month%2!=0 && month>=8) {
			for(int i=1;i<=7;i++) {
				System.out.printf("%3s", day[i-1]);
			}
			System.out.println();
			for(int j=1;j<=30;j++) {
			System.out.printf("%3d",j);
				if(j%7==0) {
					System.out.println();
				}
			}
		}else if(month%2==0 && month!=2 && month>=8) {
			for(int i=1;i<=7;i++) {
				System.out.printf("%3s", day[i-1]);
			}
			System.out.println();
			for(int j=1;j<=31;j++) {
			System.out.printf("%3d",j);
				if(j%7==0) {
					System.out.println();
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		new Zadatak08();

	}

}
