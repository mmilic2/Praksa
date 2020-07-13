package hr.atos.praksa.markomilic.zadatak15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		String dodatnaDva = "9. Izlistaj broj zaposlenika po radnom mjestu:\n"
				+ "10. Izlistaj ukupni profit za artikle";
		if (choice == 1) {
			System.out.println(user + superuser + admin + dodatnaDva);
		}
		else if (choice == 2) {
			System.out.println(user + superuser + dodatnaDva);
		}
		else {
			System.out.println(user);
		}
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

	public static void izmjeniZaposlenika(List<Zaposlenik>list ,Zaposlenik z, ZaposlenikService zs,Scanner userInput) {
		izlistajZaposlenike(list,zs);
		z=napraviZaposlenika(userInput);
		zs.update(z);
	}

	public static void izmjeniArtikl(List<Artikl>lista, Artikl a,ArtiklService as,Scanner userInput) {
		Menu.izlistajArtikle(lista,as);
		a=Menu.napraviArtikl(userInput);
		as.update(a);
		System.out.println("Artikl izmjenjen");
	}

	public static void izlistajPoRadnomMjestu() {
		
		String sql = "SELECT radnomjesto, count(oib) from zaposlenik group by radnomjesto";
		Connection conn = Connect.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("count(oib)") +" "+ rs.getString("radnomjesto"));
				
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public static void izracunajProfit(List<Artikl>lista,ArtiklService as) {
		lista=as.getAll();
		double ukupniProfit = 0;
		double profitPoArtiklu = 0;
		int prodanaKolicina = 0;
		for(Artikl ar:lista) {
			prodanaKolicina = ar.getNabavnaKolicina()-ar.getTrenutnoStanje();
			profitPoArtiklu = prodanaKolicina*ar.getProdajnaCijena()-prodanaKolicina*ar.getNabavnaCijena();
			ukupniProfit += profitPoArtiklu;
		}
		System.out.println("Ukupni profit iznosi: "+ ukupniProfit);
		
	}

	
	
}
