package hr.atos.praksa.markomilic.zadatak15;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak15 {

	
	public Zadatak15() {
		
		Scanner userInput = new Scanner(System.in);
		int choice = 0;
		int role = 0;
		do {
			do {
				Menu.odaberiAutorizaciju();
				role = userInput.nextInt();
			}while(role != 1 && role != 2 && role != 3);
			
			switch(role) {
				
				case 1:{
					do {
						Menu.odaberiOpciju(choice);
						choice = userInput.nextInt();
					}while(choice < 1 && choice > 8);
					
					switch(choice) {
					case 1:{
						break;
					}
					case 2:{
						break;
					}
					case 3:{
						Artikl noviArtikl = new Artikl(1,"cokolada",5,5,5.0,5.0);
						ArtiklService as = new ArtiklService();
						List<Artikl> lista= new ArrayList<Artikl>();
						as.createTable();
						as.create(role, noviArtikl);
						lista = as.getAll();
						for (Artikl artikl : lista) {
							System.out.println(artikl.getNaziv());
						}
						break;
					}
					case 4:{
						break;
					}
					case 5:{
						break;
					}
					case 6:{
						break;
					}
					case 7:{
						break;
					}
					case 8:{
						break;
					}
					}
					
					break;
				}
				case 2:{
					do {
						Menu.odaberiOpciju(choice);
						choice = userInput.nextInt();
					}while(choice < 1 && choice > 4);
					switch(choice) {
					case 1:{
						break;
					}
					case 2:{
						break;
					}
					case 3:{
						break;
					}
					case 4:{
						break;
					}
					}
					break;
				}
				case 3:{
					do {
						Menu.odaberiOpciju(choice);
						choice = userInput.nextInt();
					}while(choice != 1 && choice != 2);
					switch(choice) {
					case 1:{
						break;
					}
					case 2:{
						break;
					}
					}
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
