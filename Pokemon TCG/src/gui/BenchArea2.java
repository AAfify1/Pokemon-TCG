package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import main.Card;
import main.Player;

import listeners.BenchListener;

public class BenchArea2 extends JScrollPane {
	private ArrayList<BenchCard> BenchCards;

	private JPanel cardPanel;
	private Player player;
	private BenchListener BenchListener;

	public ArrayList<BenchCard> getBenchCards() {
		return BenchCards;
	}
	
	public BenchListener getBenchListener() {
		return BenchListener;
	}

	public void setBenchListener(BenchListener BenchListener) {
		this.BenchListener = BenchListener;
	}


	public BenchArea2(Player player) {
		super();
		this.player = player;
		BenchCards = new ArrayList<BenchCard>();

		cardPanel = new JPanel();
		cardPanel.setLayout(new FlowLayout());
		cardPanel.setOpaque(false);
		cardPanel.setSize(new Dimension(670, 111));

		setViewportView(cardPanel);
		getViewport().setOpaque(false);
		setOpaque(true);
		setBorder(BorderFactory.createEmptyBorder());
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		setSize(new Dimension(670, 111));
	}

	public void addCard(Card c) {
		BenchCard card = new BenchCard(player);
		card.setCard(c);
		card.addActionListener(BenchListener);
		card.addMouseListener(BenchListener);

		BenchCards.add(card);
		cardPanel.add(card);
		updateUI();
	}


	public void removeCard(JButton b) {
		cardPanel.remove(b);
		updateUI();
	}

	public void removeAllCards() {
		for (JButton b : BenchCards)
			removeCard(b);
		BenchCards.clear();
	}

}