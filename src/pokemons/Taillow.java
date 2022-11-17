package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

import gui.AttackButton;

public class Taillow extends Pokemon {
	
	private Attack attack1;
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();
	public Taillow()
	{
		super("Taillow",
				"Normal",
				false ,
				50,
				1,
				1,
				"Electricity",
				"Fighting");
		setAttacks();
		
	}
	public void setAttacks()
	{

		ArrayList<String> energies1 = new ArrayList<String>(Arrays.asList("C"));
		 attack1= new Attack("Double Peck",1,energies1,0,"Flip 2 coins. This attack does 10 damage times the number of heads.");
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
