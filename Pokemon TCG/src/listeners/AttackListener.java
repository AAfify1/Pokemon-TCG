package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import gui.AttackButton;
import main.GameManager;
import pokemons.Pokemon;

public class AttackListener implements ActionListener, MouseListener  {
	
	private GameManager game;

	public AttackListener(GameManager game) {
		this.game = game;

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	AttackButton attackButton = (AttackButton) e.getSource();
	System.out.println("Count of listeners: " + ((JButton) e.getSource()).getActionListeners().length);
		
		if (game.getPlayer1().getActive()) {

			Pokemon attackingPokemon = game.getGui().getActArea1().getPokemon().getPokemon();
			Pokemon defendingPokemon = game.getGui().getActArea2().getPokemon().getPokemon();
			

			if (attackButton.getAttack().canAttack(attackingPokemon)) {
				attackButton.getAttack().Fight(attackingPokemon, defendingPokemon);
				game.endTurn();

				System.out.println(defendingPokemon.getName() + ": " + String.valueOf(defendingPokemon.getHP()));
			}
		}

		else if ( game.getPlayer2().getActive()) {

			Pokemon attackingPokemon = game.getGui().getActArea2().getPokemon().getPokemon();
			Pokemon defendingPokemon = game.getGui().getActArea1().getPokemon().getPokemon();
			
			

			if (attackButton.getAttack().canAttack(attackingPokemon)) {
				attackButton.getAttack().Fight(attackingPokemon, defendingPokemon);
				game.endTurn();

				System.out.println(defendingPokemon.getName() + ": " + String.valueOf(defendingPokemon.getHP()));
			}
		}
		
	}

}
