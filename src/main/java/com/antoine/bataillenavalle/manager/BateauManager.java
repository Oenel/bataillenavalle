package com.antoine.bataillenavalle.manager;

import java.util.ArrayList;

import com.antoine.bataillenavalle.Player;
import com.antoine.bataillenavalle.warship.Corvette;
import com.antoine.bataillenavalle.warship.DefaultBateau;

public class BateauManager {
	
	private int map_height = 24;
	private int map_width = 18;
	
	private DefaultBateau list_boat_types;
	
	public BateauManager(int map_h, int map_w, DefaultBateau list_boat) {
		
		this.map_height = map_h;
		this.map_width = map_w;
		this.list_boat_types = list_boat;
		
	}
	
	public void take_boat (Player PlayerId){
		
		PlayerId.getplayer_bateau().add(new Corvette());
		
	;	
	}
	
	
	

}
