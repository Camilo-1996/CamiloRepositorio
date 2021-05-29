package gestion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.MysqlDataSource;

import modelos.aerolinea;

public class AerolineasBBDD {
	private Statement st;
	private String databasename = "proyecto";
	private String serverTimeZone = "UTC";
	private String hostname = "localhost";
	private int port = 3306;
	private String user = "root";
	private String password = "Nohay2sin3";

	private Connection BBDDaero;

	public AerolineasBBDD() {
		try {
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setUseSSL(false); 
			dataSource.setServerTimezone(serverTimeZone);
			dataSource.setDatabaseName(databasename);
			dataSource.setPortNumber(port);
			dataSource.setUser(user);
			dataSource.setPassword(password);

			BBDDaero = dataSource.getConnection();
		} catch (Exception e) {
			System.out.println("error al conectarse a la Base de datos! " + e.getMessage());
		}
	}
//Metodo para obtener todas las aerolineas
	public List<aerolinea> TodasAerolineas() {
		List<aerolinea> lista = new ArrayList<aerolinea>();
		try {

			st = BBDDaero.createStatement();

			ResultSet rs = st.executeQuery("select* from aerolinea");
			while (rs.next()) {
				String ID = rs.getString("ID");
				String Nombre = rs.getString("Nombre");
				aerolinea ae = new aerolinea(ID, Nombre);
				lista.add(ae);
			}
			st.close();

		} catch (Exception e) {
			System.out.println("error al obtener todas las aerolineas");
		}
		return lista;

	}

	public aerolinea ObtenerporID(String ID) {
		try {
			st = BBDDaero.createStatement();

			ResultSet rs = st.executeQuery("select* from aerolinea where ID = '" + ID + "'");
			if (rs.next()) {
				String Id = rs.getString("ID");
				String Nombre = rs.getString("Nombre");
				aerolinea ae = new aerolinea(Id, Nombre);
				return ae;
			}
		} catch (Exception e) {
			System.out.println("No se pudo obrtener el id de la aerolinea " + e.getMessage());
		}
		return null;

	}

	public void ModificarNombreAerolinea(String ID, String Nombre) {
		try {
			st = BBDDaero.createStatement();

			st.execute("update aerolinea set Nombre = '" + Nombre + "' where ID = '" + ID + "'");

		} catch (Exception e) {
			System.out.println("error al nodificar el nombre de la aerolinea ");
		}
	}

	public void EliminarAerolinea(String ID) {

		try {
			st = BBDDaero.createStatement();

			st.execute("delete from aerolinea where ID = '" + ID + "'");

		} catch (Exception e) {
			System.out.println("error al eliminar la aerolinea ");
		}
	}

	public void InsertarAerlionea(aerolinea ae) {
		try {
			st = BBDDaero.createStatement();

			st.execute("insert into aerolinea values('" + ae.getId() + "','" + ae.getNombre() + "'");
		} catch (Exception e) {
			System.out.println("error a insertar la aerolinea");
		}
	}
}
