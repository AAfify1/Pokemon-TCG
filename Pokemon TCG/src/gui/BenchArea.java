//package gui;
//
//import javax.swing.JPanel;
//import javax.swing.JButton;
//import javax.swing.border.EmptyBorder;
//
//import main.Card;
//import main.Player;
//
//public class BenchArea extends JPanel {
//	
//	private Player player;
//	
//			
//	public BenchArea(Player player) {
//		setLayout(null);
//		setOpaque(false);
//		this.player = player;
//		
//		
//		BenchCard btnNewButton = new BenchCard(player);
//		btnNewButton.setBounds(10, 11, 100, 140);
//		add(btnNewButton);
//		
//		BenchCard button =new BenchCard(player);
//		button.setBounds(120, 11, 100, 140);
//		add(button);
//		
//		BenchCard button_1 = new BenchCard(player);
//		button_1.setBounds(230, 11, 100, 140);
//		add(button_1);
//		
//		BenchCard button_2 = new BenchCard(player);
//		button_2.setBounds(340, 11, 100, 140);
//		add(button_2);
//		
//		BenchCard button_3 = new BenchCard(player);
//		button_3.setBounds(450, 11, 100, 140);
//		add(button_3);
//	}
//}
