package fr.Doranco.dp.Abstract.factory;

public final class PCFactory implements ComputerInterAbstractFactory {
	
	protected String ram;
	protected String hdd;
	protected String cpu;
	
	

	public PCFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}



	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new PC(ram, hdd, cpu); 
	}
	
	

}
