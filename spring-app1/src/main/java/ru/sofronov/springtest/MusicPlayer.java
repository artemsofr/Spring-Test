package ru.sofronov.springtest;

public class MusicPlayer {
	private Music music;
	
	
	public MusicPlayer(Music music) {
		
		this.music = music;
	}

	public MusicPlayer() {
		// TODO Auto-generated constructor stub
	}
	public void setMusic(Music music) {
		this.music = music;
	}
	public  void playMusic() {
		
		String song = music.getSong();
		System.out.println("Playing song " + song);
	}

}
