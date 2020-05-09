package ru.sofronov.springtest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	@Autowired
	private Music music;
	private String name;
	private int volume;
	private String song;
	
	private List <Music> musicList = new ArrayList<>();
	
	
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
	public void setMusicList(List<Music> musicList) {
		this.musicList = musicList;
	}
	
	public  void playMusic() {
		
		song = music.getSong();
		System.out.println("Playing song " + song + ".");
	}
	
	public  void playMusicList() {		
		
		for (Music music : musicList) {
			
			song = music.getSong();
			System.out.println("Playing song " + music.getSong() + ".+");
		}
				
	}
}
