package fr.Doranco.dp.visitor;

public class ElementVoitureDoVisitor implements IElementVoitureVisitor{

	@Override
	public void visit(Roue roue) {
		System.out.println("Coup de pied sur roue : " + roue);
		
	}

	@Override
	public void visit(Moteur moteur) {
		System.out.println("Démarrer mon moteur");
		
	}

	@Override
	public void visit(Carosserie Carosserie) {
		System.out.println("Déplacer ma carosserie");
		
	}

	@Override
	public void visitVoiture(Voiture voiture) {
		System.out.println("\nDémarrer ma voiture");
		for(IElementVoiture carElement : voiture.getElements()) {
			carElement.accept(this);
		}
		System.out.println("=> Voiture démarrée");
	}

}
