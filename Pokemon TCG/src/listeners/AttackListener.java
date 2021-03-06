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
	private Boolean fatality = false;

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
				
				if(defendingPokemon.getDead()&& game.getGui().getBench2().getBenchCards().size()!=0)
				{
					setFatality(true);
					game.getGui().getActArea2().removePokemon();
					game.getPlayer1().hand.drawP();
					
				}
				else{
					game.endTurn();
					System.out.println(defendingPokemon.getName() + ": " + String.valueOf(defendingPokemon.getHP()));
				}

				
			}
		}

		else if ( game.getPlayer2().getActive()) {

			Pokemon attackingPokemon = game.getGui().getActArea2().getPokemon().getPokemon();
			Pokemon defendingPokemon = game.getGui().getActArea1().getPokemon().getPokemon();
			
			

			if (attackButton.getAttack().canAttack(attackingPokemon)) {
				attackButton.getAttack().Fight(attackingPokemon, defendingPokemon);
				
				if(defendingPokemon.getDead()&& game.getGui().getBench1().getBenchCards().size()!=0)
				{
					setFatality(true);
					game.getGui().getActArea1().removePokemon();
					game.getPlayer2().hand.drawP();
				}

				else{
					game.endTurn();
					System.out.println(defendingPokemon.getName() + ": " + String.valueOf(defendingPokemon.getHP()));
				}
			}
		}
		
	}

	public Boolean getFatality() {
		return fatality;
	}

	public void setFatality(Boolean fatality) {
		this.fatality = fatality;
	}

}
