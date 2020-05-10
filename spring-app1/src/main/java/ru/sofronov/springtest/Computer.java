package ru.sofronov.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	
	private int id;
	@Autowired
	private MusicPlayer musicPlayer;	
	
	public Computer() {
	// TODO Auto-generated constructor stub
	}
	
	public void startMusicPlayer(MusicGenre genre) {
		id = 1;
		System.out.println("Computer " + id + " : " + musicPlayer.playMusic(genre));
	}
	
}
