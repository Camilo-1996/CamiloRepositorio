package bd;

import java.sql.*;

//import com.mysql.cj.jdbc.MysqlDataSource;

public class AerolineBBDD {
	
	private static final String databasename = "proyecto_java";
	private static final String serverTimeZone = "UTC-8";
	private static final String hostname = "localhost";
	private static final int port = 3306;
	private static final String user = "root";
	private static final String password = "Nohay2sin3";
	
	/*public Connection conectarMySQL()throws SQLException{
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUseSSL(false);
		dataSource.setServerTimezone(serverTimeZone);
		dataSource.setDatabaseName(databasename);
		dataSource.setPortNumber(port);
		dataSource.setUser(user);
		dataSource.setPassword(password);
		return dataSource.getConnection();
	}*/

}
	
