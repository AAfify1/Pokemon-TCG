package pokemons;
public class Bagon extends Pokemon {

	private Attack attack1;
	public Bagon()
	{
		super("Bagon",
				"Dragon",
				false ,
				60,
				1,
				1,
				"Fairy",
				"");
		setAttacks();
		
	}
	public void setAttacks()
	{

		String[] energies1 = {"F","C"};
		 attack1= new Attack("Continuous Headbutt",2,energies1,30,"Flip a coin until you get tails. This attack does 30 damage times the number of heads.");
	}
	public Attack getAttack1(){
		return attack1;
	}
		 

}

