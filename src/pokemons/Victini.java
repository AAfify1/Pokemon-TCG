package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

import gui.AttackButton;

public class Victini extends Pokemon {

	private Attack attack1;
	private Attack attack2;
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();
	public Victini()
	{
		super("Victini",
				"Fire",
				false ,
				70,
				2,
				1,
				"Water",
				"");
		setAttacks();
		
	}
	public void setAttacks()
	{

		ArrayList<String> energies1 = new ArrayList<String>(Arrays.asList("C"));
		 attack1= new Attack("Me First",1,energies1,0,"Draw a card.");
		 
		 ArrayList<String> energies2 = new ArrayList<String>(Arrays.asList("Fr","C"));
		 attack2= new Attack("Psy Bolt",2,energies2,20,"Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.");
		 
		 AttackButton attackbutton1 = new AttackButton(attack1);
		 AttackButton attackbutton2 = new AttackButton(attack2);
		 attackButtons.add(attackbutton1);
		 attackButtons.add(attackbutton2);
	}
	public Attack getAttack1(){
		return attack1;
	}
	public Attack getAttack2(){
		return attack2;
	}
	public ArrayList<AttackButton> getAttackButtons() {
		return attackButtons;
	}

}
