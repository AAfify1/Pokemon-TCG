package pokemons;
public class Spearow extends Pokemon {
	
	private Attack attack1;
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
	}
	public Attack getAttack1(){
		return attack1;
	}

}
