package fr.Doranco.dp.composite;

public class Remorque extends Composant implements IComposant{

	private int poids;

	public Remorque(int poids) {
		super();
		this.poids = poids;
	}

	@Override
	public int getPoids() {
		// TODO Auto-generated method stub
		return poids;
	}
	
	
}
