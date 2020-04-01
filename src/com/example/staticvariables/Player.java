package com.example.staticvariables;

public class Player {

	private String playerName;
	private int health;
	
	public Player(String playerName) {
		super();
		this.playerName = playerName;
		this.health = 100;
	}
	
	public void takeDamage(int damage) {
		this.health -= damage;
	}
	
	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}
	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}
}
