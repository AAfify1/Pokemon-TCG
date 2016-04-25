package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import main.Card;
import main.Player;
import pokemons.Pokemon;

public class HandCard extends JButton{
	
	Card card;
	Player player;
	
	public HandCard(Player player,Card card)
	{
		super();
		this.card = card;
		setName(card.getName());
		setPreferredSize(new Dimension(100, 140));
		String path = "res/" + card.getName().toLowerCase() + ".jpg";
		setIcon(new ImageIcon(path));
		this.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  System.out.println(card.getName());
				  player.setActive(card);
				  
			  } 
			} );
	}
	public Card getCard()
	{
		return card;
	}
	
	
	

}
