package fr.Doranco.dp.visitor;

public class ElementVoiturePrintVisitor implements IElementVoitureVisitor{

	@Override
	public void visit(Roue roue) {
		System.out.println("Visite de la roue " + roue );
		
	}

	@Override
	public void visit(Moteur moteur) {
		System.out.println("Visite du moteur");
	}

	@Override
	public void visit(Carosserie Carosserie) {
		System.out.println("Visite de la carosserie");
		
	}

	@Override
	public void visitVoiture(Voiture voiture) {
		System.out.println("\n Visite de la voiture");
		for (IElementVoiture element : voiture.getElements()) {
			element.accept(this);
		}
		System.out.println("=> Voiture visitée");
	}

}
