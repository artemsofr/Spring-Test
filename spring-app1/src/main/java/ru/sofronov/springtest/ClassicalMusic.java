package ru.sofronov.springtest;

import org.springframework.stereotype.Component;

@Component
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
	
}
