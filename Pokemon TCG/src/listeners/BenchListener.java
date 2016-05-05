package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import energy.Energy;
import gui.ActivePokemon;
import gui.BenchCard;
import gui.HandCard;
import main.GameManager;
import pokemons.Pokemon;

public class BenchListener implements ActionListener, MouseListener {

	
	private GameManager game;
	
	public BenchListener(GameManager game){
		this.game = game;
		
	
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	
BenchCard pokeCard = (BenchCard) e.getSource();
Pokemon pokemon = pokeCard.getPokemon();
	
	
	
	
	if (game.getHandListener().getFirstHandClick().equals("Energy")) {

		HandCard energyCard = game.getHandListener().getEnergy();
		Energy energy = (Energy) energyCard.getCard();
		if (pokeCard.getPlayer().getName().equals(game.getPlayer1().getName())
				&& pokeCard.getPlayer().getActive()) {
			energy.attach(pokemon);
			game.getPlayer1().hand.remove(energy);
			game.getGui().getArea1().removeCard(energyCard);
		
			game.getHandListener().setFirstHandClick("");
		} else if (pokeCard.getPlayer().getName().equals(game.getPlayer2().getName())
				&& pokeCard.getPlayer().getActive()) {
			energy.attach(pokemon);
			game.getPlayer2().hand.remove(energy);
			game.getGui().getArea2().removeCard(energyCard);
			
			game.getHandListener().setFirstHandClick("");
		}

	}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		game.getGui().getCardOverview().setImageIcon((JButton) e.getSource());
		BenchCard pokemon = (BenchCard) e.getSource();
		Pokemon pokemon1 = pokemon.getPokemon();
		game.getGui().getEnergyArea().display(pokemon1);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		game.getGui().getCardOverview().resetImageIcon();
		game.getGui().getEnergyArea().clear();
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
