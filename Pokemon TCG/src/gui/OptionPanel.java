package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

import listeners.AttackListener;
import main.GameManager;
import pokemons.Pokemon;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class OptionPanel extends JPanel {
	
	
	private GameManager game;
	private Pokemon pokemon;
	private ArrayList<AttackButton> attackButtons;
	private RetreatButton retreat = new RetreatButton();
	private AttackListener attackListener;
	
	
	
	public OptionPanel(GameManager game) {
		
		this.game = game;
			
		setSize(new Dimension(300, 95));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setOpaque(false);
		
		attackListener =  new AttackListener(game);
		
		
		
		
		
		
		
	}
		
		public void updateOptions()
		{
			removeAll();
			repaint();
			
			if(game.getPlayer1().getActive())
			{
				pokemon = game.getPlayer1().active;
				ArrayList<AttackButton> pokebuttons = pokemon.getAttackButtons();
				attackButtons = new ArrayList<AttackButton>(pokebuttons);
			}
			else if(game.getPlayer2().getActive())
			{
				pokemon = game.getPlayer2().active;
				ArrayList<AttackButton> pokebuttons = pokemon.getAttackButtons();
				attackButtons = new ArrayList<AttackButton>(pokebuttons);
			}
			addButtons();
			
			
		}
		
		private void addButtons()
		{
			for(AttackButton x : attackButtons)
			{
				
			    x.removeActionListener(attackListener);
			    x.removeMouseListener(attackListener);
				x.addActionListener(attackListener);
				x.addMouseListener(attackListener);
				
				add(x);
				updateUI();
			}
			retreat.setVisible(true);
			add(retreat);
			attackButtons.clear();
		}
		
		
	}


