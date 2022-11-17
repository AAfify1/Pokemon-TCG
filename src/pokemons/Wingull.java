package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

import gui.AttackButton;

public class Wingull extends Pokemon {
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();
	private Attack attack1;
	
	public Wingull()
	{
		super("Wingull",
				"Water",
				false ,
				60,
				1,
				1,
				"Electricity",
				"Fighting");
		setAttacks();
		
	}
	public void setAttacks()
	{

		ArrayList<String> energies1 = new ArrayList<String>(Arrays.asList("W"));
		 attack1= new Attack("Water Gun",1,energies1,10,"");
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
