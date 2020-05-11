package ru.sofronov.springtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.event.ApplicationContextEvent;

//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ClassPathXmlApplicationContext context = 
//				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		
//		Music music = context.getBean("rockMusic", Music.class);
//		Music music1 = context.getBean("classicalMusic", Music.class);
//		Computer myComp = context.getBean("computer", Computer.class);
//		
//		
//		myComp.startMusicPlayer(MusicGenre.CLASSICAL);
//		myComp.startMusicPlayer(MusicGenre.ROCK);
//		myComp.startMusicPlayer(MusicGenre.POP);
		
//		MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//		
//		musicPlayer1.playMusic();

		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		
//		String test = musicPlayer.playMusic(MusicGenre.CLASSICAL);
//		System.out.println(test);
//		System.out.println(musicPlayer.getName());
//		System.out.println(musicPlayer.getVolume());
		
		musicPlayer.playMusicList();
		
		Music music = context.getBean("classicalMusic", Music.class);
		Music music1 = context.getBean("classicalMusic", Music.class);
		System.out.println(music);
		System.out.println(music1);
		
		context.close();
	}

}
