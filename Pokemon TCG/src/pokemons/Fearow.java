package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

import gui.AttackButton;

public class Fearow extends Pokemon {

	private Attack attack1;
	private Attack attack2;
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();
	public Fearow()
	{
		super("Fearow",
				"Normal",
				false ,
				100,
				2,
				1,
				"Electricity",
				"Fighting");
		setAttacks();
		this.setLevel(1);
		
	}
	public void setAttacks()
	{

		ArrayList<String> energies1 = new ArrayList<String>(Arrays.asList("C"));
		 attack1= new Attack("Peck",1,energies1,30,"");
		 
		 ArrayList<String> energies2 = new ArrayList<String>(Arrays.asList("C","C","C","C"));
		 attack2= new Attack("Drill Run",4,energies2,70,"Flip a coin. If heads, discard an Energy attached to your opponent's Active Pokémon.");
		 AttackButton attackbutton1 = new AttackButton(attack1);
		 AttackButton attackbutton2 = new AttackButton(attack2);
		 attackButtons.add(attackbutton1);
		 attackButtons.add(attackbutton2);
	}
	public Attack getAttack1(){
		return attack1;
	}
	public ArrayList<AttackButton> getAttackButtons() {
		return attackButtons;
	}
	public Attack getAttack2() {
		return attack2;
	}
}
