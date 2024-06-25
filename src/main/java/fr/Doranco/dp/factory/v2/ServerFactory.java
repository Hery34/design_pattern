package fr.Doranco.dp.factory.v2;

public class ServerFactory extends ComputerFactory {

	@Override
	public Computer createComputer(String typeComputer, short ram, short hdd, short cpu) {
		// TODO Auto-generated method stub
		return new Server(ram, hdd, cpu);
	}

}
