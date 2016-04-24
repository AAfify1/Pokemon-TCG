package gui;
import java.awt.EventQueue;

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

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class GUI {

	private JFrame frmTest;
	private JTextField deck2Txt;
	private JTextField deck1Txt;

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
		
		frmTest = new JFrame();
		frmTest.setMinimumSize(new Dimension(1540	, 1200));
		frmTest.setSize(new Dimension(700, 800));
		 
		  frmTest.setResizable(false);
		frmTest.setTitle("Pokemon");
		
		try {
    		frmTest.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("res/bg2.jpg")))));
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
		
		
		frmTest.setForeground(new Color(135, 206, 250));
		frmTest.getContentPane().setBackground(Color.WHITE);
		frmTest.getContentPane().setLayout(new MigLayout("", "[][grow][grow][][][][][][][][][][][][][][][][][][][][][][][][][][][][][grow]", "[][][][][][][][][][][][][][]"));
		
		deck2Txt = new JTextField();
		frmTest.getContentPane().add(deck2Txt, "cell 2 3,alignx center");
		deck2Txt.setColumns(2);
		deck2Txt.setText(String.valueOf(deck2.size()));
		
		deck1Txt = new JTextField();
		frmTest.getContentPane().add(deck1Txt, "cell 31 10,alignx center");
		deck1Txt.setColumns(2);
		deck1Txt.setText(String.valueOf(deck1.size()));
		
		
		
		JButton deck1Btn = new JButton();
		deck1Btn.setMinimumSize(new Dimension(200, 265));
		deck1Btn.setMaximumSize(new Dimension(200, 265));
		frmTest.getContentPane().add(deck1Btn, "cell 31 12");
		deck1Btn.setIcon(new ImageIcon("res/card.jpg"));
		deck1Btn.setBorder(BorderFactory.createEmptyBorder());
		deck1Btn.setContentAreaFilled(false);
		deck1Btn.addActionListener(new ActionListener() {
	     public void actionPerformed(ActionEvent e)
         { int i=0;
             //Execute when button is pressed
	    	 hand1.draw(deck1);
	    	 ArrayList<Card> hand11 = hand1.getHand();
	    	 System.out.println(hand11.size());
	    	 
	    	 
	    	 deck1Txt.setText(String.valueOf(deck1.size()));
	    	 i++;
         	
         }
     });
		
		JButton deck2Btn = new JButton();
		deck2Btn.setMinimumSize(new Dimension(200, 265));
		deck2Btn.setMaximumSize(new Dimension(200, 265));
		frmTest.getContentPane().add(deck2Btn, "cell 2 2");
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
		
		JButton dis2Btn = new JButton("Discard Pile\r\n");
		dis2Btn.setMinimumSize(new Dimension(200, 265));
		dis2Btn.setMaximumSize(new Dimension(200, 265));
		dis2Btn.setIcon(new ImageIcon("res/discard.jpg"));
		dis2Btn.setBorder(BorderFactory.createEmptyBorder());
		dis2Btn.setContentAreaFilled(false);
		frmTest.getContentPane().add(dis2Btn, "cell 2 1,alignx center,aligny center");
		
		JButton dis1Btn = new JButton("Discard Pile");
		dis1Btn.setMinimumSize(new Dimension(200, 265));
		dis1Btn.setMaximumSize(new Dimension(200, 265));
		dis1Btn.setIcon(new ImageIcon("res/discard.jpg"));
		dis1Btn.setBorder(BorderFactory.createEmptyBorder());
		dis1Btn.setContentAreaFilled(false);
		
		JButton bench21Btn = new JButton("Bench");
		bench21Btn.setMinimumSize(new Dimension(200, 265));
		bench21Btn.setMaximumSize(new Dimension(200, 265));
		frmTest.getContentPane().add(bench21Btn, "cell 7 1");
		
		JButton bench22Btn = new JButton("Bench");
		bench22Btn.setMinimumSize(new Dimension(200, 265));
		bench22Btn.setMaximumSize(new Dimension(200, 265));
		frmTest.getContentPane().add(bench22Btn, "cell 11 1");
		
		JButton bench23Btn = new JButton("Bench");
		bench23Btn.setMinimumSize(new Dimension(200, 265));
		bench23Btn.setMaximumSize(new Dimension(200, 265));
		frmTest.getContentPane().add(bench23Btn, "cell 15 1");
		
		JButton bench24Btn = new JButton("Bench");
		bench24Btn.setMinimumSize(new Dimension(200, 265));
		bench24Btn.setMaximumSize(new Dimension(200, 265));
		frmTest.getContentPane().add(bench24Btn, "cell 19 1");
		
		JButton bench25Btn = new JButton("Bench");
		bench25Btn.setMinimumSize(new Dimension(200, 265));
		bench25Btn.setMaximumSize(new Dimension(200, 265));
		frmTest.getContentPane().add(bench25Btn, "cell 23 1");
		
		JButton bench11Btn = new JButton("Bench");
		bench11Btn.setMinimumSize(new Dimension(200, 265));
		bench11Btn.setMaximumSize(new Dimension(200, 265));
		frmTest.getContentPane().add(bench11Btn, "cell 7 13");
		
		JButton bench12Btn = new JButton("Bench");
		bench12Btn.setMinimumSize(new Dimension(200, 265));
		bench12Btn.setMaximumSize(new Dimension(200, 265));
		frmTest.getContentPane().add(bench12Btn, "cell 11 13");
		
		JButton bench13Btn = new JButton("Bench");
		bench13Btn.setMinimumSize(new Dimension(200, 265));
		bench13Btn.setMaximumSize(new Dimension(200, 265));
		frmTest.getContentPane().add(bench13Btn, "cell 15 13");
		
		JButton bench14Btn = new JButton("Bench");
		bench14Btn.setMinimumSize(new Dimension(200, 265));
		bench14Btn.setMaximumSize(new Dimension(200, 265));
		frmTest.getContentPane().add(bench14Btn, "cell 19 13");
		
		JButton bench15Btn = new JButton("Bench");
		bench15Btn.setMinimumSize(new Dimension(200, 265));
		bench15Btn.setMaximumSize(new Dimension(200, 265));
		frmTest.getContentPane().add(bench15Btn, "cell 23 13");
		
		
		
		JButton act1Btn = new JButton("Active Pokemon");
		act1Btn.setMinimumSize(new Dimension(200, 265));
		act1Btn.setMaximumSize(new Dimension(200, 265));
		frmTest.getContentPane().add(act1Btn, "cell 15 12");
//		act1Btn.addActionListener(new ActionListener() {
//			 
//            public void actionPerformed(ActionEvent e)
//            {
//            }
//        });		 	  
		
		JButton act2Btn = new JButton("Active Pokemon");
		act2Btn.setForeground(new Color(210, 105, 30));
		act2Btn.setMinimumSize(new Dimension(200, 265));
		act2Btn.setMaximumSize(new Dimension(200, 265));
		frmTest.getContentPane().add(act2Btn, "cell 15 2");
//		act2Btn.addActionListener(new ActionListener() {
 
//            public void actionPerformed(ActionEvent e)
//            {
//                //Execute when button is pressed
//            	deck2Btn.setIcon(new ImageIcon("res/wingull.jpg"));
//            }
//        }); 
		
	
		JButton prz1Btn = new JButton();
		prz1Btn.setMinimumSize(new Dimension(200, 265));
		prz1Btn.setMaximumSize(new Dimension(200, 265));
		prz1Btn.setIcon(new ImageIcon("res/pcard.jpg"));
		frmTest.getContentPane().add(prz1Btn, "cell 2 13");
		prz1Btn.setBorder(BorderFactory.createEmptyBorder());
		prz1Btn.setContentAreaFilled(false);
		
		JButton prz2Btn = new JButton();
		prz2Btn.setMinimumSize(new Dimension(200, 265));
		prz2Btn.setMaximumSize(new Dimension(200, 265));
		prz2Btn.setIcon(new ImageIcon("res/pcard.jpg"));
		frmTest.getContentPane().add(prz2Btn, "cell 31 1");
		prz2Btn.setBorder(BorderFactory.createEmptyBorder());
		prz2Btn.setContentAreaFilled(false);
	
		
		
		frmTest.getContentPane().add(dis1Btn, "cell 31 13");
		frmTest.setBounds(100, 100, 300, 300);
		frmTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
