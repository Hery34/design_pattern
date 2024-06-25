package fr.Doranco.dp.stateWithDp;

public class VideoEnPause implements IEtatVideo {

	@Override
	public void action(Video context) {
		System.out.println("La vidéo est en pause");
		
	}

}
