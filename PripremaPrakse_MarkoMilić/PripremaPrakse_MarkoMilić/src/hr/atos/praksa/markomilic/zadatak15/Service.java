package hr.atos.praksa.markomilic.zadatak15;

import java.sql.Connection;
import java.util.List;

public interface Service<T> {

	public List<T> getAll();

	public void create(T myObject, Connection conn);

	public void update(T myObject);

	public void delete(int id);

}
