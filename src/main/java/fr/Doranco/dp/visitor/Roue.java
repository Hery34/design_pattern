package fr.Doranco.dp.visitor;

public final class Roue implements IElementVoiture{
	
	String name;
	

	public Roue(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}

	


	@Override
	public void accept(IElementVoitureVisitor elementVisitVoiture) {
		// TODO Auto-generated method stub
		
	}

}
