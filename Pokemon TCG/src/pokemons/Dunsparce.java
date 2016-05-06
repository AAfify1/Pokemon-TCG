package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

import gui.AttackButton;

public class Dunsparce extends Pokemon{
	
	private Attack attack1;
	private Attack attack2;
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();
	public Dunsparce()
	{
		super("Dunsparce",
				"Normal",
				false ,
				60,
				2,
				0,
				"Fighting",
				"");
		setAttacks();
		
	}
	public void setAttacks()
	{

		ArrayList<String> energies1 = new ArrayList<String>(Arrays.asList("C"));
		 attack1= new Attack("Burrow",1,energies1,0,"Discard the top card of your opponent's deck.");
		 
		 
		 attack2= new Attack("Rollout",1,energies1,20,"");
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
