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
		Pikachu pika2 = new Pikachu();
		Pikachu pika3 = new Pikachu();
		Pikachu pika4 = new Pikachu();
		Pikachu pika5 = new Pikachu();
		Pikachu pika6 = new Pikachu();
		Pikachu pika7 = new Pikachu();
		Pikachu pika8 = new Pikachu();
		Pikachu pika9 = new Pikachu();
		Pikachu pika10 = new Pikachu();
		Pikachu pika11 = new Pikachu();
		Spearow spearow1 = new Spearow();
		Electricity elec1 = new Electricity();
		Water water1 = new Water();
		this.addCard(pika1);
		this.addCard(pika2);
		this.addCard(elec1);
		this.addCard(pika3);
		this.addCard(water1);
		this.addCard(pika4);
		this.addCard(articuno1);
		this.addCard(elec1);
		this.addCard(spearow1);
		this.addCard(water1);
		this.addCard(pika5);
		this.addCard(pika6);
		this.addCard(pika7);
		this.addCard(pika8);
		this.addCard(pika9);
		this.addCard(pika10);
		this.addCard(pika11);
		this.addCard(elec1);
		this.addCard(elec1);
		this.addCard(elec1);
		this.addCard(water1);
		this.addCard(water1);
		this.addCard(water1);
		this.addCard(elec1);
		
//		this.addCard(articuno1);
//		this.addCard(elec1);
//		this.addCard(spearow1);
//		this.addCard(water1);
//		this.addCard(pika1);
//		this.addCard(articuno1);
//		this.addCard(elec1);
//		this.addCard(spearow1);
//		this.addCard(water1);
//		this.addCard(water1);
//		this.addCard(pika1);
//		this.addCard(articuno1);
//		this.addCard(elec1);
//		this.addCard(spearow1);
//		this.addCard(water1);
		this.shuffle();
	}
	public Deck getDeck() {
		return this;
	}
	
}
	
	
    