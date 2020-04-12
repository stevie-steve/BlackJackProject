package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BJApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BJApp bJapp = new BJApp();

		bJapp.run();

	}

	public void run() {

		Scanner w = new Scanner(System.in);
		Player player = new Player();
		Dealer dealer = new Dealer();
		System.out.println(dealer.checkDeckSize());
		// for (Card card : deck.getCards()) {
		// System.out.println(card.toString()); // this exposed the cards to everyone
		// (BJApp class)
		// }
		// deck.fanDeck(); //or, this keeps the card in the Deck file
		dealer.shuffle();
		// deck.fanDeck();

		for (int i = 0; i < 2; i++) {
			player.addCard(dealer.dealCard());
			dealer.addCard(dealer.dealCard());
		}
		System.out.println(player.toString());
		dealer.dealerHandHideFirst();
		// System.out.println(dealer.toString()); // call a method in dealer
		System.out.println(dealer.checkDeckSize());
 
		if (player.getPlayerHand().isBlackjack() && dealer.getDealerHand().isBlackjack()) {
			System.out.println("PUSH");
			System.exit(0);
		}
		if (player.getPlayerHand().isBlackjack() && !dealer.getDealerHand().isBlackjack()) {
			System.out.println("BLACKJACK. PLAYER WINS");
			System.exit(0);
		}
		if (!player.getPlayerHand().isBlackjack() && dealer.getDealerHand().isBlackjack()) {
			System.out.println(dealer.toString());
			System.out.println("BLACKJACK. DEALER WINS");
			System.exit(0);
		}
 
		System.out.println("Players total is " + player.getPlayerHand().getHandValue() + ". "
				+ "Would you like to:\n1. Hit \n2. Stay");
		int choice = w.nextInt();

		while (!player.getPlayerHand().isBust()) {
			if (choice == 1) {
				player.addCard(dealer.dealCard());
				System.out.println(player.toString());
				System.out.println("Players total is " + player.getPlayerHand().getHandValue() + ".");
				if (player.getPlayerHand().isBust()) {
					System.out.println("You Busted. Loser!");
					System.exit(0);
				} else {
					System.out.println("Would you like to:\n1. Hit \n2. Stay");
					choice = w.nextInt();
					System.out.println();
				}
			}
			if (choice == 2) {
				System.out.println("You chose to hold.");
				System.out.println(player.toString());
				System.out.println("Players total is " + player.getPlayerHand().getHandValue() + ".");
				System.out.println();
				break;

			}
			if (choice != 2 && choice != 1) {
				System.out.println("Be careful with your choices here. This is Vegas! 1 or 2");
				System.out.println("Would you like to:\n1. Hit \n2. Stay");
				choice = w.nextInt();
			}
		}
		System.out.println(dealer.checkDeckSize());
		
		System.out.println(dealer.toString());
		System.out.println("Dealers total value is " + dealer.getDealerHand().getHandValue() + ".");
	
		while (!dealer.getDealerHand().isBust()){ //&& (dealer.getDealerHand().getHandValue() > 17)) {
			
			if ((dealer.getDealerHand().getHandValue() < 17)) {
				dealer.addCard(dealer.dealCard());
				System.out.println("Dealer hits...\n");
				
				System.out.println(dealer.toString());
				System.out.println("Dealers total value is " + dealer.getDealerHand().getHandValue() + ".");
				System.out.println();
			}

			if ((dealer.getDealerHand().getHandValue() >= 17) && dealer.getDealerHand().getHandValue() <22) {
				System.out.println(dealer.toString());
				System.out.println("Dealers total value is " +dealer.getDealerHand().getHandValue() + ".");
				System.out.println();
 				break;
			}
		}
			if  (dealer.getDealerHand().isBust()) {
				System.out.println("Dealer Busts. Wou Win!");
				System.exit(0);
			
		}
		System.out.println(dealer.checkDeckSize());
		
		
		if (player.getPlayerHand().getHandValue() > dealer.getDealerHand().getHandValue()) {
			System.out.println("PLAYER WIN");
			System.exit(0);
		}
		if (player.getPlayerHand().getHandValue() < dealer.getDealerHand().getHandValue()) {
			System.out.println("PLAYER LOSE");
			System.exit(0);
		}
		if (player.getPlayerHand().getHandValue() == dealer.getDealerHand().getHandValue()) {
			System.out.println("PUSH");
			System.exit(0);
		}

		// while (total > 21) {
		// if (choice == 1) {
		// }
		// }
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
