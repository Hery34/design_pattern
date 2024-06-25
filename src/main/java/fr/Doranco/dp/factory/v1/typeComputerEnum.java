package fr.Doranco.dp.factory.v1;

public enum typeComputerEnum {
PC ("PC"),
SERVER ("Server");

private String value;

private typeComputerEnum(String value) {
	this.value = value;
}

public String getValue() {
	return value;
}

}
