package com.antoine.bataillenavalle.manager;

import com.antoine.bataillenavalle.Player;
import com.antoine.bataillenavalle.warship.Corvette;

public class GameManager {
	
	
	
	public void take_boat (Player player){
		
		player.getPlayer_bateau().add(new Corvette());
		
		
	}
	

}
