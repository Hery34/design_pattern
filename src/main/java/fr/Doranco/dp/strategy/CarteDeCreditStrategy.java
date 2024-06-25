package fr.Doranco.dp.strategy;

public final class CarteDeCreditStrategy implements IPaiementStrategy{
	
protected String nom;
protected String numeroCarte;
protected String cryptogramme;
protected String dateExpiration;

public CarteDeCreditStrategy(String nom, String numeroCarte, String cryptogramme, String dateExpiration) {
	super();
	this.nom = nom;
	this.numeroCarte = numeroCarte;
	this.cryptogramme = cryptogramme;
	this.dateExpiration = dateExpiration;
}

@Override
public void payer(float montant) {
	System.out.println(montant + " € payés par Carte de crédit");
	
}


	
}
