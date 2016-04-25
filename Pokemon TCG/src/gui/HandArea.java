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

public class HandArea extends JScrollPane {
	private ArrayList<HandCard> handCards;

	private JPanel cardPanel;
	private Player player;

	public ArrayList<HandCard> getHandCards() {
		return handCards;
	}

	public HandArea(Player player) {
		super();
		this.player = player;
		handCards = new ArrayList<HandCard>();

		cardPanel = new JPanel();
		cardPanel.setLayout(new FlowLayout());
		cardPanel.setOpaque(true);
		cardPanel.setSize(new Dimension(670, 111));

		setViewportView(cardPanel);
		getViewport().setOpaque(false);
		setOpaque(false);
		setBorder(BorderFactory.createEmptyBorder());
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		setSize(new Dimension(670, 111));
	}

	public void addCard(Card c) {
		HandCard card = new HandCard(player,c);

		handCards.add(card);
		cardPanel.add(card);
		updateUI();
	}

	public void addNCards(ArrayList<Card> c) {
		for (Card x : c)
			addCard(x);
	}

	public void removeCard(JButton b) {
		cardPanel.remove(b);
		updateUI();
	}

	public void removeAllCards() {
		for (JButton b : handCards)
			removeCard(b);
		handCards.clear();
	}

}