package fr.Doranco.dp.visitor;

public interface IElementVoitureVisitor {
	
public void visit(Roue roue);
public void visit(Moteur moteur);
public void visit(Carosserie Carosserie);

public void visitVoiture(Voiture voiture);

}
