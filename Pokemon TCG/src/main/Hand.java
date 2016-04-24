package main;
import java.util.ArrayList;

public class Hand {
	
	ArrayList<Card> hand = new ArrayList<Card>();
	
	public void draw(Deck deck)
	{
		Card drawn = deck.pop();
		if(!drawn.getName().equals("Empty"))
		{
		hand.add(drawn);
		}
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

}
