package ru.sofronov.springtest;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
		
	public String getSong() {
		// TODO Auto-generated method stub
		return "Peer Gunt Suite - Morning(Grieg)";
	}
	
}
