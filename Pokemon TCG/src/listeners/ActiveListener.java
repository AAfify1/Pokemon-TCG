package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import energy.Energy;
import gui.ActivePokemon;
import gui.HandCard;
import gui.OptionPanel;
import main.GameManager;
import pokemons.Pokemon;

public class ActiveListener implements ActionListener, MouseListener {

	private GameManager game;

	public ActiveListener(GameManager game) {
		this.game = game;

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		ActivePokemon pokeCard = (ActivePokemon) e.getSource();
		if (game.getHandListener().getFirstHandClick().equals("Energy")) {

			HandCard energyCard = game.getHandListener().getEnergy();
			Energy energy = (Energy) energyCard.getCard();
			if (pokeCard.getPlayer().getName().equals(game.getPlayer1().getName())
					&& pokeCard.getPlayer().getActive()) {
				energy.attach(pokeCard.getPokemon());
				game.getPlayer1().hand.remove(energy);
				game.getGui().getArea1().removeCard(energyCard);
				game.getHandListener().setFirstHandClick("");
			} else if (pokeCard.getPlayer().getName().equals(game.getPlayer2().getName())
					&& pokeCard.getPlayer().getActive()) {
				energy.attach(pokeCard.getPokemon());
				game.getPlayer2().hand.remove(energy);
				game.getGui().getArea2().removeCard(energyCard);
				game.getHandListener().setFirstHandClick("");
			}
		} else {

			if (game.getPlayer1().getName().equals(pokeCard.getPlayer().getName()) && game.getPlayer1().getActive()) {

				Pokemon attackingPokemon = game.getGui().getActArea1().getPokemon().getPokemon();
				Pokemon defendingPokemon = game.getGui().getActArea2().getPokemon().getPokemon();
				
				game.getGui().getOptions().updateOptions();

				if (attackingPokemon.getAttack1().canAttack(attackingPokemon)) {
					attackingPokemon.getAttack1().Fight(attackingPokemon, defendingPokemon);
					game.endTurn();

					System.out.println(defendingPokemon.getName() + ": " + String.valueOf(defendingPokemon.getHP()));
				}
			}

			else if (game.getPlayer2().getName().equals(pokeCard.getPlayer().getName())
					&& game.getPlayer2().getActive()) {

				Pokemon attackingPokemon = game.getGui().getActArea2().getPokemon().getPokemon();
				Pokemon defendingPokemon = game.getGui().getActArea1().getPokemon().getPokemon();
				
				game.getGui().getOptions().updateOptions();

				if (attackingPokemon.getAttack1().canAttack(attackingPokemon)) {
					attackingPokemon.getAttack1().Fight(attackingPokemon, defendingPokemon);
					game.endTurn();

					System.out.println(defendingPokemon.getName() + ": " + String.valueOf(defendingPokemon.getHP()));
				}
			}

		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		game.getGui().getCardOverview().setImageIcon((JButton) e.getSource());

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		game.getGui().getCardOverview().resetImageIcon();

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

	}

}
