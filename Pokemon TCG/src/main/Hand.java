package main;
import java.util.ArrayList;

public class Hand {
	
	ArrayList<Card> hand = new ArrayList<Card>();
	
	public void draw(Deck deck,int N)
	{
		for(int i =0; i<=N;i++)
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
	public int getSize()
	{
		return hand.size();
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

}
