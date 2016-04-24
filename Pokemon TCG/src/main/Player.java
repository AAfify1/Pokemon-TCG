package main;

public class Player {
	
	private Deck deck;
	private Hand hand;
	private PrizeCards prize;
	private Boolean win;
	private String name;
	
	public Player(Deck deck,Hand hand,PrizeCards prize, String name)
	{
		this.deck = deck;
		this.hand = hand;
		this.prize = prize;
		this.name = name;
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

}
