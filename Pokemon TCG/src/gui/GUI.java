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

import listeners.HandListener;
import main.Card;
import main.Deck;
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
	private HandArea area1;
	private Player player1;
	private Player player2;

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
	public GUI(Player player1,Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmTest = new JFrame();
		frmTest.setMinimumSize(new Dimension(1920, 1080));
		frmTest.setSize(new Dimension(700, 800));
		frmTest.setTitle("Pokemon");
		frmTest.setResizable(true);

		 try {
		 frmTest.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new
		 File("res/bg3.jpg")))));
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		 
		 player1 = new Player(new Deck(), new PrizeCards(),"player1");
		 player2 = new Player(new Deck(), new PrizeCards(),"player2");

		frmTest.setForeground(new Color(135, 206, 250));
		frmTest.getContentPane().setBackground(Color.WHITE);
		
		

		HandArea area2 = new HandArea(player2);
		area2.setBounds(680, 30, 560, 160);
		frmTest.add(area2);
		area2.addNCards(player2.hand.getHand());

		JButton prz2Btn = new JButton();
		prz2Btn.setBounds(1300, 30, 100, 140);
		prz2Btn.setMinimumSize(new Dimension(150, 200));
		prz2Btn.setMaximumSize(new Dimension(150, 200));
		prz2Btn.setIcon(new ImageIcon("res/pcard.jpg"));
		prz2Btn.setBorder(BorderFactory.createEmptyBorder());
		prz2Btn.setContentAreaFilled(false);
		prz2Btn.addActionListener(new HandListener());
		prz2Btn.addMouseListener(new HandListener());

		prize2Txt = new JTextField();
		prize2Txt.setBounds(1340, 180, 22, 20);
		prize2Txt.setColumns(2);

		BenchArea bench2 = new BenchArea();
		frmTest.add(bench2);
		bench2.setBounds(680, 200, 550, 156);

		JButton deck2Btn = new JButton();
		deck2Btn.setBounds(550, 370, 100, 140);
		deck2Btn.setMinimumSize(new Dimension(150, 200));
		deck2Btn.setMaximumSize(new Dimension(150, 200));
		deck2Btn.setIcon(new ImageIcon("res/card.jpg"));
		deck2Btn.setBorder(BorderFactory.createEmptyBorder());
		deck2Btn.setContentAreaFilled(false);

		deck2Txt = new JTextField();
		deck2Txt.setBounds(590, 520, 22, 20);
		deck2Txt.setColumns(2);

		JButton dis2Btn = new JButton("Discard Pile\r\n");
		dis2Btn.setBounds(550, 200, 100, 140);
		dis2Btn.setMinimumSize(new Dimension(150, 200));
		dis2Btn.setMaximumSize(new Dimension(150, 200));
		dis2Btn.setIcon(new ImageIcon("res/discard.jpg"));
		dis2Btn.setBorder(BorderFactory.createEmptyBorder());
		dis2Btn.setContentAreaFilled(false);

		ActivePokemon act2Btn = new ActivePokemon(player2.active);
		act2Btn.setBounds(910, 370, 100, 140);
		act2Btn.setForeground(new Color(210, 105, 30));
		act2Btn.setMinimumSize(new Dimension(150, 200));
		act2Btn.setMaximumSize(new Dimension(150, 200));

		ActivePokemon act1Btn = new ActivePokemon(player1.active);
		act1Btn.setBounds(910, 570, 100, 140);
		act1Btn.setMinimumSize(new Dimension(150, 200));
		act1Btn.setMaximumSize(new Dimension(150, 200));

		BenchArea bench = new BenchArea();
		frmTest.add(bench);
		bench.setBounds(680, 740, 550, 156);

		JButton dis1Btn = new JButton("Discard Pile");
		dis1Btn.setBounds(1260, 740, 100, 140);
		dis1Btn.setMinimumSize(new Dimension(150, 200));
		dis1Btn.setMaximumSize(new Dimension(150, 200));
		dis1Btn.setIcon(new ImageIcon("res/discard.jpg"));
		dis1Btn.setBorder(BorderFactory.createEmptyBorder());
		dis1Btn.setContentAreaFilled(false);

		JButton deck1Btn = new JButton();
		deck1Btn.setBounds(1260, 570, 100, 140);
		deck1Btn.setMinimumSize(new Dimension(150, 200));
		deck1Btn.setMaximumSize(new Dimension(150, 200));
		deck1Btn.setIcon(new ImageIcon("res/card.jpg"));
		deck1Btn.setBorder(BorderFactory.createEmptyBorder());
		deck1Btn.setContentAreaFilled(false);

		deck1Txt = new JTextField();
		deck1Txt.setBounds(1300, 540, 22, 20);
		deck1Txt.setColumns(2);

		area1 = new HandArea(player1);

		area1.setBounds(680, 890, 560, 160);
		frmTest.add(area1);
		area1.addNCards(player1.hand.getHand());

		JButton prz1Btn = new JButton();
		prz1Btn.setBounds(550, 900, 100, 140);

		prz1Btn.setMinimumSize(new Dimension(150, 200));
		prz1Btn.setMaximumSize(new Dimension(150, 200));
		prz1Btn.setIcon(new ImageIcon("res/pcard.jpg"));
		prz1Btn.setBorder(BorderFactory.createEmptyBorder());
		prz1Btn.setContentAreaFilled(false);

		prize1Txt = new JTextField();
		prize1Txt.setBounds(590, 870, 22, 20);

		prize1Txt.setColumns(2);

		JLabel lblImage = new JLabel("");
		lblImage.setBounds(233, 390, 214, 300);
		lblImage.setIcon(new ImageIcon("res/cardback.jpg"));

		frmTest.getContentPane().setLayout(null);

		frmTest.getContentPane().add(lblImage);
		frmTest.getContentPane().add(dis2Btn);

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

		frmTest.getContentPane().add(dis1Btn);

		frmTest.setBounds(100, 100, 300, 300);
		frmTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public HandArea getArea1() {
		return area1;
	}

	public void setArea1(HandArea area1) {
		this.area1 = area1;
	}
}
