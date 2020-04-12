package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	protected List <Card> cards = new ArrayList<Card>();
	
	public Hand() {
		
	}


	public void addCard (Card card) {
		cards.add(card);
	}
	
	//public void clear() {
		
	//}
	
	
	public abstract int getHandValue();

	public Card getCard() {
		return cards.get(1);
	}
	
	
	@Override
	public String toString() {
		return "Hand " + cards ;
	}
	
		
	
	
}



    