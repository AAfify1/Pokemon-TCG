package gui;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
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
		
		Deck1 deck1 = new Deck1();
		Deck2 deck2 = new Deck2();
		Hand hand1 = new Hand();
		hand1.draw(deck1, 3);
		
		PrizeCards prize1 = new PrizeCards();
		prize1.fill(deck1);
		PrizeCards prize2 = new PrizeCards();
		prize2.fill(deck2);
		
		
		frmTest = new JFrame();
		frmTest.setMinimumSize(new Dimension(1150	, 1000));
		frmTest.setSize(new Dimension(700, 800));
		frmTest.setTitle("Pokemon");
		
		
//		try {
//    		frmTest.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("res/bg2.jpg")))));
//    	} catch (IOException e) {
//    		e.printStackTrace();
//    	}
		
		
		frmTest.setForeground(new Color(135, 206, 250));
		frmTest.getContentPane().setBackground(Color.WHITE);
		frmTest.getContentPane().setLayout(new MigLayout("", "[][][][][][][grow][][][][][][][grow][][][][][][grow]", "[][][][][][][][][][][grow][]"));
		
		JPanel handPanel1 = new JPanel();
		frmTest.getContentPane().add(handPanel1, "cell 13 9 7 2,grow");
		handPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		for(int i=0; i<hand1.getSize()-1;i++)
		{
			HandCard x = new HandCard(hand1.getHand().get(i));
			handPanel1.add(x);
			
		}
		
		JLabel lblImage = new JLabel("");
		frmTest.getContentPane().add(lblImage, "flowx,cell 0 0 13 9");
		lblImage.setIcon(new ImageIcon("res/cardback.jpg"));
		
		JButton dis2Btn = new JButton("Discard Pile\r\n");
		dis2Btn.setMinimumSize(new Dimension(200, 265));
		dis2Btn.setMaximumSize(new Dimension(100, 140));
		dis2Btn.setIcon(new ImageIcon("res/discard.jpg"));
		dis2Btn.setBorder(BorderFactory.createEmptyBorder());
		dis2Btn.setContentAreaFilled(false);
		frmTest.getContentPane().add(dis2Btn, "cell 13 0,alignx center,aligny center");
		
		JButton bench21Btn = new JButton("Bench");
		bench21Btn.setMinimumSize(new Dimension(200, 265));
		bench21Btn.setMaximumSize(new Dimension(100, 140));
		frmTest.getContentPane().add(bench21Btn, "cell 14 0");
		
		JButton bench22Btn = new JButton("Bench");
		bench22Btn.setMinimumSize(new Dimension(200, 265));
		bench22Btn.setMaximumSize(new Dimension(100, 140));
		frmTest.getContentPane().add(bench22Btn, "cell 15 0");
		
		JButton bench23Btn = new JButton("Bench");
		bench23Btn.setMinimumSize(new Dimension(200, 265));
		bench23Btn.setMaximumSize(new Dimension(100, 140));
		frmTest.getContentPane().add(bench23Btn, "cell 16 0");
		
		JButton bench24Btn = new JButton("Bench");
		bench24Btn.setMinimumSize(new Dimension(200, 265));
		bench24Btn.setMaximumSize(new Dimension(100, 140));
		frmTest.getContentPane().add(bench24Btn, "cell 17 0");
		
		JButton bench25Btn = new JButton("Bench");
		bench25Btn.setMinimumSize(new Dimension(200, 265));
		bench25Btn.setMaximumSize(new Dimension(100, 140));
		frmTest.getContentPane().add(bench25Btn, "cell 18 0");
				
				JButton prz2Btn = new JButton();
				prz2Btn.setMinimumSize(new Dimension(200, 265));
				prz2Btn.setMaximumSize(new Dimension(100, 140));
				prz2Btn.setIcon(new ImageIcon("res/pcard.jpg"));
				frmTest.getContentPane().add(prz2Btn, "cell 19 0");
				prz2Btn.setBorder(BorderFactory.createEmptyBorder());
				prz2Btn.setContentAreaFilled(false);
				
				prize2Txt = new JTextField();
				prize2Txt.setText(String.valueOf(prize2.size()));
				prize2Txt.setColumns(2);
				frmTest.getContentPane().add(prize2Txt, "cell 19 1,alignx center");
				
				JButton deck2Btn = new JButton();
				deck2Btn.setMinimumSize(new Dimension(200, 265));
				deck2Btn.setMaximumSize(new Dimension(100, 140));
				frmTest.getContentPane().add(deck2Btn, "cell 13 2");
				deck2Btn.setIcon(new ImageIcon("res/card.jpg"));
				deck2Btn.setBorder(BorderFactory.createEmptyBorder());
				deck2Btn.setContentAreaFilled(false);
				deck2Btn.addActionListener(new ActionListener() {
				     public void actionPerformed(ActionEvent e)
	         {
	             //Execute when button is pressed
				    	 System.out.println(deck2.pop().getName());
				    	 
				    	 deck2Txt.setText(String.valueOf(deck2.size()));
	         	
	         }
	     });
		//		act1Btn.addActionListener(new ActionListener() {
		//			 
		//            public void actionPerformed(ActionEvent e)
		//            {
		//            }
		//        });		 	  
				
				JButton act2Btn = new JButton("Active Pokemon");
				act2Btn.setForeground(new Color(210, 105, 30));
				act2Btn.setMinimumSize(new Dimension(200, 265));
				act2Btn.setMaximumSize(new Dimension(100, 140));
				frmTest.getContentPane().add(act2Btn, "cell 16 2");
		
		deck2Txt = new JTextField();
		frmTest.getContentPane().add(deck2Txt, "cell 13 3,alignx center");
		deck2Txt.setColumns(2);
		deck2Txt.setText(String.valueOf(deck2.size()));
		
		
		
		deck1Txt = new JTextField();
		frmTest.getContentPane().add(deck1Txt, "cell 19 5,alignx center");
		deck1Txt.setColumns(2);
		deck1Txt.setText(String.valueOf(deck1.size()));
		
		
		
		JButton act1Btn = new JButton("Active Pokemon");
		act1Btn.setMinimumSize(new Dimension(200, 265));
		act1Btn.setMaximumSize(new Dimension(100, 140));
		frmTest.getContentPane().add(act1Btn, "cell 16 6");
		
		
		
		JButton deck1Btn = new JButton();
		deck1Btn.setMinimumSize(new Dimension(200, 265));
		deck1Btn.setMaximumSize(new Dimension(100, 140));
		frmTest.getContentPane().add(deck1Btn, "cell 19 6");
		deck1Btn.setIcon(new ImageIcon("res/card.jpg"));
		deck1Btn.setBorder(BorderFactory.createEmptyBorder());
		deck1Btn.setContentAreaFilled(false);
		deck1Btn.addActionListener(new ActionListener() {
	     public void actionPerformed(ActionEvent e)
         { 
             //Execute when button is pressed
	    	 
	    	 hand1.draw(deck1);
	    	 int hand1Cnt=hand1.getSize();
	    	 ArrayList<Card> hand11 = hand1.getHand();
	    	Card drawn = hand11.get(hand1Cnt-1);
	    	HandCard newcard = new HandCard(drawn);
	    	handPanel1.add(newcard);
	    	
	    	
	    	
	    	 deck1Txt.setText(String.valueOf(deck1.size()));
	    	 
	    	 
	    	 
	    	
         	
         }
     });
				
				prize1Txt = new JTextField();
				prize1Txt.setText(String.valueOf(prize1.size()));
				prize1Txt.setColumns(2);
				frmTest.getContentPane().add(prize1Txt, "cell 13 7,alignx center");
		//		act2Btn.addActionListener(new ActionListener() {
		 
		//            public void actionPerformed(ActionEvent e)
		//            {
		//                //Execute when button is pressed
		//            	deck2Btn.setIcon(new ImageIcon("res/wingull.jpg"));
		//            }
		//        }); 
				
			
				JButton prz1Btn = new JButton();
				prz1Btn.setMinimumSize(new Dimension(200, 265));
				prz1Btn.setMaximumSize(new Dimension(100, 140));
				prz1Btn.setIcon(new ImageIcon("res/pcard.jpg"));
				frmTest.getContentPane().add(prz1Btn, "cell 13 8");
				prz1Btn.setBorder(BorderFactory.createEmptyBorder());
				prz1Btn.setContentAreaFilled(false);
		
		JButton bench11Btn = new JButton("Bench");
		bench11Btn.setMinimumSize(new Dimension(200, 265));
		bench11Btn.setMaximumSize(new Dimension(100, 140));
		frmTest.getContentPane().add(bench11Btn, "cell 14 8");
		
		JButton bench12Btn = new JButton("Bench");
		bench12Btn.setMinimumSize(new Dimension(200, 265));
		bench12Btn.setMaximumSize(new Dimension(100, 140));
		frmTest.getContentPane().add(bench12Btn, "cell 15 8");
		
		JButton bench13Btn = new JButton("Bench");
		bench13Btn.setMinimumSize(new Dimension(200, 265));
		bench13Btn.setMaximumSize(new Dimension(100, 140));
		frmTest.getContentPane().add(bench13Btn, "cell 16 8");
		
		JButton bench14Btn = new JButton("Bench");
		bench14Btn.setMinimumSize(new Dimension(200, 265));
		bench14Btn.setMaximumSize(new Dimension(100, 140));
		frmTest.getContentPane().add(bench14Btn, "cell 17 8");
		
		JButton bench15Btn = new JButton("Bench");
		bench15Btn.setMinimumSize(new Dimension(200, 265));
		bench15Btn.setMaximumSize(new Dimension(100, 140));
		frmTest.getContentPane().add(bench15Btn, "cell 18 8");
			
			JButton dis1Btn = new JButton("Discard Pile");
			dis1Btn.setMinimumSize(new Dimension(200, 265));
			dis1Btn.setMaximumSize(new Dimension(100, 140));
			dis1Btn.setIcon(new ImageIcon("res/discard.jpg"));
			dis1Btn.setBorder(BorderFactory.createEmptyBorder());
			dis1Btn.setContentAreaFilled(false);
			
				
				
				frmTest.getContentPane().add(dis1Btn, "cell 19 8");
				
				
				
				
		frmTest.setBounds(100, 100, 300, 300);
		frmTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
