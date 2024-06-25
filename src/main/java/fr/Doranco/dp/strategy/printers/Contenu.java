package fr.Doranco.dp.strategy.printers;

public class Contenu {
	
	String contenu;

	public Contenu(String contenu) {
		super();
		this.contenu = contenu;
	}

	public String getContenu() {
		return contenu;
	}
	
	public void print(IPrintersStrategy printer) {
		
		printer.print(getContenu(), contenu);
	}

}
