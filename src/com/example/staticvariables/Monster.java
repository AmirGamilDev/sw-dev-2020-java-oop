package com.example.staticvariables;

public class Monster {

	private String colour;
	private int health;
	
	private static int monsterCount = 0;
	
	public Monster(String colour) {
		super();
		this.colour = colour;
		
		this.health = 100;
		
		monsterCount++;
		
		System.out.println("Current monster count: " + monsterCount);
	}

	public Monster(String colour, int health) {
		super();
		this.colour = colour;
		this.health = health;
		
		monsterCount++;
		
		System.out.println("Current monster count: " + monsterCount);
	}
	
	public void attackPlayer(Player player) {
		if(monsterCount > 2) {
			player.takeDamage(20);
		} else {
			player.takeDamage(10);
		}		
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
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
