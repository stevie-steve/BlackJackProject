package com.skilldistillery.blackjack;

import java.util.Collections;

public class Dealer {

	private BJHand dealerHand;
	Deck deck = new Deck();
	private Card showonlySecondCardDealer;
	
	public Dealer() {
		dealerHand = new BJHand();
	}

	@Override
	public String toString() {
		
		return "Dealer: " + dealerHand.toString();
	}

	public BJHand getDealerHand() {
		
		return dealerHand;
	}
	

	public void setDealerHand(BJHand DealerHand) {
		this.dealerHand = DealerHand;
	}

	public void addCard(Card card) {
		dealerHand.addCard(card);
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
	public void fanDeck() {
		deck.fanDeck();
	}
	
	public void dealerHandHideFirst() {
		System.out.println("Dealer: Hand [DOWN CARD , " + dealerHand.getCard() + "]");
	}
		

			
		
	
}