package fr.Doranco.dp.Observer;

import java.util.Map;

public class NotesObserver extends Observer{
	
public Eleve eleve;


@Override
protected void addOrUpdate() {
	Map<String, Float> notes = eleve.getNotes();
	
	float moyenne = 0;
	
	for (Map.Entry<String, Float> entry : notes.entrySet()) {
		String key = entry.getKey();
		moyenne = entry.getValue();
	}
	moyenne /= notes.size();
	
	eleve.setMoyenne(moyenne);
	
}
}