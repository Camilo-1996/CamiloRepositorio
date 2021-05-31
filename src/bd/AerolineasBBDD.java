package bd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.MysqlDataSource;

/**
 * Clase donde se hace la conexión con la Base de datos de aerolineas mediante
 * el conector JDBC
 */
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
	public List<Aerolinea> TodasAerolineas() {
		List<Aerolinea> lista = new ArrayList<Aerolinea>();
		try {

			st = BBDDaero.createStatement();

			ResultSet rs = st.executeQuery("select* from aerolinea");
			while (rs.next()) {
				String ID = rs.getString("ID");
				String Nombre = rs.getString("Nombre");
				Aerolinea ae = new Aerolinea(ID, Nombre);
				lista.add(ae);
			}
			st.close();

		} catch (Exception e) {
			System.out.println("error al obtener todas las aerolineas");
		}
		return lista;

	}

	/**
	 * Método que obtendrá el id de la aerolínea
	 * 
	 * @param ID
	 * @return
	 */
	public Aerolinea ObtenerporID(String ID) {
		try {
			st = BBDDaero.createStatement();

			ResultSet rs = st.executeQuery("select* from aerolinea where ID = '" + ID + "'");
			if (rs.next()) {
				String Id = rs.getString("ID");
				String Nombre = rs.getString("Nombre");
				Aerolinea ae = new Aerolinea(Id, Nombre);
				return ae;
			}
		} catch (Exception e) {
			System.out.println("No se pudo obrtener el id de la aerolinea " + e.getMessage());
		}
		return null;

	}

	/**
	 * Método que sirve para modificar la aerolínea
	 * 
	 * @param ID
	 * @param Nombre
	 */
	public void ModificarNombreAerolinea(String ID, String Nombre) {
		try {
			st = BBDDaero.createStatement();

			st.execute("update aerolinea set Nombre = '" + Nombre + "' where ID = '" + ID + "'");

		} catch (Exception e) {
			System.out.println("error al nodificar el nombre de la aerolinea ");
		}
	}

	/**
	 * Método que sirve para eliminar la aerolínea
	 * 
	 * @param ID
	 */
	public void EliminarAerolinea(String ID) {

		try {
			st = BBDDaero.createStatement();

			st.execute("delete from aerolinea where ID = '" + ID + "'");

		} catch (Exception e) {
			System.out.println("error al eliminar la aerolinea ");
		}
	}

	/**
	 * Método que sirve para insertar la aerolínea
	 * 
	 * @param ae
	 */
	public void InsertarAerlionea(Aerolinea ae) {
		try {
			st = BBDDaero.createStatement();

			st.execute("insert into aerolinea values('" + ae.getId() + "','" + ae.getNombre() + "'");
		} catch (Exception e) {
			System.out.println("error a insertar la aerolinea");
		}
	}

	/**
	 * Método que es obligado para que no de error en la clase
	 * 
	 * @return BBDDaero
	 */
	public Connection conectarMySQL() {
		// TODO Auto-generated method stub
		return BBDDaero;
	}
}
