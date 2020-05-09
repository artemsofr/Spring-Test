package ru.sofronov.springtest;

public class ClassicalMusic implements Music {
	private ClassicalMusic() {
		// TODO Auto-generated constructor stub
	}
	
	public static ClassicalMusic getClassicalMusic () {
		
		return new ClassicalMusic();
	}
	
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
