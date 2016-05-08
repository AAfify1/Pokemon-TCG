package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import main.GameManager;
import pokemons.Pokemon;

public class RetreatListenerr implements ActionListener, MouseListener {
	
	private GameManager game;
	
	private Boolean retreat = false;
	
	
	public RetreatListenerr (GameManager game)
	{
		this.game = game;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {

		if (game.getPlayer1().getActive()&& game.getGui().getBench1().getBenchCards().size()!=0)
		{
			int cost = game.getPlayer1().active.getRetreatCost();
			int has = game.getPlayer1().active.getEnergies().size();
			 if (has>=cost)
			 {
				 retreat = true;
				 
				 
			 }
			
		}
		else if (game.getPlayer2().getActive()&& game.getGui().getBench2().getBenchCards().size()!=0)
		{
			int cost = game.getPlayer2().active.getRetreatCost();
			int has = game.getPlayer2().active.getEnergies().size();
			 if (has>=cost)
			 {
				 retreat = true;
				 
				
			 }
			
		}
		
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
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public Boolean getRetreat() {
		return retreat;
	}

	public void setRetreat(Boolean retreat) {
		this.retreat = retreat;
	}

	
}
