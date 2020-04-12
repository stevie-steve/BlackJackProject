package com.skilldistillery.blackjack;

public class BJHand extends Hand {

	public BJHand() {
		super();
	}

	@Override
	public int getHandValue() {
		int handValue = 0;
		for (Card card : cards) {
			handValue += card.getValue();
		}
		
		return handValue;
	}
 
	public boolean isBlackjack() {
		if (getHandValue() == 21) {
			return true;			
		} else {
			return false;
		}
	}

	public boolean isBust() {
		if (getHandValue() >21){
			return true;
		}
		else {
			return false;
		}
	}

//	public boolean isHard() {
//		return true;
//	}

//	public boolean isSoft() {
//		return true;
//	}

}
