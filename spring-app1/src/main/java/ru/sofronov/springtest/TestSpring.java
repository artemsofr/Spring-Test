package ru.sofronov.springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Music musicBean = context.getBean("musicBean", Music.class);
		MusicPlayer musicPlayer = new MusicPlayer(musicBean);		
		musicPlayer.playMusic();
				
		context.close();
	}

}
