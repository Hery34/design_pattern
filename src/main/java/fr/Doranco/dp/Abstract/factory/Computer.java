package fr.Doranco.dp.Abstract.factory;

public abstract class Computer {

	protected String getRam () {
		return null;
	}
	
	protected String getHdd () {
		return null;
	}
	protected String getCpu () {
		return null;
	}

	@Override
	public String toString() {
		return "Computer [getRam()=" + getRam() + ", getHdd()=" + getHdd() + ", getCpu()=" + getCpu() + "]";
	}
	
	
}
