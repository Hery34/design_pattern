package fr.Doranco.dp.abstractFactory.disks;

public final class DVD extends Disk {
	
	protected short volume;
	protected short vitesseLecture;
	protected boolean readOnly;
	protected short vitesseEcriture;
	
	public DVD(short volume, short vitesseLecture, boolean readOnly, short vitesseEcriture) {
		super();
		this.volume = volume;
		this.vitesseLecture = vitesseLecture;
		this.readOnly = readOnly;
		this.vitesseEcriture = vitesseEcriture;
	}

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
	
	
	
}
