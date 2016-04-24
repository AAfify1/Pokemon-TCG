package pokemons;
public class Victini extends Pokemon {

	private Attack attack1;
	private Attack attack2;
	public Victini()
	{
		super("Victini",
				"Fire",
				false ,
				70,
				2,
				1,
				"Water",
				"");
		setAttacks();
		
	}
	public void setAttacks()
	{

		String[] energies1 = {"C"};
		 attack1= new Attack("Me First",1,energies1,0,"Draw a card.");
		 
		 String[] energies2 = {"Fr","C"};
		 attack2= new Attack("Psy Bolt",2,energies2,20,"Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.");
		 
	}
	public Attack getAttack1(){
		return attack1;
	}
	public Attack getAttack2(){
		return attack2;
	}
}
