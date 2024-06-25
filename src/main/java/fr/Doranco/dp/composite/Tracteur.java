package fr.Doranco.dp.composite;

public class Tracteur extends Composant implements IComposant {

	private int poids;

	public Tracteur(int poids) {
		super();
		this.poids = poids;
	}

	@Override
	public int getPoids() {
		// TODO Auto-generated method stub
		return poids;
	}
	
	
}
