package fr.Doranco.dp.factory.v1;

public abstract class Computer {
	
	protected String type;
	protected short ram;
	protected short hdd;
	protected float cpu;
	
	
	@Override
	public String toString() {
		return "Computer [type=" + type + ", ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}


	protected Computer(String type, short ram, short hdd, float cpu) {
		super();
		this.type = type;
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	
	
	

}
