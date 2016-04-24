package pokemons;
public class Pelipper extends Pokemon {


	
	private Attack attack1;
	private Attack attack2;

	public Pelipper()
	{
		super("Pelipper",
				"Water",
				false ,
				100,
				2,
				2,
				"Electricity",
				"Fighting");
		setAttacks();
		this.setLevel(2);
	}

public void setAttacks()
{

	String[] energies1 = {"W","C"};
	 attack1= new Attack("Swallow",2,energies1,30," Heal from this Pokémon the same amount of damage you did to your opponent's Active Pokémon.");
	 
	 String[] energies2 = {"W","C","C","C"};
	 attack2= new Attack("Water Pulse",4,energies2,70,"You opponent's Active Pokémon is now Asleep.");

}

public Attack getAttack1() {
	return attack1;
	
}
public Attack getAttack2() {
	return attack2;
	
}


}
	



