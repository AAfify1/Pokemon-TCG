
public class Swablu extends Pokemon {

	private Attack attack1;
	public Swablu()
	{
		super("Swablu",
				"Normal",
				false ,
				40,
				1,
				1,
				"Electricity",
				"Fighting");
		setAttacks();
		
	}
	public void setAttacks()
	{

		String[] energies1 = {"C"};
		 attack1= new Attack("Bind Wound",1,energies1,0,"Heal 20 damage from 1 of your Pokémon.");
	}
	public Attack getAttack1(){
		return attack1;
	}
	
}
