package ru.sofronov.springtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan ("ru.sofronov.springtest")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
	
	@Bean
	public Music classicalMusic() {
		
		return new ClassicalMusic();
	}
	@Bean
	public Music rockMusic() {
		
		return new RockMusic();
	}
	@Bean
	public Music popMusic() {
		
		return new PopMusic();
	}
	
	@Bean
	public List<Music> musicList(){
				
		return Arrays.asList(classicalMusic(), rockMusic(), popMusic());
	}
	
	@Bean	
	public MusicPlayer musicPlayer() {
		
		return new MusicPlayer(musicList());
	}
}
