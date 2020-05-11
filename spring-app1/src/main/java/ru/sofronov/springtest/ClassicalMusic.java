package ru.sofronov.springtest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope ("prototype")
//@Scope ("singleton")
public class ClassicalMusic implements Music {
	
	String[] classicSongs = new String[3];
	{
	classicSongs[0] = "Peer Gunt Suite - Morning(Grieg)";
	classicSongs[1] = "Spring - Four Seasons (Vivaldi)";
	classicSongs[2] = "Moonlight Sonata (Bethowen)";
	}
	public String getSong(int r) {
		// TODO Auto-generated method stub
		return classicSongs[r];
	}
	@PostConstruct
	public void doMyInit() {
		
		System.out.println("Starting Init...");
	}
	@PreDestroy
	public void doMyDestroy() {
		
		System.out.println("Starting bean destruction...");
	}
	
	
}
