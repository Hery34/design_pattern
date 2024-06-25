package fr.Doranco.dp.stateWithoutDp;

public class Main {

	public static void main(String[] args) {
		
		Video video = new Video();
		
		video.setEtat("play");
		video.action();
		
		
		video.setEtat("pause");
		video.action();
	}

}
