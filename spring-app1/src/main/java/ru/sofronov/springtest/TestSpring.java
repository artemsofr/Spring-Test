package ru.sofronov.springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);		
		musicPlayer.playMusicList();
				
		context.close();
	}

}
