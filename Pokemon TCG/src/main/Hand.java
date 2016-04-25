package main;
import java.util.ArrayList;

import gui.HandCard;

public class Hand {
	
	ArrayList<HandCard> hand = new ArrayList<HandCard>();
	private Player player;
	
	public Hand(Player player)
	{
		this.player = player;
	}
	
	public void draw(Deck deck,int N)
	{
		for(int i =0; i<=N;i++)
		{
		Card drawn = deck.pop();
		if(!drawn.getName().equals("Empty"))
		{
			HandCard handC = new HandCard(player, drawn);
		hand.add(handC);
		}
		}
	}
	public void draw(Deck deck)
	{
		
		Card drawn = deck.pop();
		if(!drawn.getName().equals("Empty"))
		{
		hand.add(new HandCard(player, drawn));
		}
		
	}
	
	public void remove (Card card)
	{
		hand.remove(card);
	}
	public Card getCard(int i)
	{
		return hand.get(i).getCard();
	}
	public HandCard get(int i)
	{
		return hand.get(i);
	}
	public int getSize()
	{
		return hand.size();
	}

	public ArrayList<HandCard> getHand() {
		return hand;
	}

}
