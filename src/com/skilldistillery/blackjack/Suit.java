 package com.skilldistillery.blackjack;

public enum Suit {
  HEARTS("\u2665"), SPADES("\u2664"), CLUBS("\u2667"), DIAMONDS("\u2666");
  private String name;

  Suit(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}