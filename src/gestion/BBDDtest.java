package gestion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BBDDtest {


		aerolineasBBDD con = new  aerolineasBBDD();
		
		
public void consultaBBDD() {		
		try {
			Connection conn2 = con.conectarMySQL();
			Statement stmt = conn2.createStatement();
			String sqlQuery = "SELECT * from proyectoprogramacion.aerolinea";
			ResultSet rs = stmt.executeQuery(sqlQuery);
			while(rs.next()) {
				String Nombre = rs.getString("Nombre");
				System.out.println("el nombre de la compa�ia es: "+ Nombre);
			}
			rs.close();
			stmt.close();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


public void consultaParaHotel() {		
	try {
		Connection conn2 = con.conectarMySQL();
		Statement stmt = conn2.createStatement();
		String sqlQuery = "SELECT * from ";
		ResultSet rs = stmt.executeQuery(sqlQuery);
		while(rs.next()) {
			String Nombre = rs.getString("Nombre");
			System.out.println("el nombre de la compa�ia es: "+ Nombre);
		}
		rs.close();
		stmt.close();
	
	
	
		} catch (SQLException e) {
			e.printStackTrace();
}

}
}
