package gestion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import agencia_proyecto.aerolineasBBDD;

public class BBDDtest {

	aerolineasBBDD con = new aerolineasBBDD();

	public void consultaBBDD() {
		try {
			Connection conn2 = con.conectarMySQL();
			Statement stmt = conn2.createStatement();
			String sqlQuery = "SELECT * from proyecto.aerolinea";
			ResultSet rs = stmt.executeQuery(sqlQuery);
			while (rs.next()) {
				String Nombre = rs.getString("Nombre");
				System.out.println("el nombre de la compañia es: " + Nombre);
			}
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void busqueda(String origen) {
		try {
			Connection conn2 = con.conectarMySQL();
			Statement stmt = conn2.createStatement();
			String sqlQuery = "SELECT  from ";
			ResultSet rs = stmt.executeQuery(sqlQuery);
			while (rs.next()) {
				String Nombre = rs.getString("Nombre");
				System.out.println("el nombre de la compañia es: " + Nombre);
			}
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
