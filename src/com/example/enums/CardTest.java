package com.example.enums;

public class CardTest {

	public static void main(String[] args) {
		
		Card aceOfSpades = new Card(Suit.SPADES, Value.ACE);
		
		System.out.println(aceOfSpades);
		
		Card threeOfDiamonds = new Card(Suit.DIAMONDS, Value.THREE);
		
		System.out.println(threeOfDiamonds);
		
		if(aceOfSpades.getSuit() == threeOfDiamonds.getSuit()) {
			System.out.println("Same suit!");
		} else {
			System.out.println("Different suit!");
		}
	}
}
