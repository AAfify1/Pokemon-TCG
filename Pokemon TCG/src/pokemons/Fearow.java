package pokemons;
public class Fearow extends Pokemon {

	private Attack attack1;
	private Attack attack2;
	public Fearow()
	{
		super("Fearow",
				"Normal",
				false ,
				100,
				2,
				1,
				"Electricity",
				"Fighting");
		setAttacks();
		this.setLevel(1);
		
	}
	public void setAttacks()
	{

		String[] energies1 = {"C"};
		 attack1= new Attack("Peck",1,energies1,30,"");
		 
		 String[] energies2 = {"C","C","C","C"};
		 attack2= new Attack("Drill Run",4,energies2,70,"Flip a coin. If heads, discard an Energy attached to your opponent's Active Pokémon.");
	}
	public Attack getAttack1(){
		return attack1;
	}
	public Attack getAttack2() {
		return attack2;
	}
}
