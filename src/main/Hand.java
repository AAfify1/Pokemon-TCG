package main;
import java.util.ArrayList;

import gui.HandCard;

public class Hand {
	
	ArrayList<Card> hand = new ArrayList<Card>();
	private Player player;
	
	public Hand(Player player)
	{
		this.player = player;
	}
	public void drawP()
	{
		hand.add(player.prize.pop());
	}
	public void draw(Deck deck,int N)
	{
		for(int i =0; i<N;i++)
		{
		Card drawn = deck.pop();
		if(!drawn.getName().equals("Empty"))
		{
			
		hand.add(drawn);
		}
		}
	}
	public void draw(Deck deck)
	{
		
		Card drawn = deck.pop();
		if(!drawn.getName().equals("Empty"))
		{
		hand.add(drawn);
		}
		
	}
	
	public void remove (Card card)
	{
		
		hand.remove(card);
	}
	public Card getCard(int i)
	{
		return hand.get(i);
	}
//	public HandCard get(int i)
//	{
//		return hand.get(i);
//	}
	public int getSize()
	{
		return hand.size();
	}

	public ArrayList<Card> getHand() {
		return hand;
	}
//	public ArrayList<Card> getCards()
//	{
//		ArrayList<Card> cards = new ArrayList<Card>();
//		for(HandCard x : hand)
//		{
//			Card y = x.getCard();
//			cards.add(y);
//			
//		}
//		return cards;
//	}

}
