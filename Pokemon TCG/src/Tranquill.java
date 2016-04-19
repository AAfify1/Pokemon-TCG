
public class Tranquill extends Pokemon {
	
	private Attack attack1;
	public Tranquill()
	{
		super("Tranquill",
				"Normal",
				false ,
				80,
				1,
				1,
				"Electricity",
				"Fighting");
		setAttacks();
		
	}
	public void setAttacks()
	{

		String[] energies1 = {"C","C"};
		 attack1= new Attack("Fly",2,energies1,40,"Flip a coin. If tails, this attack does nothing. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent's next turn.");
	}
	public Attack getAttack1(){
		return attack1;
	}

}
