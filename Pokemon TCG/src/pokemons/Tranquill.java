package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

import gui.AttackButton;

public class Tranquill extends Pokemon {
	
	private Attack attack1;
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();
	public Tranquill()
	{
		super("Tranquill",
				"Normal",
				false ,
				80,
				1,
				1,
				"Electricity",
				"Fighting");
		setAttacks();
		
	}
	public void setAttacks()
	{

		ArrayList<String> energies1 = new ArrayList<String>(Arrays.asList("C","C"));
		 attack1= new Attack("Fly",2,energies1,40,"Flip a coin. If tails, this attack does nothing. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn.");
		 AttackButton attackbutton1 = new AttackButton(attack1);
		 attackButtons.add(attackbutton1);
	}
	public Attack getAttack1(){
		return attack1;
	}
	public ArrayList<AttackButton> getAttackButtons() {
		return attackButtons;
	}

}
