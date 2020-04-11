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


	public BJHand getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(BJHand playerHand) {
		this.playerHand = playerHand;
	}
	
	public void addCard(Card card) {
		playerHand.addCard(card);
	}
	
	
}
