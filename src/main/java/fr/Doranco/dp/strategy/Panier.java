package fr.Doranco.dp.strategy;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	
	private List<Article> articles;
	
	public Panier() {
		articles = new ArrayList<Article>();
	}

	
	
	
	public void payer(IPaiementStrategy paiement) {
		
		float montant = 0;
		
		for (Article article : articles) {
			montant += article.getPrix();
		}
		paiement.payer(montant);
	}




	public List<Article> getArticles() {
		return articles;
	}
}
