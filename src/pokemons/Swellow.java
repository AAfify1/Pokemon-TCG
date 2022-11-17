package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

import gui.AttackButton;

public class Swellow extends Pokemon {

	private Attack attack1;
	private Attack attack2;
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();
	
	public Swellow()
	{
		super("Swellow",
				"Normal",
				false ,
				90,
				2,
				1,
				"Electricity",
				"Fighting");
		setAttacks();
		this.setLevel(1);
		
	}
	/* Ancient trait: If your opponent's Pokémon is Knocked Out by damage from an attack of this Pokémon, take 1 more Prize card.*/
	public void setAttacks()
	{

		ArrayList<String> energies1 = new ArrayList<String>(Arrays.asList("C","C"));
		 attack1= new Attack("Peck",2,energies1,30,"");
		 
		 ArrayList<String> energies2 = new ArrayList<String>(Arrays.asList("C","C","C"));
		 attack2= new Attack("Wing Attack",3,energies2,50,"");
		 AttackButton attackbutton1 = new AttackButton(attack1);
		 AttackButton attackbutton2 = new AttackButton(attack2);
		 attackButtons.add(attackbutton1);
		 attackButtons.add(attackbutton2);
		 
	}
	public Attack getAttack2() {
		return attack2;
	}
	public Attack getAttack1(){
		return attack1;
	}
	public ArrayList<AttackButton> getAttackButtons() {
		return attackButtons;
	}

}
