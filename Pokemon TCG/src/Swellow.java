
public class Swellow extends Pokemon {

	private Attack attack1;
	private Attack attack2;
	
	public Swellow()
	{
		super("Swellow",
				"Normal",
				false ,
				90,
				2,
				1,
				"Electricity",
				"Fighting");
		setAttacks();
		this.setLevel(1);
		
	}
	/* Ancient trait: If your opponent's Pokémon is Knocked Out by damage from an attack of this Pokémon, take 1 more Prize card.*/
	public void setAttacks()
	{

		String[] energies1 = {"C","C"};
		 attack1= new Attack("Peck",2,energies1,30,"");
		 
		 String[] energies2 = {"C","C","C"};
		 attack2= new Attack("Wing Attack",3,energies2,50,"");
		 
	}
	public Attack getAttack2() {
		return attack2;
	}
	public Attack getAttack1(){
		return attack1;
	}
}
