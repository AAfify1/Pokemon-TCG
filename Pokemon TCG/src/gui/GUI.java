package gui;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;

import java.awt.Dimension;
import java.awt.Rectangle;
import net.miginfocom.swing.MigLayout;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import main.Card;
import main.Deck1;
import main.Deck2;
import main.Hand;
import main.Player;
import main.PrizeCards;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class GUI {

	private JFrame frmTest;
	private JTextField deck2Txt;
	private JTextField deck1Txt;
	private JTextField prize2Txt;
	private JTextField prize1Txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Player player1 = new Player(new Deck1(),new PrizeCards(),"player1");
		Player player2 = new Player(new Deck2(),new PrizeCards(),"player2");
		
		frmTest = new JFrame();
		frmTest.setMinimumSize(new Dimension(1920, 1080));
		frmTest.setSize(new Dimension(700, 800));
		frmTest.setTitle("Pokemon");

		 try {
		 frmTest.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new
		 File("res/bg3.jpg")))));
		 } catch (IOException e) {
		 e.printStackTrace();
		 }

		frmTest.setForeground(new Color(135, 206, 250));
		frmTest.getContentPane().setBackground(Color.WHITE);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(615, 866, 738, 165);
		frmTest.getContentPane().add(scrollPane);

		JPanel handPanel1 = new JPanel();
		scrollPane.add(handPanel1);
		scrollPane.setViewportView(handPanel1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(583, 32, 738, 165);
		frmTest.getContentPane().add(scrollPane_1);
		
		JPanel handPanel2 = new JPanel();
		scrollPane_1.add(handPanel2);
		scrollPane_1.setViewportView(handPanel2);

		
		for (int i = 0; i < player1.hand.getSize() - 1; i++) {
			HandCard x = player1.hand.get(i);
			handPanel1.add(x);

		}
		for (int i = 0; i < player2.hand.getSize() - 1; i++) {
			HandCard x = player2.hand.get(i);
			handPanel2.add(x);

		}

		JLabel lblImage = new JLabel("");
		lblImage.setBounds(10, 392, 214, 300);
		lblImage.setIcon(new ImageIcon("res/cardback.jpg"));

		JButton dis2Btn = new JButton("Discard Pile\r\n");
		dis2Btn.setBounds(544, 238, 100, 140);
		dis2Btn.setMinimumSize(new Dimension(150, 200));
		dis2Btn.setMaximumSize(new Dimension(150, 200));
		dis2Btn.setIcon(new ImageIcon("res/discard.jpg"));
		dis2Btn.setBorder(BorderFactory.createEmptyBorder());
		dis2Btn.setContentAreaFilled(false);

		JButton bench21Btn = new JButton("Bench");
		bench21Btn.setBounds(682, 238, 100, 140);
		bench21Btn.setMinimumSize(new Dimension(150, 200));
		bench21Btn.setMaximumSize(new Dimension(150, 200));

		JButton bench22Btn = new JButton("Bench");
		bench22Btn.setBounds(792, 238, 100, 140);
		bench22Btn.setMinimumSize(new Dimension(150, 200));
		bench22Btn.setMaximumSize(new Dimension(150, 200));

		JButton bench23Btn = new JButton("Bench");
		bench23Btn.setBounds(902, 238, 100, 140);
		bench23Btn.setMinimumSize(new Dimension(150, 200));
		bench23Btn.setMaximumSize(new Dimension(150, 200));

		JButton bench24Btn = new JButton("Bench");
		bench24Btn.setBounds(1012, 238, 100, 140);
		bench24Btn.setMinimumSize(new Dimension(150, 200));
		bench24Btn.setMaximumSize(new Dimension(150, 200));

		JButton bench25Btn = new JButton("Bench");
		bench25Btn.setBounds(1122, 238, 100, 140);
		bench25Btn.setMinimumSize(new Dimension(150, 200));
		bench25Btn.setMaximumSize(new Dimension(150, 200));

		JButton prz2Btn = new JButton();
		prz2Btn.setBounds(1384, 32, 100, 141);
		prz2Btn.setMinimumSize(new Dimension(150, 200));
		prz2Btn.setMaximumSize(new Dimension(150, 200));
		prz2Btn.setIcon(new ImageIcon("res/pcard.jpg"));
		prz2Btn.setBorder(BorderFactory.createEmptyBorder());
		prz2Btn.setContentAreaFilled(false);

		prize2Txt = new JTextField();
		prize2Txt.setBounds(1723, 183, 22, 20);
		prize2Txt.setText(String.valueOf(player2.prize.size()));
		prize2Txt.setColumns(2);

		JButton deck2Btn = new JButton();
		deck2Btn.setBounds(554, 389, 100, 140);
		deck2Btn.setMinimumSize(new Dimension(150, 200));
		deck2Btn.setMaximumSize(new Dimension(150, 200));
		deck2Btn.setIcon(new ImageIcon("res/card.jpg"));
		deck2Btn.setBorder(BorderFactory.createEmptyBorder());
		deck2Btn.setContentAreaFilled(false);
		deck2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Execute when button is pressed

				player2.draw();
				int hand2Cnt = player2.hand.getSize();				
				HandCard drawn = player2.hand.get(hand2Cnt - 1);
				handPanel2.add(drawn);
				handPanel2.revalidate();
				scrollPane_1.revalidate();
				
				deck2Txt.setText(String.valueOf(player2.deck.size()));

			}
		});

		JButton act2Btn = new JButton("Active Pokemon");
		act2Btn.setBounds(902, 389, 100, 140);
		act2Btn.setForeground(new Color(210, 105, 30));
		act2Btn.setMinimumSize(new Dimension(150, 200));
		act2Btn.setMaximumSize(new Dimension(150, 200));

		deck2Txt = new JTextField();
		deck2Txt.setBounds(600, 540, 22, 20);
		deck2Txt.setColumns(2);
		deck2Txt.setText(String.valueOf(player2.deck.size()));

		deck1Txt = new JTextField();
		deck1Txt.setBounds(1288, 500, 22, 20);
		deck1Txt.setColumns(2);
		deck1Txt.setText(String.valueOf(player1.deck.size()));

		ActivePokemon act1Btn = new ActivePokemon(player1.active);
		act1Btn.setBounds(902, 540, 100, 140);
		act1Btn.setMinimumSize(new Dimension(150, 200));
		act1Btn.setMaximumSize(new Dimension(150, 200));
		

		JButton deck1Btn = new JButton();
		deck1Btn.setBounds(1253, 540, 100, 140);
		deck1Btn.setMinimumSize(new Dimension(150, 200));
		deck1Btn.setMaximumSize(new Dimension(150, 200));
		deck1Btn.setIcon(new ImageIcon("res/card.jpg"));
		deck1Btn.setBorder(BorderFactory.createEmptyBorder());
		deck1Btn.setContentAreaFilled(false);
		deck1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Execute when button is pressed

				player1.draw();
				int hand1Cnt = player1.hand.getSize();				
				HandCard drawn = player1.hand.get(hand1Cnt - 1);
				handPanel1.add(drawn);
				handPanel1.revalidate();
				scrollPane.revalidate();
				act1Btn.revalidate();


				deck1Txt.setText(String.valueOf(player1.deck.size()));

			}
		});

		prize1Txt = new JTextField();
		prize1Txt.setBounds(419, 632, 22, 20);
		prize1Txt.setText(String.valueOf(player1.prize.size()));
		prize1Txt.setColumns(2);

		JButton prz1Btn = new JButton();
		prz1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		prz1Btn.setBounds(544, 691, 100, 140);
		
		prz1Btn.setMinimumSize(new Dimension(150, 200));
		prz1Btn.setMaximumSize(new Dimension(150, 200));
		prz1Btn.setIcon(new ImageIcon("res/pcard.jpg"));
		prz1Btn.setBorder(BorderFactory.createEmptyBorder());
		prz1Btn.setContentAreaFilled(false);

		JButton bench11Btn = new JButton("Bench");
		bench11Btn.setBounds(682, 691, 100, 140);
		bench11Btn.setMinimumSize(new Dimension(150, 200));
		bench11Btn.setMaximumSize(new Dimension(150, 200));

		JButton bench12Btn = new JButton("Bench");
		bench12Btn.setBounds(792, 691, 100, 140);
		bench12Btn.setMinimumSize(new Dimension(150, 200));
		bench12Btn.setMaximumSize(new Dimension(150, 200));

		JButton bench13Btn = new JButton("Bench");
		bench13Btn.setBounds(902, 691, 100, 140);
		bench13Btn.setMinimumSize(new Dimension(150, 200));
		bench13Btn.setMaximumSize(new Dimension(150, 200));

		JButton bench14Btn = new JButton("Bench");
		bench14Btn.setBounds(1012, 691, 100, 140);
		bench14Btn.setMinimumSize(new Dimension(150, 200));
		bench14Btn.setMaximumSize(new Dimension(150, 200));

		JButton bench15Btn = new JButton("Bench");
		bench15Btn.setBounds(1122, 691, 100, 140);
		bench15Btn.setMinimumSize(new Dimension(150, 200));
		bench15Btn.setMaximumSize(new Dimension(150, 200));

		JButton dis1Btn = new JButton("Discard Pile");
		dis1Btn.setBounds(1253, 691, 100, 140);
		dis1Btn.setMinimumSize(new Dimension(150, 200));
		dis1Btn.setMaximumSize(new Dimension(150, 200));
		dis1Btn.setIcon(new ImageIcon("res/discard.jpg"));
		dis1Btn.setBorder(BorderFactory.createEmptyBorder());
		dis1Btn.setContentAreaFilled(false);
		frmTest.getContentPane().setLayout(null);
		
		frmTest.getContentPane().add(lblImage);
		frmTest.getContentPane().add(dis2Btn);
		frmTest.getContentPane().add(bench21Btn);
		frmTest.getContentPane().add(bench22Btn);
		frmTest.getContentPane().add(bench23Btn);
		frmTest.getContentPane().add(bench24Btn);
		frmTest.getContentPane().add(bench25Btn);
		frmTest.getContentPane().add(prz2Btn);
		frmTest.getContentPane().add(prize2Txt);
		frmTest.getContentPane().add(deck2Btn);
		frmTest.getContentPane().add(act2Btn);
		frmTest.getContentPane().add(deck2Txt);
		frmTest.getContentPane().add(deck1Txt);
		frmTest.getContentPane().add(act1Btn);
		frmTest.getContentPane().add(deck1Btn);
		frmTest.getContentPane().add(prize1Txt);
		frmTest.getContentPane().add(prz1Btn);
		frmTest.getContentPane().add(bench11Btn);
		frmTest.getContentPane().add(bench12Btn);
		frmTest.getContentPane().add(bench13Btn);
		frmTest.getContentPane().add(bench14Btn);
		frmTest.getContentPane().add(bench15Btn);
		frmTest.getContentPane().add(dis1Btn);
		
		

		frmTest.setBounds(100, 100, 300, 300);
		frmTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
