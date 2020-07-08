package hr.atos.praksa.markomilic.zadatak15;

import java.util.List;

public interface Service<T> {

	public List<T> getAll();
	public void create(int role, Artikl artikl);
	public void update(int role, Artikl artikl);
	public void delete(int role, Artikl artikl);
	
}
