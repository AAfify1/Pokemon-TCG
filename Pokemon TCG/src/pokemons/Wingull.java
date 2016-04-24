package pokemons;
public class Wingull extends Pokemon {
	private Attack attack1;
	public Wingull()
	{
		super("Wingull",
				"Water",
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

		String[] energies1 = {"W"};
		 attack1= new Attack("Water Gun",1,energies1,10,"");
	}
	public Attack getAttack1(){
		return attack1;
	}
		 

}
