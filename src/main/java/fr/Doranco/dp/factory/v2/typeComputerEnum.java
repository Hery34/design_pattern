package fr.Doranco.dp.factory.v2;

public enum typeComputerEnum {
PC ("PC"),
SERVER ("Server"),
PORTABLE ("Portable");

private String value;

private typeComputerEnum(String value) {
	this.value = value;
}

public String getValue() {
	return value;
}

}
