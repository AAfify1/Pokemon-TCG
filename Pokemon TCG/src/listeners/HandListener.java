package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import gui.GUI;

public class HandListener implements ActionListener, MouseListener {
	
	private GUI gui;
	public HandListener(GUI gui){
		this.gui = gui;
		
	
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
			gui.getCardOverview()
					.setImageIcon((JButton) e.getSource());
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		gui.getCardOverview()
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
