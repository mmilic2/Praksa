package hr.atos.praksa.markomilic.zadatak15;

public class Zaposlenik {

	private int id;
	private String ime;
	private String prezime;
	private String radnoMjesto;
	private String oib;
	
	
	public Zaposlenik(String ime, String prezime, String radnoMjesto, String oib) {
		this.ime = ime;
		this.prezime = prezime;
		this.radnoMjesto = radnoMjesto;
		this.oib = oib;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getRadnoMjesto() {
		return radnoMjesto;
	}
	public void setRadnoMjesto(String radnoMjesto) {
		this.radnoMjesto = radnoMjesto;
	}
	public String getOib() {
		return oib;
	}
	public void setOib(String oib) {
		this.oib = oib;
	}
	
	
	
}
