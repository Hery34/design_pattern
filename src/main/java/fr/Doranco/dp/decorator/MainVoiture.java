package fr.Doranco.dp.decorator;

public class MainVoiture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voiture vCorsa = new Corsa();
		System.out.println(vCorsa);
		Voiture vC2 = new C2();
	System.out.println(vC2);
		
		
		Voiture vCorsaReg = new Regulateur(vCorsa);
		System.out.println(vCorsaReg);
		
		Voiture vC2Reg = new Regulateur(vC2);
		System.out.println(vC2Reg);
		
		
		Voiture vCorsa1 = new Corsa();
		Voiture vCorsa2 = new GPS(vCorsa1);
		Voiture vCorsa3 = new Regulateur(vCorsa2);
		Voiture vCorsa4 = new ToitOuvrant(vCorsa3);
		System.out.println(vCorsa4);
		Voiture vCitroen1 = new C2();
		Voiture vCitroen2 = new GPS(vCitroen1);
		Voiture vCitroen3 = new ToitOuvrant(vCitroen2);
		Voiture vCitroen4 = new Regulateur(vCitroen3);
		System.out.println(vCitroen4);
		System.out.println("**********************************************");
		Voiture Corsa1 = new Corsa();
		Voiture Corsa2 = new GPS(Corsa1);
		Voiture Corsa3 = new GPS(Corsa2);
		Voiture Corsa4 = new GPS(Corsa3);
		System.out.println(Corsa4);
		
		
		
		Voiture voitureFinale = new ToitOuvrant(new Regulateur(new GPS(new Corsa())));		
		System.out.println(voitureFinale);
		
		Voiture Corsa5 = new ToitOuvrant(vCorsa4);
		
		System.out.println(Corsa5);
	}
	

}
