package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

import listeners.AttackListener;
import listeners.RetreatListenerr;
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
	private RetreatButton retreat;
	private AttackListener attackListener;
	
	
	
	public OptionPanel(GameManager game) {
		
		this.game = game;
			
		setSize(new Dimension(300, 95));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setOpaque(false);
		
		attackListener = game.getAttackListner();
		
		
		
		
		
		
		
	}
	
	public void retreatSetter()
	{
		if(game.getPlayer1().getActive())
		{
			retreat = new RetreatButton(game.getPlayer1().active);
		}
		else if (game.getPlayer2().getActive())
		{
			retreat = new RetreatButton(game.getPlayer2().active);
		}
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
			retreatSetter();
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
			retreat.addMouseListener(game.getRetreatListner());
			retreat.addActionListener(game.getRetreatListner());
			add(retreat);
			attackButtons.clear();
		}
		
		
	}


