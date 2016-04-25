//package gui;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JFrame;
//
//import main.Deck1;
//import main.Deck2;
//import main.Player;
//import main.PrizeCards;
//
//public class Board extends JFrame{
//
//}
//deck1Btn.addActionListener(new ActionListener() {
//	public void actionPerformed(ActionEvent e) {
//		// Execute when button is pressed
//
//		player1.draw();
//		int hand1Cnt = player1.hand.getSize();				
//		HandCard drawn = player1.hand.get(hand1Cnt - 1);
//		handPanel1.add(drawn);
//		handPanel1.revalidate();
//		scrollPane.revalidate();
//		act1Btn.revalidate();
//
//
//		deck1Txt.setText(String.valueOf(player1.deck.size()));
//
//	}
//});
//prize1Txt.setText(String.valueOf(player1.prize.size()));
//deck1Txt.setText(String.valueOf(player1.deck.size()));
//deck2Txt.setText(String.valueOf(player2.deck.size()));
//
//deck2Btn.addActionListener(new ActionListener() {
//	public void actionPerformed(ActionEvent e) {
//		// Execute when button is pressed
//
//		player2.draw();
//		int hand2Cnt = player2.hand.getSize();				
//		HandCard drawn = player2.hand.get(hand2Cnt - 1);
//		handPanel2.add(drawn);
//		handPanel2.revalidate();
//		scrollPane_1.revalidate();
//		
//		deck2Txt.setText(String.valueOf(player2.deck.size()));
//
//	}
//});
//prize2Txt.setText(String.valueOf(player2.prize.size()));
//for (int i = 0; i < player1.hand.getSize() - 1; i++) {
//	HandCard x = player1.hand.get(i);
//	handPanel1.add(x);
//
//}
//for (int i = 0; i < player2.hand.getSize() - 1; i++) {
//	HandCard x = player2.hand.get(i);
//	handPanel2.add(x);
//
//}
//Player player1 = new Player(new Deck1(),new PrizeCards(),"player1");
//Player player2 = new Player(new Deck2(),new PrizeCards(),"player2");