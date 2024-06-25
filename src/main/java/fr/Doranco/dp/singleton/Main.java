package fr.Doranco.dp.singleton;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		
		try {
		// TODO Auto-generated method stub
		DataSourceSingleton ds1 = DataSourceSingleton.getInstance();	
		System.out.println(ds1);
		
		DataSourceSingleton ds2 = DataSourceSingleton.getInstance();	
		System.out.println(ds2);
		
		DataSourceSingleton ds3 = DataSourceSingleton.getInstance();	
		System.out.println(ds3);
		
		// on essaye de créer une nouvelle connexion, mais le abstract de getInstance nous oblige maintenant à passer par lui.
		Connection C1 = DataSourceSingleton.getInstance().getConnection();
		Connection C2 = DataSourceSingleton.getInstance().getConnection();
		
		System.out.println(C1);
		System.out.println(C2);
	}
		catch ( Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}		
}
