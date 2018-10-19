package com.antoine.bataillenavalle;

public class Cases {

	private int posX;
	private int posY;
	String content;
	
	
	public Cases(int positionX, int positionY, String cases_content) {
	
		this.posX = positionX;
		this.posY = positionY;
		this.content = cases_content;
	}
	
	public void water() {
	
		this.content = "()";
		
	}
	
	public void miss() {
			
			this.content = "0";
			
		}

	public void touch() {
		
		this.content = "X";
		
	}

	/**
	 * @return the posX
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * @return the posY
	 */
	public int getPosY() {
		return posY;
	}


	public String getcontent() {
		return content;
	}




	

	
		
}
