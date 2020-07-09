package hr.atos.praksa.markomilic.zadatak15;

import java.util.List;
import java.util.Scanner;

public class Menu {

	static void odaberiAutorizaciju() {
		System.out.println("Odaberite autorizacijsku razinu:\n" + "1.Admin:\n" + "2.Superuser:\n" + "3.User:\n");
	}

	static void odaberiOpciju(int choice) {
		String user = "Odaberite opciju:\n" + "1.Izlistaj artikl:\n" + "2.Izlistaj zaposlenike:\n";
		String superuser = "3.Kreiraj artikl:\n" + "4.Kreiraj zaposlenika:\n";
		String admin = "5.Izmijeni artikl:\n" + "6.Brisanje artikla:\n" + "7.Izmijeni zaposlenika:\n"
				+ "8.Brisanje zaposlenika:\n";
		if (choice == 1)
			System.out.println(user + superuser + admin);
		else if (choice == 2)
			System.out.println(user + superuser);
		else
			System.out.println(user);
	}

	public static Artikl napraviArtikl(Scanner userInput) {
		Artikl privremeniArtikl = new Artikl();
		System.out.println("Unesi id artikla");
		privremeniArtikl.setId(userInput.nextInt());
		System.out.println("Unesi naziv artikla");
		privremeniArtikl.setNaziv(userInput.next());
		System.out.println("Unesi nabavnu kolicinu artikla");
		privremeniArtikl.setNabavnaKolicina(userInput.nextInt());
		System.out.println("Unesi nabavnu cijenu artikla");
		privremeniArtikl.setNabavnaCijena(userInput.nextDouble());
		System.out.println("Unesi strenutno stanje artikla");
		privremeniArtikl.setTrenutnoStanje(userInput.nextInt());
		System.out.println("Unesi prodajnu cijenu artikla");
		privremeniArtikl.setProdajnaCijena(userInput.nextDouble());
		return privremeniArtikl;
	}

	public static Zaposlenik napraviZaposlenika(Scanner userInput) {
		Zaposlenik privremeniZaposlenik = new Zaposlenik();
		System.out.println("Unesi id zaposlenika");
		privremeniZaposlenik.setId(userInput.nextInt());
		System.out.println("Unesi ime zaposlenika");
		privremeniZaposlenik.setIme(userInput.next());
		System.out.println("Unesi prazime zaposlenika");
		privremeniZaposlenik.setPrezime(userInput.next());
		System.out.println("Unesi radno mjesto zaposlenika");
		privremeniZaposlenik.setRadnoMjesto(userInput.next());
		System.out.println("Unesi oib zaposlenika(5 znakova)");
		privremeniZaposlenik.setOib(userInput.next());
		return privremeniZaposlenik;
	}

	public static void izlistajArtikle(List<Artikl> lista, ArtiklService as) {
		lista = as.getAll();
		for (Artikl ar : lista) {
			System.out.println(ar.getId()+ " " + ar.getNaziv());
		}
	}

	public static void izlistajZaposlenike(List<Zaposlenik> lista, ZaposlenikService zs) {
		lista = zs.getAll();
		for (Zaposlenik ar : lista) {
			System.out.println(ar.getId() + " " +ar.getIme());
		}
	}

	public static void unesiArtikl(Artikl a, ArtiklService as, Scanner userInput) {
		a = Menu.napraviArtikl(userInput);
		as.create(a);
	}

	public static void unesiZaposlenika(Zaposlenik z, ZaposlenikService zs, Scanner userInput) {
		z = Menu.napraviZaposlenika(userInput);
		zs.create(z);
	}
	
	public static void obrisiArtikl(List<Artikl> lista, ArtiklService as, Scanner userInput) {
		int obrisiId = 0;
		izlistajArtikle(lista, as);
		System.out.println("Unesi id artikla koji zelis obrisati.");
		obrisiId = userInput.nextInt();
		as.delete(obrisiId);
		
	}
	
	public static void obrisiZaposlenika(List<Zaposlenik> lista, ZaposlenikService zs, Scanner userInput) {
		int obrisiId = 0;
		izlistajZaposlenike(lista, zs);
		System.out.println("Unesi id zaposlenika kojeg zelis obrisati.");
		obrisiId = userInput.nextInt();
		zs.delete(obrisiId);
	}

}
