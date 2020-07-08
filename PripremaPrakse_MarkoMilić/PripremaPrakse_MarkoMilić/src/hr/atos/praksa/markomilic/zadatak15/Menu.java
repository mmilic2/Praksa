package hr.atos.praksa.markomilic.zadatak15;

public class Menu {

	static void odaberiAutorizaciju() {
		System.out.println("Odaberite autorizacijsku razinu:\n"
				+ "1.Admin:\n"
				+ "2.Superuser:\n"
				+ "3.User:\n");
	}
	static void odaberiOpciju(int choice) {
		String user = "Odaberite opciju:\n"
				+ "1.Izlistaj artikl:\n"
				+ "2.Izlistaj zaposlenike:\n";
		String superuser ="3.Kreiraj artikl:\n"
				+ "4.Kreiraj zaposlenika:\n";
		String admin ="5.Izmijeni artikl:\n"
				+ "6.Brisanje artikla:\n"
				+ "7.Izmijeni zaposlenika:\n"
				+ "6.Brisanje zaposlenika:\n";
		if(choice==1) System.out.println(user+superuser+admin);
		else if(choice==2)System.out.println(user+superuser);
		else System.out.println(user);
	}

	
}
