public class Deck2 extends Deck {
	
	
	Deck2()
	{

		
		Articuno articuno1 = new Articuno();
		Pikachu pika1 = new Pikachu();
		Spearow spearow1 = new Spearow();
		Electricity elec1 = new Electricity();
		Water water1 = new Water();
		Bagon bagon1 = new Bagon();
		Dunsparce dunsparce1 = new Dunsparce();
		Fearow fearow1 = new Fearow();
		
		this.addCard(pika1);
		this.addCard(articuno1);
		this.addCard(elec1);
		this.addCard(spearow1);
		this.addCard(water1);
		this.addCard(dunsparce1);
		this.addCard(fearow1);
		this.addCard(bagon1);
		this.shuffle();
	}
	public Deck getDeck() {
		return this;
	}
	
}