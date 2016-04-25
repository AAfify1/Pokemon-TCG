package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class BenchArea extends JPanel {
	public BenchArea() {
		setLayout(null);
		setOpaque(false);
		
		JButton btnNewButton = new JButton("Bench");
		btnNewButton.setBounds(10, 11, 100, 140);
		add(btnNewButton);
		
		JButton button = new JButton("Bench");
		button.setBounds(120, 11, 100, 140);
		add(button);
		
		JButton button_1 = new JButton("Bench");
		button_1.setBounds(230, 11, 100, 140);
		add(button_1);
		
		JButton button_2 = new JButton("Bench");
		button_2.setBounds(340, 11, 100, 140);
		add(button_2);
		
		JButton button_3 = new JButton("Bench");
		button_3.setBounds(450, 11, 100, 140);
		add(button_3);
	}
}
