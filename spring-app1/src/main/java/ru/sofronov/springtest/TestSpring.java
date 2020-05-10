package ru.sofronov.springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Music music = context.getBean("rockMusic", Music.class);
//		Music music1 = context.getBean("classicalMusic", Music.class);
		Computer myComp = context.getBean("computer", Computer.class);
		
		
		myComp.startMusicPlayer(MusicGenre.CLASSICAL);
		myComp.startMusicPlayer(MusicGenre.ROCK);
		myComp.startMusicPlayer(MusicGenre.POP);
		
//		MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//		
//		musicPlayer1.playMusic();
				
		context.close();
	}

}
