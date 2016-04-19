
public class Pidove extends Pokemon {
	
	private Attack attack1;
	private Attack attack2;
	public Pidove()
	{
		super("Pidove",
				"Normal",
				false ,
				60,
				2,
				1,
				"Electricity",
				"Fighting");
		setAttacks();
		
	}
	public void setAttacks()
	{

		String[] energies1 = {"C"};
		 attack1= new Attack("Homing Pidove ",1,energies1,0,"Look at the top card of your deck. Then, you may shuffle your deck.");
		 
		 String[] energies2 = {"C","C"};
		 attack2= new Attack("Gust",2,energies2,20,"");
	}
	
	public Attack getAttack1(){
		return attack1;
	}
	public Attack getAttack2() {
		return attack2;
	}

}
