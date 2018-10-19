package com.antoine.bataillenavalle.manager;

import java.util.ArrayList;
import java.util.Random;

import com.antoine.bataillenavalle.Player;
import com.antoine.bataillenavalle.warship.Corvette;
import com.antoine.bataillenavalle.warship.DefaultBateau;

public class BateauManager {
	
	private int map_height = 24;
	private int map_width = 18;
	
	private int x;
	private int y;
	private int direction;
	
	private int a;
	
	boolean flag;
	private DefaultBateau list_boat_types;
	
	public BateauManager(int map_h, int map_w, DefaultBateau list_boat) {
		
		this.map_height = map_h;
		this.map_width = map_w;
		this.list_boat_types = list_boat;
		
	}
	

	public boolean available_cases() {
		
		Random rand = new Random();
		this.x = rand.nextInt(25);
		this.y = rand.nextInt(19);
		this.direction = rand.nextInt(2);
		
		
		if (direction == 0) {
			for (int a = 0; a < getNameBateau(); a++) { 
			

		} else {
			for (int a = 0; a < monTabInt.length; a++)
				if (!(x+a) < map_width OU ) {
					
				}
		}


		if (flag) {
			PlaceBateau(map,bateauId,bateauWidth,x,y,direction)
		} else {
			TestPlaceBateau(map,bateauId,bateauWidth)
		} 

		return flag;
		
	}
	

	public int ship_placement () {
		
		
		
		return 0;	
		
	}

}
