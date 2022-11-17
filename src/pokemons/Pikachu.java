package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

import gui.AttackButton;

public class Pikachu extends Pokemon {
	
	private Attack attack1;
	private Attack attack2;
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();
	
	public Pikachu()
	{
		super("Pikachu",
				"Electricity",
				false,
				60,
				2,
				1,
				"Fighting",
				"");
		setAttacks();
	}
	
	public void setAttacks()
	{

		ArrayList<String> energies1 = new ArrayList<String>(Arrays.asList("E"));
		ArrayList<String> energies2 = new ArrayList<String>(Arrays.asList("C","C"));
		 attack1= new Attack("Thundershock",1,energies1,10," ");
		 attack2= new Attack("Tail Whap",2,energies2,20," ");
		 AttackButton attackbutton1 = new AttackButton(attack1);
		 AttackButton attackbutton2 = new AttackButton(attack2);
		 attackButtons.add(attackbutton1);
		 attackButtons.add(attackbutton2);

	}

	public ArrayList<AttackButton> getAttackButtons() {
		return attackButtons;
	}

	public Attack getAttack1() {
		return attack1;
	}

	public Attack getAttack2() {
		return attack2;
	}
	

}
