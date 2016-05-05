package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

import gui.AttackButton;

public class Shelgon extends Pokemon{
	
	private Attack attack1;
	private Ability ability = new Ability("exoskeleton","inDmgRed",true,false);
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();
	public Shelgon()
	{
		super("Shelgon",
				"Dragon",
				false ,
				80,
				1,
				3,
				"Fairy",
				"",
				true);
		this.setLevel(1);
		setAttacks();
		setAbility();
		
	}
	/* Ability: Any damage done to this Pokémon by attacks is reduced by 10 (after applying Weakness and Resistance).
*/


	public void setAttacks()
	{

		ArrayList<String> energies1 = new ArrayList<String>(Arrays.asList("Fr","W","C"));
		 attack1= new Attack("Rolling Tackle",3,energies1,60,"");
		 AttackButton attackbutton1 = new AttackButton(attack1);
		 attackButtons.add(attackbutton1);
	}
	
	public Ability getAbility() {
		return ability;
	}



	public void setAbility()
	{
		
		ability.setInDmgRed(10);
		
	}
	public Attack getAttack1(){
		return attack1;
	}
	public ArrayList<AttackButton> getAttackButtons() {
		return attackButtons;
	}
		 

}


