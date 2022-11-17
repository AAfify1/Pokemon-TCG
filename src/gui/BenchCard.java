package gui;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import main.Card;
import main.Player;
import pokemons.Pokemon;

public class BenchCard extends JButton {
	
	
		private Card card;
		private Player player;
		
		public BenchCard(Player player,Card card)
		{
			super();
			this.card = card;
			this.player = player;
			setName(card.getName());
			setPreferredSize(new Dimension(100, 140));
			String path = "res/" + card.getName().toLowerCase() + ".jpg";
			setIcon(new ImageIcon(path));
			
		}
		public Card getCard()
		{
			return card;
		}
		public Player getPlayer() {
			return player;
		}
		public Pokemon getPokemon()
		{
			return (Pokemon) card;
		}
	}
	