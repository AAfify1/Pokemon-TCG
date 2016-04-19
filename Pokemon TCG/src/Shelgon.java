
public class Shelgon extends Pokemon{
	
	private Attack attack1;
	public Shelgon()
	{
		super("Shelgon",
				"Dragon",
				false ,
				80,
				1,
				3,
				"Fairy",
				"");
		this.setLevel(1);
		setAttacks();
		
	}
	/* Ability: Any damage done to this Pokémon by attacks is reduced by 10 (after applying Weakness and Resistance).
*/
	public void setAttacks()
	{

		String[] energies1 = {"F","W","C"};
		 attack1= new Attack("Rolling Tackle",3,energies1,60,"");
	}
	public Attack getAttack1(){
		return attack1;
	}
		 

}


