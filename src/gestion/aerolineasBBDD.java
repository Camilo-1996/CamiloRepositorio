package agencia_proyecto;

import java.sql.Connection;
import java.sql.SQLException;

public class aerolineasBBDD {
	private static final String databasename = "proyecto_java";
	private static final String serverTimeZone = "UTC";
	private static final String hostname = "localhost";
	private static final int port = 3306;
	private static final String user = "root";
	private static final String password = "Nohay2sin3";
	
	public Connection conectarMySQL()throws SQLException{
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUseSSL(false);
		dataSource.setServerTime(serverTimeZone);
		dataSource.setDatabaseName(databasename);
		dataSource.setPortNumber(port);
		dataSource.setUser(user);
		dataSource.setPassword(password);
		return dataSource.getConnection;
		
	}

}
