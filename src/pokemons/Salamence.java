package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

import gui.AttackButton;

public class Salamence extends Pokemon {
	private Attack attack1;
	private Attack attack2;
	private Attack attack3;
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();
	public Salamence()
	{
		super("Salamence",
				"Dragon",
				false ,
				160,
				3,
				4,
				"Fairy",
				"");
		this.setLevel(2);
		setAttacks();
		
		
	}
	public void setAttacks()
	{

		ArrayList<String> energies1 = new ArrayList<String>(Arrays.asList("Fr"));
		 attack1= new Attack("Shatter ",1,energies1,60,"Discard any Stadium card in play.");
		 
		 ArrayList<String> energies2 = new ArrayList<String>(Arrays.asList("W","C","C"));
		 attack2= new Attack("Power Howl  ",3,energies2,0,"This attack does 20 damage times the number of cards in your opponent's hand.");
		 
		 ArrayList<String> energies3 = new ArrayList<String>(Arrays.asList("F","F","W","C"));
		 attack3= new Attack("Steam Blast ",4,energies3,170,"Discard 3 Energy attached to this Pokémon.");
		 
		 AttackButton attackbutton1 = new AttackButton(attack1);
		 AttackButton attackbutton2 = new AttackButton(attack2);
		 AttackButton attackbutton3 = new AttackButton(attack3);
		 attackButtons.add(attackbutton1);
		 attackButtons.add(attackbutton2);
		 attackButtons.add(attackbutton3);
	}
	public Attack getAttack1(){
		return attack1;
	}
	public Attack getAttack2() {
		return attack2;
	}
	public Attack getAttack3() {
		return attack3;
	}
		 
	public ArrayList<AttackButton> getAttackButtons() {
		return attackButtons;
	}

}


