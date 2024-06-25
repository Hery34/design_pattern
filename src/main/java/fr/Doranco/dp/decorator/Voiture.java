package fr.Doranco.dp.decorator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Voiture {

	protected String libelle;
	protected int prix;
	protected int poids;
	protected Set<String> decorateurs = new HashSet<String>();
	@Override
	public String toString() {
		return "Voiture [libelle=" + libelle + ", prix=" + prix + ", poids=" + poids + ", decorateurs=" + decorateurs
				+ "]";
	}

	
	
	

	
	
}
