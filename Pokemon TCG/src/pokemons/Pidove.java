package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

import gui.AttackButton;

public class Pidove extends Pokemon {
	
	private Attack attack1;
	private Attack attack2;
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();
	public Pidove()
	{
		super("Pidove",
				"Normal",
				false ,
				60,
				2,
				1,
				"Electricity",
				"Fighting");
		setAttacks();
		
	}
	public void setAttacks()
	{

		ArrayList<String> energies1 = new ArrayList<String>(Arrays.asList("C"));
		 attack1= new Attack("Homing Pidove ",1,energies1,0,"Look at the top card of your deck. Then, you may shuffle your deck.");
		 
		 ArrayList<String> energies2 = new ArrayList<String>(Arrays.asList("C","C"));
		 attack2= new Attack("Gust",2,energies2,20,"");
	}
	
	public Attack getAttack1(){
		return attack1;
	}
	public Attack getAttack2() {
		return attack2;
	}
	public ArrayList<AttackButton> getAttackButtons() {
		return attackButtons;
	}

}
