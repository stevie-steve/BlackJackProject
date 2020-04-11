package com.skilldistillery.blackjack;

public class BJHand extends Hand{

	
	public BJHand() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getHandValue() {
		return 0;
	}

	public boolean isBlackjack() {	
	return true;
	}
	
	public boolean isBust() {
		//playerhand= >21
		return true;
	}
	
	public boolean isHard() {
		return true;
	}
	
	public boolean isSoft() {
		return true;
	}
	
}
