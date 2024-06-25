package fr.Doranco.dp.factory.v1;

public class ComputerFactory {
	

	
public static Computer getComputer(String typeComputer, short ram, short hdd, short cpu) {
if (typeComputer.equals(typeComputerEnum.PC.getValue())) {
return new PC(ram, hdd, cpu);
}
if (typeComputer.equals(typeComputerEnum.SERVER.getValue())) {
return new Server (ram, hdd, cpu);
}

throw new IllegalArgumentException("Ce type de computer n'est  pas possible");
}
}
