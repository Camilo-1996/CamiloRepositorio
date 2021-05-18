import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BBDDtest {

	public static void main(String[] args) {
		ConexionMySQL con = new ConexionMySQL();
		try {
			Connection conn2 = con.conectarMySQL();
			Statement stmt = conn2.createStatement();
			String sqlQuery = "SELECT * from proyectoprogramacion.aerolinea";
			ResultSet rs = stmt.executeQuery(sqlQuery);
			while(rs.next()) {
				String Nombre = rs.getString("Nombre");
				String sede = rs.getString("sede");
				System.out.println("el nombre de la compañia es: "+ Nombre +  "\n su sede esta en : "+sede);
			}
			rs.close();
			stmt.close();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
