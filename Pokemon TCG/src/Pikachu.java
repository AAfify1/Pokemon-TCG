
public class Pikachu extends Pokemon {
	
	private Attack attack1;
	private Attack attack2;
	
	public Pikachu()
	{
		super("Pikachu",
				"Electricity",
				false,
				60,
				2,
				1,
				"Fighting",
				"");
		setAttacks();
	}
	
	public void setAttacks()
	{

		String[] energies1 = {"E"};
		String[] energies2 = {"C","C"};
		 attack1= new Attack("ThunderShock",1,energies1,10," ");
		 attack2= new Attack("TailWhip",2,energies2,20," ");

	}

	public Attack getAttack1() {
		return attack1;
	}

	public Attack getAttack2() {
		return attack2;
	}
	

}
