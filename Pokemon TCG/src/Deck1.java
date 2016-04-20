


public class Deck1 extends Deck {
	
	Deck deck = new Deck();
	Deck1()
	{

		
		Articuno articuno1 = new Articuno();
		Pikachu pika1 = new Pikachu();
		Spearow spearow1 = new Spearow();
		Electricity elec1 = new Electricity();
		Water water1 = new Water();
		deck.addCard(pika1);
		deck.addCard(articuno1);
		deck.addCard(elec1);
		deck.addCard(spearow1);
		deck.addCard(water1);
		deck.shuffle();
	}
	public Deck getDeck() {
		return deck;
	}
	
}
	
	
    