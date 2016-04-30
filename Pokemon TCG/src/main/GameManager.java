package main;

import java.awt.EventQueue;

import javax.swing.JTextField;

import gui.GUI;
import listeners.ActiveListener;
import listeners.HandListener;

public class GameManager {

	private Player player1 = new Player(new Deck1(), new PrizeCards(), "player1");
	private Player player2 = new Player(new Deck2(), new PrizeCards(), "player2");
	private int turn = 0;
	private GUI gui;
	private HandListener handListener = new HandListener(this);
	

	

	public HandListener getHandListener() {
		return handListener;
	}

	public void setHandListener(HandListener handListener) {
		this.handListener = handListener;
	}

	public Player getPlayer1() {
		return player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public GameManager() {
		this.gui = new GUI(player1, player2, handListener,this);
		gui.setDeck1Txt(new JTextField(String.valueOf(player1.deck.size())));
		gui.setDeck2Txt(new JTextField(String.valueOf(player2.deck.size())));
		gui.setPrize1Txt(new JTextField(String.valueOf(player1.prize.size())));
		gui.setPrize2Txt(new JTextField(String.valueOf(player2.prize.size())));
		
		startGame();
	}

	public GUI getGui() {
		return gui;
	}

	public void startGame() {
		player1.setActive(true);
		player2.setActive(true);
		
		

	}

	public void endTurn() {
		
		if(turn==0)
		{
			player1.setActive(true);
			player2.setActive(false);
			turn++; 
		}
		
		else{
		
		if (player1.getActive()) {
			player1.setActive(false);
			player2.setActive(true);
			turn++;
		} else if (player2.getActive()) {
			player1.setActive(true);
			player2.setActive(false);
			turn++;
		}
		}
	}

	public int getTurn() {
		return turn;
	}
}
