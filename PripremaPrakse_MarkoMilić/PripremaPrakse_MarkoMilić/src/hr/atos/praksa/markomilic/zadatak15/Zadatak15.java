package hr.atos.praksa.markomilic.zadatak15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak15 {

	public Zadatak15() {

		Scanner userInput = new Scanner(System.in);
		int choice = 0;
		int role = 0;
		List<Artikl> listaArtikla = new ArrayList<Artikl>();
		List<Zaposlenik> listaZaposlenika = new ArrayList<Zaposlenik>();
		ArtiklService as = new ArtiklService();
		ZaposlenikService zs = new ZaposlenikService();
		Artikl noviArtikl = null;
		Zaposlenik noviZaposlenik = null;
		Connect.createTable(2);
		do {
			do {
				Menu.odaberiAutorizaciju();
				role = userInput.nextInt();
			} while (role != 1 && role != 2 && role != 3);

			switch (role) {

			case 1: {
				do {
					Menu.odaberiOpciju(role);
					choice = userInput.nextInt();
				} while (choice < 1 && choice > 8);

				switch (choice) {
				case 1: {
					Menu.izlistajArtikle(listaArtikla, as);
					break;
				}
				case 2: {
					Menu.izlistajZaposlenike(listaZaposlenika, zs);
					break;
				}
				case 3: {
					Menu.unesiArtikl(noviArtikl, as, userInput);
					break;
				}
				case 4: {
					Menu.unesiZaposlenika(noviZaposlenik, zs, userInput);;
					break;
				}
				case 5: {
					noviArtikl = Menu.napraviArtikl(userInput);
					as.update(noviArtikl);
					break;
				}
				case 6: {
					Menu.obrisiArtikl(listaArtikla, as, userInput);
					break;
				}
				case 7: {
					
					break;
				}
				case 8: {
					Menu.obrisiZaposlenika(listaZaposlenika, zs, userInput);
					break;
				}
				}

				break;
			}
			case 2: {
				do {
					Menu.odaberiOpciju(choice);
					choice = userInput.nextInt();
				} while (choice < 1 && choice > 4);
				switch (choice) {
				case 1: {
					Menu.izlistajArtikle(listaArtikla, as);
					break;
				}
				case 2: {
					Menu.izlistajZaposlenike(listaZaposlenika, zs);
					break;
				}
				case 3: {
					break;
				}
				case 4: {
					break;
				}
				}
				break;
			}
			case 3: {
				do {
					Menu.odaberiOpciju(choice);
					choice = userInput.nextInt();
				} while (choice != 1 && choice != 2);
				switch (choice) {
				case 1: {
					Menu.izlistajArtikle(listaArtikla, as);
					break;
				}
				case 2: {
					break;
				}
				}
				break;
			}
			}
			System.out.println("Zelite li nastaviti? 1 za da.");
			choice = userInput.nextInt();
		} while (choice == 1);
		userInput.close();

	}

	public static void main(String[] args) {

		new Zadatak15();

	}

}
