package gui;

import java.awt.Dimension;

import javax.swing.JButton;

import pokemons.Pokemon;



public class RetreatButton extends JButton {
	
private Pokemon pokemon;
	
	public RetreatButton(Pokemon pokemon)
	{	
		super("Retreat");
		setPreferredSize(new Dimension(150,15));
		setVisible(true);
		this.pokemon = pokemon;
		
		
	}

}
