package fr.Doranco.dp.Observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class Eleve {
	
	private Set<Observer> observers; 
	private Map<String, Float> notes;
	private float moyenne;
	private float note;
	
	public Eleve() {
		super();
		observers = new HashSet<Observer>();
		notes = new HashMap<String, Float>();
		
	}
	
	public void addOrUpdateNote(String matiere, float note) {
		notes.put(matiere, note);
		notifyObservers();
	}
	
	
	public void notifyObservers() {
		for (Observer o : observers) {
			o.addOrUpdate();
		}
	}
	
	public void attachObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void detachObserver(Observer observer) {
	observers.remove(observer);
	}
	// les lignes dessous c'est pour la JavaDOc
	/**
	 * <b>LEs balsies Html sont fonctionnelles en JavaDoc<b>
	 * 
	 *Retourne la liste des notes d'un élève
	 * @return
	 */
	public Map<String, Float> getNotes() {
		return notes;
	}


	public Float getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(Float moyenne) {
		this.moyenne = moyenne;
	}
	
}	
