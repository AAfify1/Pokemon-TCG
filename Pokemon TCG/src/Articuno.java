
public class Articuno extends Pokemon{
	
	private Attack attack1;

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

	String[] energies = {"W","W","C","C"};
	 attack1= new Attack("Freezing Wind",4,energies,100," ");

}

public Attack getAttack1() {
	return attack1;
	
}


}
	

