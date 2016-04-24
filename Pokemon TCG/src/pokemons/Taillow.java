package pokemons;
public class Taillow extends Pokemon {
	
	private Attack attack1;
	public Taillow()
	{
		super("Taillow",
				"Normal",
				false ,
				50,
				1,
				1,
				"Electricity",
				"Fighting");
		setAttacks();
		
	}
	public void setAttacks()
	{

		String[] energies1 = {"C"};
		 attack1= new Attack("Double Peck",1,energies1,0,"Flip 2 coins. This attack does 10 damage times the number of heads.");
	}
	public Attack getAttack1(){
		return attack1;
	}

}
