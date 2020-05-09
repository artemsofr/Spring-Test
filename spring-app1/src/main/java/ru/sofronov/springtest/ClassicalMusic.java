package ru.sofronov.springtest;

public class ClassicalMusic implements Music {
	
	public void doMyInit() {
		
		System.out.println("Doing my initialization.");
	}
	
public void doMyDestroy() {
		
		System.out.println("Doing my destruction.");
	}
	
	public String getSong() {
		// TODO Auto-generated method stub
		return "Peer Gunt Suite - Morning(Grieg)";
	}
	
}
