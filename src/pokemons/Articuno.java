package pokemons;

import java.util.ArrayList;
import java.util.Arrays;

import gui.AttackButton;

public class Articuno extends Pokemon{
	
	private Attack attack1;
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();

	public Articuno()
	{
		super("Articuno",
				"Water",
				false ,
				120,
				2,
				1,
				"Metal",
				"Fighting");
		
		setAttacks();
	}
	
	

public void setAttacks()
{

	ArrayList<String> energies = new ArrayList<String>(Arrays.asList("W","W","C","C"));
	 attack1= new Attack("Freezing Wind",4,energies,100," ");
	 AttackButton attackbutton1 = new AttackButton(attack1);
	 attackButtons.add(attackbutton1);

}

public Attack getAttack1() {
	return attack1;
	
}
public ArrayList<AttackButton> getAttackButtons() {
	return attackButtons;
}


}
	

