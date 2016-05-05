package gui;

import java.awt.Color;
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
	// private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
	// private ArrayList<JLabel> energies = new ArrayList<JLabel>();

	public EnergyArea(GameManager game) {
		super();
		this.game = game;

		energyPanel = new JPanel();
		energyPanel.setLayout(new FlowLayout());
		energyPanel.setOpaque(false);
		energyPanel.setSize(new Dimension(300, 60));

		setViewportView(energyPanel);
		getViewport().setOpaque(false);
		setOpaque(false);
		setBorder(BorderFactory.createEmptyBorder());
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		setSize(new Dimension(300, 60));

	}
	// public void addEnergy(Energy energy)
	// {
	// JLabel label = new JLabel();
	// String path = "res/"+energy.getName().toLowerCase()+"Icon.jpg";
	// label.setIcon(new ImageIcon(path));
	// energyPanel.add(label);
	// }
	// public void removeEnergy(Energy energy)
	// {
	// energyPanel.remove
	// }

	public void display(Pokemon pokemon) {

		ArrayList<String> energies = new ArrayList<String>(pokemon.getEnergies());

		
		for (String x : energies) {
			if (x != null) {
				JLabel label = new JLabel();
				String path = "res/" + x + "Icon.png";
				label.setIcon(new ImageIcon(path));
				
				energyPanel.add(label);

			}

		}

		updateUI();
	}

	public void clear() {
		energyPanel.removeAll();
		energyPanel.repaint();
		updateUI();
	}

}
