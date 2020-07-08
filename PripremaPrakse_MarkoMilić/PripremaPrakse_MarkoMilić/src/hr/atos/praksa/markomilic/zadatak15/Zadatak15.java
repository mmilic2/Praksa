package hr.atos.praksa.markomilic.zadatak15;


import java.util.Scanner;

public class Zadatak15 {

	
	public Zadatak15() {
		
		Scanner userInput = new Scanner(System.in);
		int choice = 0;
		do {
			do {
				System.out.println("Odaberite autorizacijsku razinu:\n"
						+ "1.Admin:\n"
						+ "2.Superuser:\n"
						+ "3.User:\n");
				choice = userInput.nextInt();
			}while(choice != 1 && choice != 2 && choice != 3);
			
			switch(choice) {
				
				case 1:{
					do {
						System.out.println("Odaberite opciju:\n"
								+ "1.Kreiraj artikl:\n"
								+ "2.Izlistaj artikl:\n"
								+ "3.Izmijeni artikl:\n"
								+ "4.Brisanje artikla:\n"
								+ "5.Kreiraj zaposlenika:\n"
								+ "6.Brisanje zaposlenika:\n"
								+ "7.Izmijeni zaposlenika:\n"
								+ "8.Izlistaj zaposlenike:\n");
						choice = userInput.nextInt();
					}while(choice < 1 && choice > 8);
					
					break;
				}
				case 2:{
					do {
						System.out.println("Odaberite opciju:\n"
								+ "1.Kreiraj artikl:\n"
								+ "2.Izlistaj artikl:\n"
								+ "3.Kreiraj zaposlenika:\n"
								+ "4.Izlistaj zaposlenike:\n");
						choice = userInput.nextInt();
					}while(choice < 1 && choice > 4);
					
					break;
				}
				case 3:{
					do {
						System.out.println("Odaberite opciju:\n"
								+ "1.Izlistaj artikl:\n"
								+ "2.Izlistaj zaposlenike:\n");
						choice = userInput.nextInt();
					}while(choice != 1 && choice != 2);
					
					break;
				}
			}
			System.out.println("Zelite li nastaviti? 1 za da.");
			choice = userInput.nextInt();
		}while(choice ==1);
		userInput.close();

	}
	
	public static void main(String[] args) {

		new Zadatak15();

	}

}
