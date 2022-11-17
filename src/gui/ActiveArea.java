package gui;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ActiveListener;
import main.Player;
import pokemons.Pokemon;

public class ActiveArea extends JPanel {
	
	private Player player;
	private ActiveListener activeListener;
	private ActivePokemon actPokemon;
	private Pokemon pokemon;
	
	public ActiveListener getActiveListener() {
		return activeListener;
	}
	public void setActiveListener(ActiveListener activeListener) {
		this.activeListener = activeListener;
	}
	public ActivePokemon getPokemon() {
		return actPokemon;
	}
	public void setPokemon(ActivePokemon actPokemon) {
		this.actPokemon = actPokemon;
		pokemon = actPokemon.getPokemon();
		actPokemon.getPlayer().active = pokemon;
		
	
		
		String path = "res/" + pokemon.getName().toLowerCase()+".jpg";
		actPokemon.setIcon(new ImageIcon(path));
		actPokemon.addActionListener(activeListener);
		actPokemon.addMouseListener(activeListener);
		add(actPokemon);
		updateUI();
	}
	public Player getPlayer() {
		return player;
	}
public void removePokemon()
{
	removeAll();
	repaint();
	updateUI();
	
	
}
	public ActiveArea(Player player)
	{
		this.player = player;
		
		setOpaque(false);
		setBorder(BorderFactory.createEmptyBorder());
		setSize(new Dimension(100, 140));
		
	}
	
}
