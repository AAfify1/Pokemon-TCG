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

if (game.getAttackListner().getFatality()&& game.getPlayer2().getActive())
{
	ActivePokemon act = new ActivePokemon(game.getPlayer1(),pokemon);
	
	game.getGui().getActArea1().setPokemon(act);
	game.getGui().getBench1().removeCard(pokeCard);
	game.getGui().getBench1().getBenchCards().remove(pokeCard);
	game.getAttackListner().setFatality(false);
	game.getGui().getOptions().updateOptions();
	game.endTurn();
	
}
else if (game.getAttackListner().getFatality()&& game.getPlayer1().getActive())
{
	ActivePokemon act = new ActivePokemon(game.getPlayer2(),pokemon);
	game.getGui().getActArea2().removePokemon();
	game.getGui().getActArea2().setPokemon(act);
	game.getGui().getBench2().removeCard(pokeCard);
	game.getGui().getBench2().getBenchCards().remove(pokeCard);
	game.getAttackListner().setFatality(false);
	game.getGui().getOptions().updateOptions();
	game.endTurn();
	
}
	
else if (game.getRetreatListner().getRetreat()&& game.getPlayer1().getActive() && game.getPlayer1().getCanRetreat())
	{
		Pokemon temp = game.getPlayer1().active;
		for (int i=0 ; i< temp.getRetreatCost();i++)
		{
			temp.getEnergies().remove(i);
		}
		game.getGui().getActArea1().removePokemon();
		game.getGui().getActArea1().setPokemon(new ActivePokemon(game.getPlayer1(),pokemon));
		game.getGui().getBench1().removeCard(pokeCard);
		game.getGui().getBench1().getBenchCards().remove(pokeCard);
		game.getGui().getBench1().addCard(temp);
		game.getRetreatListner().setRetreat(false);
		game.getGui().getOptions().updateOptions();
		game.getPlayer1().setCanRetreat(false);
		
	}
	
	else if (game.getRetreatListner().getRetreat()&& game.getPlayer2().getActive() && game.getPlayer2().getCanRetreat())
	{
		Pokemon temp = game.getPlayer2().active;
		for (int i=0 ; i< temp.getRetreatCost();i++)
		{
			temp.getEnergies().remove(i);
		}
		game.getGui().getActArea2().removePokemon();
		game.getGui().getActArea2().setPokemon(new ActivePokemon(game.getPlayer2(),pokemon));
		game.getGui().getBench2().removeCard(pokeCard);
		game.getGui().getBench2().getBenchCards().remove(pokeCard);
		game.getGui().getBench2().addCard(temp);
		game.getRetreatListner().setRetreat(false);
		game.getGui().getOptions().updateOptions();
		game.getPlayer2().setCanRetreat(false);
		
		
	}
	
	
	else if (game.getHandListener().getFirstHandClick().equals("Energy")) {

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
