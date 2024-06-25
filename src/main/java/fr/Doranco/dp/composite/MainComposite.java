package fr.Doranco.dp.composite;

public class MainComposite {

	public static void main(String[] args) {
		Remorque maRemorque = new Remorque(11);
		Remorque maRemorque2 = new Remorque(11);
		Remorque maRemorque3 = new Remorque(11);
		System.out.println("Le poids de ma remorque est :  " + maRemorque.getPoids() + " Tonnes");
		
		Tracteur monTracteur = new Tracteur(8);
				Tracteur monTracteur2 = new Tracteur(10);
		
		System.out.println("Le poids de mon tracteur est :  " + monTracteur.getPoids() + " Tonnes");
		
		CamionComposite semiRemorque = new CamionComposite();
		
		semiRemorque.add(maRemorque);
		semiRemorque.add(monTracteur);
		//semiRemorque.add(monTracteur2);
		semiRemorque.add(maRemorque2);
		//semiRemorque.add(maRemorque3);
		
		System.out.println("Le poids de mon semi-Remorque est :  " + semiRemorque.getPoids() + " Tonnes");
	}

}
