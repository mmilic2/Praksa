package hr.atos.praksa.markomilic.zadatak15;



public class Artikl {
	
	private int id;
	private String naziv;
	private Integer nabavnaKolicina;
	private Integer trenutnoStanje;
	private Double nabavnaCijena;
	private Double prodajnaCijena;
	
	
	
	public Artikl(String naziv, Integer nabavnaKolicina, Integer trenutnoStanje, Double nabavnaCijena,
			Double prodajnaCijena) {
		this.naziv = naziv;
		this.nabavnaKolicina = nabavnaKolicina;
		this.trenutnoStanje = trenutnoStanje;
		this.nabavnaCijena = nabavnaCijena;
		this.prodajnaCijena = prodajnaCijena;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Integer getNabavnaKolicina() {
		return nabavnaKolicina;
	}
	public void setNabavnaKolicina(Integer nabavnaKolicina) {
		this.nabavnaKolicina = nabavnaKolicina;
	}
	public Integer getTrenutnoStanje() {
		return trenutnoStanje;
	}
	public void setTrenutnoStanje(Integer trenutnoStanje) {
		this.trenutnoStanje = trenutnoStanje;
	}
	public Double getNabavnaCijena() {
		return nabavnaCijena;
	}
	public void setNabavnaCijena(Double nabavnaCijena) {
		this.nabavnaCijena = nabavnaCijena;
	}
	public Double getProdajnaCijena() {
		return prodajnaCijena;
	}
	public void setProdajnaCijena(Double prodajnaCijena) {
		this.prodajnaCijena = prodajnaCijena;
	}
	
	
}
