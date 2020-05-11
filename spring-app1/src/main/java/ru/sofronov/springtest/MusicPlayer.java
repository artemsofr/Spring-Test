package ru.sofronov.springtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Component;

//@Component
public class MusicPlayer {
	
	private Music music1;
	private Music music2;
	private Music music3;
	@Value ("${MusicPlayer.name}")
	private String name;
	@Value ("${MusicPlayer.volume}")
	private int volume;
	private String song;
	private String song2;
	private String song1;
	private Random random;
	private int r;
	
	
	public Music getMusic1() {
		return music1;
	}

	public String getName() {
		return name;
	}
	
	public int getVolume() {
		return volume;
	}

	private List <Music> musicList = new ArrayList<>();
	
	
//	@Autowired
	public MusicPlayer(@Qualifier ("classicalMusic") Music music1, 
			@Qualifier ("rockMusic") Music music2, @Qualifier ("popMusic") Music music3) {
		
		this.music1 = music1;
		this.music2 = music2;
		this.music3 = music3;
	}
	
	public MusicPlayer(List <Music> musicList) {
		
		this.musicList = musicList;
	}

	public MusicPlayer() {
		// TODO Auto-generated constructor stub
	}
	
	public void setMusic(Music music1) {
		this.music1 = music1;
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
	
	public String playMusic(MusicGenre musicGenre ) {		
		
		random = new Random();
		r = random.nextInt(3);	
		
		switch (musicGenre) {
		case CLASSICAL: 
			song = music1.getSong(r);
			break;
		case ROCK: 
			song = music2.getSong(r);
			break;
		case POP: 
			song = music3.getSong(r);
			break;	
		default:
			song = "Error, it's not a song";		
		}	
				
		return "Playing song " + (r+1) + "." + song + ". " 
			+ name + " likes this song and he increase volume up to " + volume + ".";
	}
	
	public  void playMusicList() {		
		random = new Random();
		r = random.nextInt(3);
		for (Music musicFromList : musicList) {
			
			song = musicFromList.getSong(r);
			System.out.println("Playing song " + song + ".+");
		}
		r = random.nextInt(3);
		Music genre = musicList.get(r);
		r = random.nextInt(3);
		String songFromGenre = genre.getSong(r);	
		System.out.println("Playing song " + songFromGenre + ".*");		
	}
}
