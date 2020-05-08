package ru.sofronov.springtest;

public class MusicPlayer {
	private Music music;
	private String name;
	private int volume;
	
	public MusicPlayer(Music music) {
		
		this.music = music;
	}

	public MusicPlayer() {
		// TODO Auto-generated constructor stub
	}
	public void setMusic(Music music) {
		this.music = music;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public  void playMusic() {
		
		String song = music.getSong();
		System.out.println("Playing song " + song + ".");
		System.out.println(name + " likes this song. He turns up volume to " + volume + ".");
	}
		
}
