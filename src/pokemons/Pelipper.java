package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

import gui.AttackButton;

public class Pelipper extends Pokemon {


	
	private Attack attack1;
	private Attack attack2;
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();

	public Pelipper()
	{
		super("Pelipper",
				"Water",
				false ,
				100,
				2,
				2,
				"Electricity",
				"Fighting");
		setAttacks();
		this.setLevel(1);
	}

public void setAttacks()
{

	ArrayList<String> energies1 = new ArrayList<String>(Arrays.asList("W","C"));
	 attack1= new Attack("Swallow",2,energies1,30," Heal from this Pokémon the same amount of damage you did to your opponent's Active Pokémon.");
	 
	 ArrayList<String> energies2 = new ArrayList<String>(Arrays.asList("W","C","C","C"));
	 attack2= new Attack("Water Pulse",4,energies2,70,"You opponent's Active Pokémon is now Asleep.");
	 AttackButton attackbutton1 = new AttackButton(attack1);
	 AttackButton attackbutton2 = new AttackButton(attack2);
	 attackButtons.add(attackbutton1);
	 attackButtons.add(attackbutton2);
}

public Attack getAttack1() {
	return attack1;
	
}
public Attack getAttack2() {
	return attack2;
	
}
public ArrayList<AttackButton> getAttackButtons() {
	return attackButtons;
}


}
	



