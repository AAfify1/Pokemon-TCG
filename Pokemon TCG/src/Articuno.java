
public class Articuno extends Pokemon{
	
	private Attack attack;

	public Articuno()
	{
		super("Articuno",
				"Water",
				false ,
				120,
				2,
				1,
				"Metal",
				"Fighting");
		setAttacks();
	}

public void setAttacks()
{

	
	 attack= new Attack("Freezing Wind","W,W,C,C",100," ");

}

public String getAttack() {
	System.out.println(attack.getName());
	return attack.getName();
	
}


}
	

