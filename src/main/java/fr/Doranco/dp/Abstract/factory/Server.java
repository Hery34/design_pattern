package fr.Doranco.dp.Abstract.factory;

public class Server extends Computer{
	protected String ram;
	protected String hdd;
	protected String cpu;
	public Server(String ram, String hdd, String cpu) {
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
