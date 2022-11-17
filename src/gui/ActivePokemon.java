package gui;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import main.Card;
import main.Player;
import pokemons.Pokemon;

public class ActivePokemon extends JButton{
	private Pokemon pokemon;
	private Player player;
	public ActivePokemon (Player player,Card card)
	{
		super();
		this.player = player;
		pokemon = (Pokemon) card;
		setName(card.getName());
		setPreferredSize(new Dimension(100, 140));
		String path = "res/" + card.getName().toLowerCase() + ".jpg";
		setIcon(new ImageIcon(path));
	}
	public Player getPlayer() {
		return player;
	}
	public Pokemon getPokemon() {
		return pokemon;
	}
	

}
