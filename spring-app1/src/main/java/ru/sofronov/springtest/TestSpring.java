package ru.sofronov.springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
		
		System.out.println(classicalMusic.getSong());
		
//		MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		MusicPlayer thirdMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		
		//musicPlayer.playMusicList();
		
//		firstMusicPlayer.playMusic();
//		
//		boolean comparison = firstMusicPlayer == secondMusicPlayer;
//		boolean comparison1 = firstMusicPlayer == thirdMusicPlayer;
//		boolean comparison2 = secondMusicPlayer == thirdMusicPlayer;
//		
//		System.out.println(comparison);
//		System.out.println(comparison1);
//		System.out.println(comparison2);
//		System.out.println(firstMusicPlayer);
//		System.out.println(secondMusicPlayer);
//		System.out.println(thirdMusicPlayer);
//		
//		
//		RockMusic rm = new RockMusic();
//		firstMusicPlayer.setMusic(rm);
//		firstMusicPlayer.playMusic();
//				
//		secondMusicPlayer.playMusic();
				
		context.close();
	}

}
