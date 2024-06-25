package fr.Doranco.dp.strategy;

public class Main {

	public static void main(String[] args) {
		
		
		Panier panier = new Panier();
		
		Article article1 = new Article("Livre : Tout savoir sur les Patterne Stratehy", 25.00f);
		Article article2 = new Article("Piano Steinway & son B-211", 51000.00f);
		
		
		article1.payer(new PaypalStrategy("loginExemple", "passwordExemple"));
		article2.payer(new CarteDeCreditStrategy("Moi", "123456455", "786", "12/12"));
		
		panier.getArticles().add(article1);
		panier.getArticles().add(article2);
		
		panier.payer(new PaypalStrategy("blabla", "12345"));

	}

}