package fr.Doranco.dp.strategy;

public class Article {

	protected String nom;
	protected float prix;
	public Article(String nom, float prix) {
		super();
		this.nom = nom;
		this.prix = prix;
	}
	
	public String getNom() {
		return nom;
	}
	public float getPrix() {
		return prix;
	}
	
	public void payer(IPaiementStrategy paiement) {
		paiement.payer(getPrix());
	}
	
	
}
