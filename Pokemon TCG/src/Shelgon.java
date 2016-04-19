
public class Shelgon extends Pokemon{
	
	private Attack attack1;
	private Ability ability = new Ability("exoskeleton","inDmgRed",true,false);
	public Shelgon()
	{
		super("Shelgon",
				"Dragon",
				false ,
				80,
				1,
				3,
				"Fairy",
				"",
				true);
		this.setLevel(1);
		setAttacks();
		setAbility();
		
	}
	/* Ability: Any damage done to this Pokémon by attacks is reduced by 10 (after applying Weakness and Resistance).
*/


	public void setAttacks()
	{

		String[] energies1 = {"Fr","W","C"};
		 attack1= new Attack("Rolling Tackle",3,energies1,60,"");
	}
	
	public Ability getAbility() {
		return ability;
	}



	public void setAbility()
	{
		
		ability.setInDmgRed(10);
		
	}
	public Attack getAttack1(){
		return attack1;
	}
		 

}


