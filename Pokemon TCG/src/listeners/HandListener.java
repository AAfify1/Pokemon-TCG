package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import energy.Energy;
import gui.ActivePokemon;
import gui.GUI;
import gui.HandCard;
import main.Card;
import main.GameManager;
import main.Player;
import pokemons.Pokemon;

public class HandListener implements ActionListener, MouseListener {

	private GameManager game;
	private String firstHandClick = "";
	private HandCard energy;

	public String getFirstHandClick() {
		return firstHandClick;
	}

	public void setFirstHandClick(String firstHandClick) {
		this.firstHandClick = firstHandClick;
	}

	private MouseEvent secondClick;

	public HandListener(GameManager game) {
		this.game = game;

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		HandCard card = (HandCard) e.getSource();
		Player player = card.getPlayer();

		if (card.getCard() instanceof Pokemon) {
			if (game.getTurn() == 0) {

				if (!(game.getPlayer1().getHasActive())&& player.getName().equals(game.getPlayer1().getName())) {

					Card cardd = card.getCard();
					ActivePokemon active = new ActivePokemon(player, cardd);
					game.getGui().getActArea1().setPokemon(active);
					game.getPlayer1().hand.remove(cardd);
					game.getGui().getArea1().removeCard(card);
					game.getPlayer1().setHasActive(true);
					game.getPlayer1().setActive(false);

				} else if (!(game.getPlayer2().getHasActive())
						&& player.getName().equals(game.getPlayer2().getName())) {

					Card cardd = card.getCard();
					ActivePokemon active = new ActivePokemon(player, cardd);
					game.getGui().getActArea2().setPokemon(active);
					game.getPlayer2().hand.remove(cardd);
					game.getGui().getArea2().removeCard(card);
					game.getPlayer2().setHasActive(true);
					game.getPlayer2().setActive(false);

				}

			}

			else if (player.getName().equals(game.getPlayer1().getName()) && player.getActive()) {

				if (game.getGui().getBench1().getBenchCards().size() < 5) {

					Card cardd = card.getCard();
					game.getGui().getBench1().addCard(cardd);
					game.getPlayer1().hand.remove(cardd);
					game.getGui().getArea1().removeCard(card);
				}
			} else if (player.getName().equals(game.getPlayer2().getName()) && player.getActive()) {

				if (game.getGui().getBench2().getBenchCards().size() < 5) {

					Card cardd = card.getCard();
					game.getGui().getBench2().addCard(cardd);
					game.getPlayer2().hand.remove(cardd);
					game.getGui().getArea2().removeCard(card);
				}
			}
		}

		else if (card.getCard() instanceof Energy && !(player.getAddedEnergy())) {
			if (game.getTurn() == 0) {
			}

			else {
				firstHandClick = "Energy";
				energy = card;
				if(player.getName().equals(game.getPlayer2().getName()) && player.getActive())
				{
					game.getPlayer2().setAddedEnergy(true);
				}
				else if (player.getName().equals(game.getPlayer1().getName()) && player.getActive())
				{
					game.getPlayer1().setAddedEnergy(true);
				}
			}
		}
	}

	public HandCard getEnergy() {
		return energy;
	}

	public void setEnergy(HandCard energy) {
		this.energy = energy;
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
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
