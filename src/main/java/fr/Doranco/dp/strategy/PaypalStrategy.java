package fr.Doranco.dp.strategy;

public final class PaypalStrategy implements IPaiementStrategy{
protected String login;
protected String password;
	

	
	public PaypalStrategy(String login, String password) {
	super();
	this.login = login;
	this.password = password;
}



	@Override
	public void payer(float montant) {
		System.out.println(montant + " € payés par Paypal");
		
	}

}
