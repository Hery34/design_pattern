package fr.Doranco.dp.decorator;

public final class Regulateur extends Decorateur {

	public Regulateur(Voiture v) {
		
		if(!v.decorateurs.contains(Regulateur.class.getSimpleName())) {
		v.decorateurs.add(Regulateur.class.getSimpleName());
		super.libelle = v.libelle + " Régulateur";
		super.prix = v.prix + 200;
		super.poids = v.poids + 1;
		} else {
			super.libelle = v.libelle;
			super.prix = v.prix;
			super.poids = v.poids;
		}
		super.decorateurs = v.decorateurs;
		super.voiture = v;			
	}
	
}
