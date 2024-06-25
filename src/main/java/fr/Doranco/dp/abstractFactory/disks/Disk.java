package fr.Doranco.dp.abstractFactory.disks;

public abstract class Disk {
protected short volume;
protected short vitesseLecture;
protected boolean readOnly;
protected short vitesseEcriture;


public short getVolume() {
	return volume;
}
public short getVitesseLecture() {
	return vitesseLecture;
}
public boolean isReadOnly() {
	return readOnly;
}
public short getVitesseEcriture() {
	return vitesseEcriture;
}
@Override
public String toString() {
	return "Disk [getVolume()=" + getVolume() + ", getVitesseLecture()=" + getVitesseLecture() + ", isReadOnly()="
			+ isReadOnly() + ", getVitesseEcriture()=" + getVitesseEcriture() + "]";
}



}
