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

import listeners.ActiveListener;
import listeners.BenchListener;
import listeners.HandListener;
import main.Card;
import main.Deck;
import main.Deck1;
import main.Deck2;
import main.GameManager;
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
	private HandArea area2;
	private Player player1;
	private Player player2;
	private CardOverview card;
	private HandListener handListener;
	private ActiveListener activeListener;
	private BenchListener benchListener;
	private BenchArea bench2;
	private BenchArea bench1;
	private GameManager game;
	private ActiveArea actArea2;
	private ActiveArea actArea1;
	private OptionPanel options;
	private EnergyArea energyArea;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUI window = new GUI();
//					window.frmTest.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public JTextField getDeck2Txt() {
		return deck2Txt;
	}
	public void setDeck2Txt(JTextField deck2Txt) {
		this.deck2Txt = deck2Txt;
	}
	public JTextField getDeck1Txt() {
		return deck1Txt;
	}
	public void setDeck1Txt(JTextField deck1Txt) {
		this.deck1Txt = deck1Txt;
	}
	public JTextField getPrize2Txt() {
		return prize2Txt;
	}
	public void setPrize2Txt(JTextField prize2Txt) {
		this.prize2Txt = prize2Txt;
	}
	public JTextField getPrize1Txt() {
		return prize1Txt;
	}
	public void setPrize1Txt(JTextField prize1Txt) {
		this.prize1Txt = prize1Txt;
	}
	/**
	 * Create the application.
	 */
	public GUI() {
		
		initialize();
	}
	public GUI(Player player1,Player player2,HandListener handListener,GameManager game) {
		this.player1 = player1;
		this.player2 = player2;
		this.handListener = handListener;
		this.benchListener = new BenchListener(game);
		this.activeListener = new ActiveListener(game);
		this.options = new OptionPanel(game);
		this.energyArea = new EnergyArea(game);
		this.game =game;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {

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
		 
		

		//frmTest.setForeground(new Color(135, 206, 250));
		frmTest.getContentPane().setBackground(Color.WHITE);
		
		

		area2 = new HandArea(player2);
		area2.setBounds(680, 30, 560, 160);
		frmTest.add(area2);
		area2.setHandListener(handListener);
		area2.addNCards(player2.hand.getHand());
		

		JButton prz2Btn = new JButton();
		prz2Btn.setBounds(1300, 30, 100, 140);
		prz2Btn.setMinimumSize(new Dimension(150, 200));
		prz2Btn.setMaximumSize(new Dimension(150, 200));
		prz2Btn.setIcon(new ImageIcon("res/pcard.jpg"));
		prz2Btn.setBorder(BorderFactory.createEmptyBorder());
		prz2Btn.setContentAreaFilled(false);
		
		JButton endTurn = new JButton("END TURN");
		endTurn.setBounds(910,520,100,30);
		frmTest.add(endTurn);
		endTurn.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		   game.endTurn();
		  }
		});
		

		prize2Txt = new JTextField((String.valueOf(player2.prize.size())));
		prize2Txt.setBounds(1340, 180, 22, 20);
		prize2Txt.setColumns(2);

		bench2 = new BenchArea(player2);
		frmTest.add(bench2);
		bench2.setBounds(680, 200, 550, 156);
		bench2.setBenchListener(benchListener);

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

		actArea2 = new ActiveArea(player2);
		actArea2.setBounds(910, 370, 100, 150);
		
		actArea2.setActiveListener(activeListener);

		actArea1 = new ActiveArea(player1);
		actArea1.setBounds(910, 570, 100, 150);
		actArea1.setActiveListener(activeListener);
	

		bench1 = new BenchArea(player1);
		frmTest.add(bench1);
		bench1.setBounds(680, 730, 550, 156);
		bench1.setBenchListener(benchListener);

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
		area1.setHandListener(handListener);

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

		prize1Txt = new JTextField((String.valueOf(player1.prize.size())));
		prize1Txt.setBounds(590, 870, 22, 20);

		prize1Txt.setColumns(2);

		card = new CardOverview();
		card.setLocation(100, 200);
		energyArea.setLocation(100, 650);
		options.setLocation(100, 750);
		//lblImage.setIcon(new ImageIcon("res/cardback.jpg"));

		frmTest.getContentPane().setLayout(null);

		frmTest.getContentPane().add(card);
		frmTest.getContentPane().add(dis2Btn);

		frmTest.getContentPane().add(prz2Btn);
		frmTest.getContentPane().add(prize2Txt);
		frmTest.getContentPane().add(deck2Btn);
		frmTest.getContentPane().add(actArea2);
		frmTest.getContentPane().add(deck2Txt);
		frmTest.getContentPane().add(deck1Txt);
		frmTest.getContentPane().add(actArea1);
		frmTest.getContentPane().add(deck1Btn);
		frmTest.getContentPane().add(prize1Txt);
		frmTest.getContentPane().add(prz1Btn);
		frmTest.getContentPane().add(options);
		frmTest.getContentPane().add(energyArea);

		frmTest.getContentPane().add(dis1Btn);

		frmTest.setBounds(100, 100, 300, 300);
		frmTest.setVisible(true);
		frmTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public EnergyArea getEnergyArea() {
		return energyArea;
	}
	public ActiveArea getActArea2() {
		return actArea2;
	}
	public ActiveArea getActArea1() {
		return actArea1;
	}
	public HandArea getArea2() {
		return area2;
	}
	public BenchArea getBench2() {
		return bench2;
	}
	public void setBench2(BenchArea bench2) {
		this.bench2 = bench2;
	}
	public BenchArea getBench1() {
		return bench1;
	}
	public void setBench1(BenchArea bench1) {
		this.bench1 = bench1;
	}
	public CardOverview getCardOverview() {
		return card;
	}

	public HandArea getArea1() {
		return area1;
	}

	public void setArea1(HandArea area1) {
		this.area1 = area1;
	}
	public OptionPanel getOptions() {
		return options;
	}
	public void setOptions(OptionPanel options) {
		this.options = options;
	}
}
