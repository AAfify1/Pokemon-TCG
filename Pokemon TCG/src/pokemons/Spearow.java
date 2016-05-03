package pokemons;

import java.util.ArrayList;

import gui.AttackButton;

public class Spearow extends Pokemon {
	
	private Attack attack1;
	private ArrayList<AttackButton> attackButtons = new ArrayList<AttackButton>();
	public Spearow()
	{
		super("Spearow",
				"Normal",
				false ,
				60,
				1,
				1,
				"Electricity",
				"Fighting");
		setAttacks();
		
	}
	public void setAttacks()
	{

		String[] energies1 = {"C","C"};
		 attack1= new Attack("Peck",2,energies1,30,"");
		 AttackButton attackbutton1 = new AttackButton(attack1);
		 attackButtons.add(attackbutton1);
	}
	
	public ArrayList<AttackButton> getAttackButtons() {
		return attackButtons;
	}

	
	public Attack getAttack1(){
		return attack1;
	}

}
