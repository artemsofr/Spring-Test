package ru.sofronov.springtest;

import org.springframework.stereotype.Component;

//@Component
public class PopMusic implements Music {
	
	String[] popularSongs = new String[3];
	{
	popularSongs[0] = "TGIF(Ketty Perry)";
	popularSongs[1] = "Umbrella (Rihanna)";
	popularSongs[2] = "Frozen (Madonna)";
	}
	
	public String getSong(int r) {
		// TODO Auto-generated method stub
		
		
		return popularSongs[r];
	}

}
