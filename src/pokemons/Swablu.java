package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

import gui.AttackButton;

public class Swablu extends Pokemon {

	private Attack attack1;
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();
	public Swablu()
	{
		super("Swablu",
				"Normal",
				false ,
				40,
				1,
				1,
				"Electricity",
				"Fighting");
		setAttacks();
		
	}
	public void setAttacks()
	{

		ArrayList<String> energies1 = new ArrayList<String>(Arrays.asList("C"));
		 attack1= new Attack("Bind Wound",1,energies1,0,"Heal 20 damage from 1 of your Pokémon.");
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
