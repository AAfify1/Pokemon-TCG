package gui;

import java.awt.Dimension;

import javax.swing.JButton;

import pokemons.Attack;

public class AttackButton extends JButton {
	
	private String name;
	private Attack attack;
	
	public AttackButton(Attack attack)
	{	
		setPreferredSize(new Dimension(150,15));
		setVisible(true);
		this.setAttack(attack);
		this.name = attack.getName();
		setLabel(name);
	}

	public Attack getAttack() {
		return attack;
	}

	public void setAttack(Attack attack) {
		this.attack = attack;
	}

}
