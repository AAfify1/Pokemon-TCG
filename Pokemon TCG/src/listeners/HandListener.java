package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import gui.GUI;
import gui.HandCard;
import main.Card;
import main.GameManager;

public class HandListener implements ActionListener, MouseListener {
	
	private GameManager game;
	public HandListener(GameManager game){
		this.game = game;
		
	
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		HandCard card = (HandCard)e.getSource();
		Card cardd = card.getCard();
		game.getGui().getBench1().addCard(cardd);
	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
			game.getGui().getCardOverview()
					.setImageIcon((JButton) e.getSource());
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		game.getGui().getCardOverview()
		.resetImageIcon();
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
		System.out.println("TEst");	
		
		
	}

}
