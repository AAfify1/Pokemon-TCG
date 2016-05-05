package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

import gui.AttackButton;

public class Bagon extends Pokemon {
	
	private Attack attack1;
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();
	
	public Bagon()
	{
		super("Bagon",
				"Dragon",
				false ,
				60,
				1,
				1,
				"Fairy",
				"");
		setAttacks();
		
	}
	public void setAttacks()
	{

		ArrayList<String> energies1 = new ArrayList<String>(Arrays.asList("Fr","C"));
		 attack1= new Attack("Continuous Headbutt",2,energies1,30,"Flip a coin until you get tails. This attack does 30 damage times the number of heads.");
		 AttackButton attackbutton1 = new AttackButton(attack1);
		 attackButtons.add(attackbutton1);
	}
	
	public ArrayList<AttackButton> getAttackButtons() {
		return attackButtons;
	}	 

}

