package main;
import java.util.ArrayList;

import gui.BenchCard;

public class Bench {
	
	ArrayList<Card> bench = new ArrayList<Card>();
	private Player player;
	
	public Bench(Player player)
	{
		this.player = player;
	}
	
	
	public void remove (Card card)
	{
		
		bench.remove(card);
	}
	public Card getCard(int i)
	{
		return bench.get(i);
	}

	public int getSize()
	{
		return bench.size();
	}

	public ArrayList<Card> getBench() {
		return bench;
	}
//	public ArrayList<Card> getCards()
//	{
//		ArrayList<Card> cards = new ArrayList<Card>();
//		for(BenchCard x : bench)
//		{
//			Card y = x.getCard();
//			cards.add(y);
//			
//		}
//		return cards;
//	}

}
