package fr.Doranco.dp.Abstract.factory;

public class PC extends Computer {
	
	protected String ram;
	protected String hdd;
	protected String cpu;
	
	
	public PC(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}


	public String getRam() {
		return ram;
	}


	public String getHdd() {
		return hdd;
	}


	public String getCpu() {
		return cpu;
	}
	
	
	
	
	

}
