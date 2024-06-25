package fr.Doranco.dp.singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSourceSingleton {
	
	private static DataSourceSingleton instance;
	
	private DataSourceSingleton() {
		
	}
	
	
	public Connection getConnection() throws Exception {
		String user = "root";
		String password = "Orbell@1992";
		String url = "jdbc:mysql://127.0.0.1:3307/users_db";
		String driver = "com.mysql.cj.jdbc.Driver";
Class.forName(driver);
		
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}

	// le mot clé synchronized met en place le multithread en mettant en place une liste d'attente
	public static synchronized  DataSourceSingleton getInstance() {
		if (instance == null) {
			instance = new DataSourceSingleton ();
		}
		
		return instance;
	}
	
}
