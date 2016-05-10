package main;



public class PrizeCards extends Pile {
	
	public PrizeCards()
	{
		
	}
	public void fill (Deck deck)
	{
		for(int i=0; i<=5; i++)
		{
			this.addCard(deck.pop());
		}
	}
	public Card pop ()
	{
		if (this.size() == 1)
		{
			System.out.println("mabrook yasta");
			return super.pop();
		}
		else 
			{
			return super.pop();
			}
	}

}
