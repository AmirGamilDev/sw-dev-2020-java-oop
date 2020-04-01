package com.example.staticvariables;

public class GameTest {

	public static void main(String[] args) {
		
		Player player = new Player("Jim");
		
		System.out.println("Current player health: " + player.getHealth());
		
		Monster monster1 = new Monster("Red");
		Monster monster2 = new Monster("Green", 50);		
		
		monster1.attackPlayer(player);
		monster2.attackPlayer(player);
		
		System.out.println("Current player health: " + player.getHealth());
		
		Monster monster3 = new Monster("Purple");
		
		monster3.attackPlayer(player);
		monster1.attackPlayer(player);
		
		System.out.println("Current player health: " + player.getHealth());
	}
}
