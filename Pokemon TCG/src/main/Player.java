package main;

import pokemons.Pokemon;

public class Player {

	public Deck deck;
	public Hand hand;
	public Bench bench;
	public PrizeCards prize;
	private Boolean win;
	public String name;
	private Boolean isActive =false;
	public Pokemon active = new Pokemon("card"); 
	private Boolean hasActive = false;
	private Boolean addedEnergy = false;
	
	
	

	public Boolean getHasActive() {
		return hasActive;
	}



	public void setHasActive(Boolean hasActive) {
		this.hasActive = hasActive;
	}



	public Player(Deck deck, PrizeCards prize, String name) {
		this.deck = deck;
		this.hand = new Hand(this); 
		this.bench = new Bench(this);
		this.prize = prize;
		this.name = name;
		prize.fill(deck);
		hand.draw(deck, 7);
	}
	
	

	public Boolean getActive() {
		return isActive;
	}



	public void setActive(Boolean isActive) {
		this.isActive = isActive;
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



	public Boolean getAddedEnergy() {
		return addedEnergy;
	}



	public void setAddedEnergy(Boolean addedEnergy) {
		this.addedEnergy = addedEnergy;
	}

	
}
