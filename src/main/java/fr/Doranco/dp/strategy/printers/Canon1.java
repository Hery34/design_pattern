package fr.Doranco.dp.strategy.printers;

public final class Canon1 extends Canon{

	CanonModels modele = CanonModels.CANON1;
	

	@Override
	public void print(String modele, String contenu) {
		System.out.println("Impression effectuée via l'imprimante " + Canon.class.getSimpleName() + " " + modele);
		
	}
}
