package hr.atos.praksa.markomilic.zadatak09;

import javax.swing.JOptionPane;

public class Zadatak09 {

	public Zadatak09() {
		
		String[][] matrix = new String[7][13];
		int[] monthsPay = new int[13];
		
		int pay = 0;
		int maxPay = 5000;
		int firstMonth = 1;
		
		for(int i=1;i<monthsPay.length;i++) {
			pay = Integer.parseInt(JOptionPane.showInputDialog("Unesite placu za " +i+ ". mjesec:"));
			monthsPay[i]=pay;
		}
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]="";
				
				if(j==0 && i<=6 || j!=0 && i<=6 || i<=7) {
					//lijeva
					if(j==0 && i<6) {
						if(maxPay!=0) {
							matrix[i][0]=Integer.toString(maxPay);
							System.out.print(matrix[i][0]+"kn - |");
							maxPay-=1000;
						}else if(maxPay==0) {
							matrix[i][j]="0";
							System.out.printf("%4skn - |",matrix[i][j]);
							
						}
					}
					//dodavanje X
					if(monthsPay[j]<5001 && monthsPay[j]>4500 ) {
						//placa=5000;
						matrix[0][j]="x";
						//5000 - 0
					}
					if(monthsPay[j]<4501 && monthsPay[j]>3500) {
						matrix[1][j]="x";
						//4000 - 1
					} 
					if(monthsPay[j]<3501 && monthsPay[j]>2500) {
						matrix[2][j]="x";
						//3000 - 2
					}
					if(monthsPay[j]<2501 && monthsPay[j]>1500) {
						matrix[3][j]="x";
						//2000 - 3
					}
					if(monthsPay[j]<1501 && monthsPay[j]>500) {
						matrix[4][j]="x";
						//1000 - 4
					}
					if(monthsPay[j]<501 && monthsPay[j]>0) {
						matrix[5][j]="x";
						//0  - 5
					}
					//sredina
					if(j!=0 && i<6) {
						System.out.printf("%2s ",matrix[i][j]);
						if(i<5 && j==12) {
							System.out.println();
							System.out.println("         |");
						}
					}
					//lijevo dolje
					if(j==0 && i==6) {
						matrix[i][j]="";
						System.out.printf("\n%10s",matrix[i][j]);
					}
					//dolje od sredine
					if(j!=0 && i==6 || i==7) {
						if(j!=0 && i==6) {
							matrix[i][j]="-- ";
							System.out.print(matrix[i][j]);
							if(j==12) {
								System.out.println();
								matrix[i][j]="";
								System.out.printf("%10s",matrix[i][j]);
							}
						}else if(j!=0 && i==7) {
							matrix[i][j]=Integer.toString(firstMonth);
							System.out.printf("%2s ",matrix[i][j]);
							firstMonth++;
						}
					}
				}
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new Zadatak09();

	}

}
