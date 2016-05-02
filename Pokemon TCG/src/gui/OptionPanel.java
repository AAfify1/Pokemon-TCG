package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

import main.GameManager;
import pokemons.Pokemon;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OptionPanel extends JPanel {
	
	
	private GameManager game;
	private Pokemon pokemon;
	
	
	
	public OptionPanel(GameManager game) {
		
		this.game = game;
			
		setSize(new Dimension(300, 95));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setOpaque(false);
		
		
		
		
	}
		
		public void updateOptions()
		{
			if(game.getPlayer1().getActive())
			{
				pokemon = game.getPlayer1().active;
			}
			else if(game.getPlayer2().getActive())
			{
				pokemon = game.getPlayer2().active;
			}
			for(int i=0; i<pokemon.getAttackButtons().size();i++)
			{
				AttackButton button = pokemon.getAttackButtons().get(i);
				
				add(button);
				updateUI();
			}
			RetreatButton retreat = new RetreatButton();
			add(retreat);
		}
		
		
	}


