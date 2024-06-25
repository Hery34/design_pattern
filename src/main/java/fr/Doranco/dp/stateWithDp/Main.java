package fr.Doranco.dp.stateWithDp;

public class Main {

	public static void main(String[] args) {
		Video video = new Video();
		video.setState(new VideoEnLecture());
		video.action();
System.out.println("------------------------------");
		
		video.setState(new VideoEnPause());
		video.action();
		System.out.println("------------------------------");
		
		video.setState(new RetourAuDebut());
		video.action();
		
		
	}
	
	

}
