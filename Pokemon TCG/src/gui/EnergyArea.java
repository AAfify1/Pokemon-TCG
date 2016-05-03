package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import energy.Energy;
import main.GameManager;
import pokemons.Pokemon;
public class EnergyArea extends JScrollPane {
	
	private GameManager game;
	private JPanel energyPanel;
//	private ArrayList<JLabel> energies = new ArrayList<JLabel>();
	
	public EnergyArea(GameManager game)
	{
		super();
		this.game=game;
	
		energyPanel = new JPanel();
		energyPanel.setLayout(new FlowLayout());
		energyPanel.setOpaque(false);
		energyPanel.setSize(new Dimension(300, 50));

		setViewportView(energyPanel);
		getViewport().setOpaque(false);
		setOpaque(false);
		setBorder(BorderFactory.createEmptyBorder());
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		setSize(new Dimension(300, 50));
		
	}
//	public void addEnergy(Energy energy)
//	{
//		JLabel label = new JLabel();
//		String path = "res/"+energy.getName().toLowerCase()+"Icon.jpg";
//		label.setIcon(new ImageIcon(path));
//		energyPanel.add(label);	
//		}
//	public void removeEnergy(Energy energy)
//	{
//		energyPanel.remove
//	}
	
	public void display(Pokemon pokemon)
	{
		JLabel label = new JLabel();
		String[] energies = new String[20];
		System.arraycopy( pokemon.getEnergies(), 0, energies, 0, 20);
		for(String x : energies)
		{
			if(x !=null)
			{
				String path = "res/"+x+"Icon.jpg";
				label.setIcon(new ImageIcon(path));
				energyPanel.add(label);	
				
			}
		}
	}

}
