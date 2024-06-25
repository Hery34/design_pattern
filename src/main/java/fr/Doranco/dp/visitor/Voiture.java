package fr.Doranco.dp.visitor;

import java.util.ArrayList;

public class Voiture {

	ArrayList<IElementVoiture> elements;
	
	
	public Voiture() {
		this.elements = new ArrayList<IElementVoiture>();
		  this.elements.add(new Roue("avant gauche"));
	        this.elements.add(new Roue("avant droite"));
	        this.elements.add(new Roue("arrière gauche")); 
	        this.elements.add(new Roue("arrière droite"));
	        
	        this.elements.add(new Carosserie());
	        this.elements.add(new Moteur());
	}


	public ArrayList<IElementVoiture> getElements() {
		return (ArrayList<IElementVoiture>) (elements.clone());
	}
	
}
