package fr.Doranco.dp.decorator;

public final class GPS extends Decorateur {

	public GPS(Voiture v) {
		if(!v.decorateurs.contains(GPS.class.getSimpleName())) {
			v.decorateurs.add(GPS.class.getSimpleName());
		super.voiture = v;
		super.libelle = v.libelle + " GPS";
		super.prix = v.prix + 1000;
		poids = v.poids + 20;
		}else
		{
			super.libelle = v.libelle;
			super.prix = v.prix;
			poids = v.poids;	
		}
		super.decorateurs = v.decorateurs;
		super.voiture = v;
	}
	

}
