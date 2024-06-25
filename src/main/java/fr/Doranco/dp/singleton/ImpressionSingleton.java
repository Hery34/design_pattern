package fr.Doranco.dp.singleton;

public class ImpressionSingleton {
	
	private static ImpressionSingleton instance ;
	
	// le mot clé synchronized met en place le multithread en mettant en place une liste d'attente
	public static synchronized ImpressionSingleton getInstance() {
		
		if (instance == null) {
			instance = new ImpressionSingleton();
			
		}
		System.out.println("Impression en cours");
		return instance;
	}

	private ImpressionSingleton() {
				
	}
	
	public void print() {
		
		System.out.println("Impression en cours");
	}
	
	

}
