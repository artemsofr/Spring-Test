package ru.sofronov.springtest;

import org.springframework.stereotype.Component;

//@Component
public class RockMusic implements Music {
	
	String[] rockSongs = new String[3];
	{
	rockSongs[0] = "Mutter(Rammstein)";
	rockSongs[1] = "Hammerhead(Offspring)";
	rockSongs[2] = "Numb(Linkin park)";	
	}
	public String getSong(int r) {
		// TODO Auto-generated method stub				
		return rockSongs[r];
	}

}
