package main;

import energy.Electricity;
import energy.Water;
import pokemons.Articuno;
import pokemons.Pikachu;
import pokemons.Spearow;

public class Deck1 extends Deck {
	
	
	public Deck1()
	{

		
		Articuno articuno1 = new Articuno();
		Pikachu pika1 = new Pikachu();
		Spearow spearow1 = new Spearow();
		Electricity elec1 = new Electricity();
		Water water1 = new Water();
		this.addCard(pika1);
		this.addCard(articuno1);
		this.addCard(elec1);
		this.addCard(spearow1);
		this.addCard(water1);
		this.shuffle();
	}
	public Deck getDeck() {
		return this;
	}
	
}
	
	
    