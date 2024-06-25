package fr.Doranco.dp.Abstract.factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Computer PC = ComputerFactory.getComputer(new PCFactory("2 GB", "500GB", "2.4 GHz"));
Computer Server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));

System.out.println(" AbstractFactory PC config ::" + PC);
System.out.println(" AbstractFactory Server config ::" + Server);
	}

}
