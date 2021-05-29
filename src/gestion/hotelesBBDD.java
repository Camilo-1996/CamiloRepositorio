package gestion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.MysqlDataSource;

import modelos.hotel;

public class hotelesBBDD {
	private Statement st;
	private String databasename = "proyecto";
	private String serverTimeZone = "UTC";
	private String hostname = "localhost";
	private int port = 3306;
	private String user = "root";
	private String password = "Nohay2sin3";

	private Connection BBDDhotel;

	public  hotelesBBDD() {
		try {
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setUseSSL(false);
			dataSource.setServerTimezone(serverTimeZone);
			dataSource.setDatabaseName(databasename);
			dataSource.setPortNumber(port);
			dataSource.setUser(user);
			dataSource.setPassword(password);
			
			BBDDhotel = dataSource.getConnection();
	
		} catch (Exception e) {
			System.out.println("error al conectarse a la Base de datos");
		}

	public List<hotel> TodosHoteles() {
		List<hotel> lista = new ArrayList<hotel>();
		try {
			st = BBDDhotel.createStatement();

			ResultSet rs = st.executeQuery("select * from hoteles");
			while (rs.next()) {
				String direccion = rs.getString("direccion");
				String Nombre = rs.getString("Nombre");
				int estrellas = rs.getInt(0);
				hotel ht = new hotel(direccion, Nombre, estrellas);
				lista.add(ht);
			}
			st.close();
		} catch (Exception e) {
			System.out.println("error al obtener todos loshoteles");
		}
		return lista;
	}

	public hotel ObtenerPorEstrellas(int estrellas) {
		try {
			st = BBDDhotel.createStatement();

			ResultSet rs = st.executeQuery("select * from hoteles where estrellas= '" + estrellas + "'");
			if (rs.next()) {
				String direccion = rs.getString("direccion");
				String Nombre = rs.getString("Nombre");
				int estrella = rs.getInt(0);
				hotel ht = new hotel(direccion, Nombre, estrella);
				return ht;
			}
		} catch (Exception e) {
			System.out.println("No se pudo obtener el numero de estrellas " + e.getMessage());
		}
		return null;
	}

	public void ModificarNombreHotel(String direccion, String Nombre) {
		try {
			st = BBDDhotel.createStatement();

			st.execute("update hotel set nombre= '" + Nombre + "'where direccion= '" + direccion + "'");
		} catch (Exception e) {
			System.out.println("error al modificar el nombre ");
		}
	}

	public void EliminarHotel(String direccion) {
		try {
			st = BBDDhotel.createStatement();
		} catch (Exception e) {
			System.out.println("error al eliminar el hotel");

		}
	}

	public void InsertarHotel(hotel ht) {
		try {
			st = BBDDhotel.createStatement();

			st.execute("INSERT INTO hotel values('" + ht.getDireccion() + "'" + ht.getNombre() + "'" + ht.getEstrellas()
					+ "'");
		} catch (Exception e) {
			System.out.println("error al insertar el hotel");
		}
	}
}
