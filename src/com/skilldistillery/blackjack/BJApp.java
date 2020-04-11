package com.skilldistillery.blackjack;

public class BJApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BJApp bJapp = new BJApp();

		bJapp.run();
		

	}

	public void run() {
		
		Player player = new Player();
		Dealer dealer = new Dealer();
		System.out.println(dealer.checkDeckSize());
	//	for (Card card : deck.getCards()) {			
	//		System.out.println(card.toString()); // this exposed the cards to everyone (BJApp class)			
	//	}
		//deck.fanDeck(); //or, this keeps the card in the Deck file 
		dealer.shuffle();
		//deck.fanDeck();
		
		for (int i = 0; i < 2; i++) {
		player.addCard(dealer.dealCard());
		dealer.addCard(dealer.dealCard());
		}
		System.out.println(player.toString());
		System.out.println(dealer.toString()); // call a method in dealer 
		System.out.println(dealer.checkDeckSize());
		
		
		
//		System.out.println('\u2665');
//		System.out.println('\u2664');
//		System.out.println('\u2667');
//		System.out.println('\u2666');
//
//		System.out.println(" _______ ");
//		System.out.println("|      7|");
//		System.out.println("|       |");
//		System.out.println("|   \u2665   |");
//		System.out.println("|       |");
//		System.out.println("|7______|");
	}

}
