package fr.Doranco.dp.stateWithDp;

public class Video {
	
	private IEtatVideo etatVideo;
	
	
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 public void setState(IEtatVideo newEtat) {
		 this.etatVideo = newEtat;
		 
	 };
	 
	 public void action() {
		 etatVideo.action(this);
	 }

}
