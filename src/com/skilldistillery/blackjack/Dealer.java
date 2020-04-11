package com.skilldistillery.blackjack;

import java.util.Collections;

public class Dealer {

	private BJHand DealerHand;
	Deck deck = new Deck();

	public Dealer() {
		DealerHand = new BJHand();
	}

	@Override
	public String toString() {
		return "Dealer: " + DealerHand.toString();
	}

	public BJHand getDealerHand() {
		return DealerHand;
	}

	public void setDealerHand(BJHand DealerHand) {
		this.DealerHand = DealerHand;
	}

	public void addCard(Card card) {
		DealerHand.addCard(card);
	}

	public Card dealCard(){
		   return deck.dealCard();
	}
	
	public int checkDeckSize() {
		return deck.checkDeckSize();
	}
	
	public void shuffle() {
		deck.shuffle();
	}
}