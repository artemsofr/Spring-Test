package ru.sofronov.springtest;

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
	public MusicPlayer musicPlayer() {
		
		return new MusicPlayer(classicalMusic(), rockMusic(), popMusic());
	}
	
	
	
}
