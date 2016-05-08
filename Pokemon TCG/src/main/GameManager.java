package main;

import java.awt.EventQueue;

import javax.swing.JTextField;

import gui.GUI;
import listeners.ActiveListener;
import listeners.HandListener;
import listeners.RetreatListenerr;

public class GameManager {

	private Player player1 = new Player(new Deck1(), new PrizeCards(), "player1");
	private Player player2 = new Player(new Deck2(), new PrizeCards(), "player2");
	private int turn = 0;
	private GUI gui;
	private HandListener handListener = new HandListener(this);
	private RetreatListenerr retreatListner = new RetreatListenerr(this);
	

	

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
		startGame();
		this.gui = new GUI(player1, player2, handListener,this);
		gui.getDeck1Txt().setText(String.valueOf(player1.deck.size()));
		gui.getDeck2Txt().setText(String.valueOf(player2.deck.size()));
		gui.setPrize1Txt(new JTextField(String.valueOf(player1.prize.size())));
		gui.setPrize2Txt(new JTextField(String.valueOf(player2.prize.size())));
		
	
	}

	public GUI getGui() {
		return gui;
	}

	public void startGame() {
		player1.setActive(false);
		player2.setActive(false);
		
		

	}

	public void endTurn() {
		
		System.out.println(turn);
		
		if(turn==0)
		{
			player1.setActive(true);
			player2.setActive(false);
			turn++;
			player1.hand.draw(player1.deck);
			player1.setAddedEnergy(false);
			player1.setCanRetreat(false);
			gui.getDeck1Txt().setText(String.valueOf(player1.deck.size()));
			gui.getArea1().removeAllCards();
			gui.getArea1().addNCards(player1.hand.getHand());
		}
		
		else{
		
		if (!(turn%2 == 0)) {
			
			player1.setActive(false);
			player2.setActive(true);
			turn++;
			
			player2.hand.draw(player2.deck);
			player2.setAddedEnergy(false);
			player2.setCanRetreat(true);
			gui.getDeck2Txt().setText(String.valueOf(player2.deck.size()));
			gui.getArea2().removeAllCards();
			gui.getArea2().addNCards(player2.hand.getHand());
		} else {
			player1.setActive(true);
			player2.setActive(false);
			turn++;
			player1.hand.draw(player1.deck);
			player1.setAddedEnergy(false);
			player1.setCanRetreat(true);
			gui.getDeck1Txt().setText(String.valueOf(player1.deck.size()));
			gui.getArea1().removeAllCards();
			gui.getArea1().addNCards(player1.hand.getHand());
		}
		}
		getGui().getOptions().updateOptions();
	}

	public int getTurn() {
		return turn;
	}

	public RetreatListenerr getRetreatListner() {
		return retreatListner;
	}

	public void setRetreatListner(RetreatListenerr retreatListner) {
		this.retreatListner = retreatListner;
	}
}
