package fr.Doranco.dp.Abstract.factory;

public class ComputerFactory {
	
	static Computer getComputer(ComputerInterAbstractFactory factory) {
		return factory.createComputer();
	}

}
