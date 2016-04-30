package gui;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import main.Card;
import pokemons.Pokemon;

public class ActivePokemon extends JButton{
	private Pokemon pokemon;
	public ActivePokemon (Card card)
	{
		super();
		pokemon = (Pokemon) card;
		setName(card.getName());
		setPreferredSize(new Dimension(100, 140));
		String path = "res/" + card.getName().toLowerCase() + ".jpg";
		setIcon(new ImageIcon(path));
	}
	public Pokemon getPokemon() {
		return pokemon;
	}
	

}
