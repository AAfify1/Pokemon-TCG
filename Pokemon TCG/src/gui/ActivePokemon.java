package gui;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import main.Card;

public class ActivePokemon extends JButton{
	
	public ActivePokemon (Card card)
	{
		super();
		setName(card.getName());
		setPreferredSize(new Dimension(100, 140));
		String path = "res/" + card.getName().toLowerCase() + ".jpg";
		setIcon(new ImageIcon(path));
	}
	public ActivePokemon ()
	{
		super();
		Card card = new Card("card","Placeholder");
		
		setName(card.getName());
		setPreferredSize(new Dimension(100, 140));
		String path = "res/" + card.getName().toLowerCase() + ".jpg";
		setIcon(new ImageIcon(path));
	}
	
	public void setCard(Card card)
	{
		setName(card.getName());
		setPreferredSize(new Dimension(100, 140));
		String path = "res/" + card.getName().toLowerCase() + ".jpg";
		setIcon(new ImageIcon(path));
	}

}
