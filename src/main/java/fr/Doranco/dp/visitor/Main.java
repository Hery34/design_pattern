package fr.Doranco.dp.visitor;

public class Main {

	public static void main(String[] args) {
		Voiture voiture = new Voiture();
		
		IElementVoitureVisitor printVisitor = new ElementVoiturePrintVisitor();
		IElementVoitureVisitor doVisitor = new ElementVoitureDoVisitor();
		
		printVisitor.visitVoiture(voiture);
		doVisitor.visitVoiture(voiture);

	}

}
