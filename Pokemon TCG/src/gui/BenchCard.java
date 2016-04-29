package gui;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import main.Card;
import main.Player;

public class BenchCard extends JButton {
	
	
		private Card card;
		private Player player;
		
		public BenchCard(Player player)
		{
			super();
			
		}
		public Card getCard()
		{
			return card;
		}
		public void setCard(Card card )
		{
			this.card = card;
			setName(card.getName());
			setPreferredSize(new Dimension(100, 140));
			String path = "res/" + card.getName().toLowerCase() + ".jpg";
			setIcon(new ImageIcon(path));

		}
	}
	