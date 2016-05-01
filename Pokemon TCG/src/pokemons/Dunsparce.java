package pokemons;
public class Dunsparce extends Pokemon{
	
	
	public Dunsparce()
	{
		super("Dunsparce",
				"Normal",
				false ,
				60,
				2,
				1,
				"Fighting",
				"");
		setAttacks();
		
	}
	public void setAttacks()
	{

		String[] energies1 = {"C"};
		 attack1= new Attack("Burrow",1,energies1,0,"Discard the top card of your opponent's deck.");
		 
		 
		 attack2= new Attack("Rollout",1,energies1,20,"");
		 
	}
	public Attack getAttack1(){
		return attack1;
	}

}
