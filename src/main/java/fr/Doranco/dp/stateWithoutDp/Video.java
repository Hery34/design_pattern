package fr.Doranco.dp.stateWithoutDp;

public class Video {
private String etat = "";

public void setEtat (String etat) {
	this.etat = etat;
}


public void action() {
	
	if(etat.equalsIgnoreCase("PLAY")) {
		System.out.println("La vidéo est en lecture");
	} else {
		if(etat.equalsIgnoreCase("PAUSE")) {
			System.out.println("La vidéo est en pause");
		}
	}
}
}
