package com.skilldistillery.blackjack;

import java.util.List;

public class Player{
	private BJHand playerHand = new BJHand();

	public Player() {	
	}
	
	@Override
	public String toString() {
		return "Player: " + playerHand.toString();
	}
	
	public void addCard(Card card) {
		playerHand.addCard(card);
	}
 
	public BJHand getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(BJHand playerHand) {
		this.playerHand = playerHand;
	}
	
	
}
