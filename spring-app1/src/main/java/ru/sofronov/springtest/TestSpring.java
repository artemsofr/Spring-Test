package ru.sofronov.springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		
		//musicPlayer.playMusicList();
		
		firstMusicPlayer.playMusic();
		
		boolean comparison = firstMusicPlayer == secondMusicPlayer;
		System.out.println(comparison);
		System.out.println(firstMusicPlayer);
		System.out.println(secondMusicPlayer);
		
		
		
		RockMusic rm = new RockMusic();
		firstMusicPlayer.setMusic(rm);
		firstMusicPlayer.playMusic();
				
		secondMusicPlayer.playMusic();
				
		context.close();
	}

}
