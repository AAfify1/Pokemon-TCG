
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
		
	}
	public void setAttacks()
	{

		String[] energies1 = {"C","C"};
		 attack1= new Attack("Peck",2,energies1,30,"");
		 
		 String[] energies2 = {"C","C","C"};
		 attack1= new Attack("Wing Attack",3,energies2,50,"");
		 
	}
	public Attack getAttack1(){
		return attack1;
	}
}
