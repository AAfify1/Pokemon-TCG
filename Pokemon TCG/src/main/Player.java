package main;

import pokemons.Pokemon;

public class Player {

	public Deck deck;
	public Hand hand;
	public PrizeCards prize;
	public Boolean win;
	public String name;
	public Pokemon active = new Pokemon("card"); 
	
	

	public Player(Deck deck, PrizeCards prize, String name) {
		this.deck = deck;
		this.hand = new Hand(this);
		this.prize = prize;
		this.name = name;
		prize.fill(deck);
		hand.draw(deck, 7);
	}

	public Boolean getWin() {
		return win;
	}

	public void setWin(Boolean win) {
		this.win = win;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Deck getDeck() {
		return deck;
	}

	public Hand getHand() {
		return hand;
	}

	public PrizeCards getPrize() {
		return prize;
	}

	public void setActive(Card card) 
	{
		
		
		if (card instanceof Pokemon)
		{
			hand.remove(card);
			active=(Pokemon) card;
			
			
		}
	}
	public void draw()
	{
		hand.draw(deck);
	}

	
}
