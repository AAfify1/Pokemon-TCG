package pokemons;
public class Fletchling extends Pokemon{
	
	private Attack attack1;
	public Fletchling()
	{
		super("Fletchling",
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
		 attack1= new Attack("Acrobatics",1,energies1,10,"Flip 2 coins. This attack does 10 more damage for each heads.");
	}
	public Attack getAttack1(){
		return attack1;
	}

}
