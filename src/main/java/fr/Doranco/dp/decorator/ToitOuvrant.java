package fr.Doranco.dp.decorator;

public final class ToitOuvrant extends Decorateur implements Option  {
	


public ToitOuvrant(Voiture v) {
	if(!v.decorateurs.contains(ToitOuvrant.class.getSimpleName())) {
	v.decorateurs.add(ToitOuvrant.class.getSimpleName());
		super.libelle = v.libelle + " Toit Ouvrant";
		super.prix = v.prix + 2000;
		super.poids = v.poids + 15;
	}else {
		super.libelle = v.libelle;
		super.prix = v.prix;
		super.poids = v.poids;
	}
	super.decorateurs = v.decorateurs;
	super.voiture = v;
	}
	
}

