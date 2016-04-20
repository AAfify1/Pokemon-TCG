

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingContainerDemo {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private JLabel msglabel;

   public SwingContainerDemo(){
      gridGui();
   }

   public static void main(String[] args){
      SwingContainerDemo  swingContainerDemo = new SwingContainerDemo();  
      //swingContainerDemo.showJFrameDemo();
   }

   private void gridGui()
   {
	   JFrame.setDefaultLookAndFeelDecorated(true);
	    JFrame frame = new JFrame("GridLayout Test");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new GridLayout(3, 2));
	    frame.add(new JButton("Button 1"));
	    frame.add(new JButton("Button 2"));
	    frame.add(new JButton("Button 3"));
	    frame.add(new JButton("Button 4"));
	    frame.add(new JButton("Button 5"));
	    frame.add(new JButton("Button 6"));
	    frame.add(new JButton("Button 7"));
	    frame.add(new JButton("Button 8"));
	    frame.pack();
	    frame.setVisible(true);
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Pokemon");
      mainFrame.setSize(600,400);
      mainFrame.setLayout(new GridLayout(3,5));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    

      statusLabel.setSize(350,100);

      msglabel = new JLabel("Welcome to TutorialsPoint SWING Tutorial.", JLabel.CENTER);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showJFrameDemo(){
      headerLabel.setText("Container in action: JFrame");   

      final JFrame frame = new JFrame();
      frame.setSize(300, 300);
      frame.setLayout(new FlowLayout());       
      frame.add(msglabel);
      frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            frame.dispose();
         }        
      });    
      JButton okButton = new JButton("Open a Frame");
      okButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("A Frame shown to the user.");
            frame.setVisible(true);
         }
      });
      controlPanel.add(okButton);
      mainFrame.setVisible(true);  
   }
}