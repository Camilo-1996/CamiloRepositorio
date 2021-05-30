package gestion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.MysqlDataSource;

import modelos.Pais;

public class PaisesBBDD {

	private Statement st;
	private String databasename = "proyecto";
	private String serverTimeZone = "UTC";
	private String hostname = "localhost";
	private int port = 3306;
	private String user = "root";
	private String password = "Nohay2sin3";

	private Connection BBDDpais;

	public PaisesBBDD() {
		try {
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setUseSSL(false);
			dataSource.setServerTimezone(serverTimeZone);
			dataSource.setDatabaseName(databasename);
			dataSource.setPortNumber(port);
			dataSource.setUser(user);
			dataSource.setPassword(password);

			BBDDpais = dataSource.getConnection();
		} catch (Exception e) {
			System.out.println("error al conectarse a la Base de datos! " + e.getMessage());
		}

	}

	/**
	 * Método para obtener todos los países
	 * 
	 * @return
	 */
	public List<Pais> Todaspaises() {
		List<Pais> lista = new ArrayList<Pais>();
		try {

			st = BBDDpais.createStatement();

			ResultSet rs = st.executeQuery("select* from pais ");
			while (rs.next()) {
				String ID = rs.getString("ID");
				String Nombre = rs.getString("Nombre");
				String Continente = rs.getString("continente");
				Pais ps = new Pais(ID, Nombre, Continente);

				lista.add(ps);

			}
			st.close();

		} catch (Exception e) {
			System.out.println("error al obtener todas las aerolineas");
		}
		for (int i = 0; i < lista.size(); i++) {
			ObtenerCiudades(lista.get(i));
		}
		return lista;

	}

	/**
	 * Método para obtener todos las ciudades
	 * 
	 * @param pa
	 */
	public void ObtenerCiudades(Pais pa) {
		try {
			st = BBDDpais.createStatement();

			ResultSet rs = st.executeQuery("select* from ciudades where id_pais = '" + pa.getID() + "'");
			while (rs.next()) {
				pa.getCiudades().add(rs.getString("Nombre"));
			}
			st.close();
		} catch (Exception e) {
			System.out.println("no se puedo obtener la ciudades");
		}
	}

	/**
	 * Método que comprueba si la ciudad existe
	 * 
	 * @param Nombre
	 * @return
	 */
	public boolean ExisteCiudad(String Nombre) {
		try {
			st = BBDDpais.createStatement();

			ResultSet rs = st.executeQuery("select* from ciudades where nombre = '" + Nombre + "'");
			if (rs.next()) {
				return true;
			}
			st.close();
		} catch (Exception e) {
			System.out.println("no se puedo obtener la ciudades");
		}
		return false;
	}

	/**
	 * comprobar si el pais existe
	 * 
	 * @param pa (pais)
	 * @return }
	 */

	public boolean ExistePais(PaisesBBDD pa) {
		try {
			st = BBDDpais.createStatement();

			ResultSet rs = st.executeQuery("select* from pais where nombre = '" + pa + "'");
			if (rs.next()) {
				return true;
			}
			st.close();
		} catch (Exception e) {
			System.out.println("no se puedo obtener la pais");
		}
		return false;

	}
}
