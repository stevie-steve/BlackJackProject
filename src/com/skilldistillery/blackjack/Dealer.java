package com.skilldistillery.blackjack;

import java.util.Collections;

public class Dealer {

	private BJHand dealerHand;
	Deck deck = new Deck();

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
		
	}
	public void dealerHandHideFirst() {
		for (int i = 0; i < getDealerHand().cards.size(); i++) {
			if (i>0) {
			System.out.println("Dealer: " + getDealerHand());
			}
			else {
				System.out.println("Dealer: vdfevbdfbvdfv" );
				//getDealerHand();
			}
			
		}
	}
}