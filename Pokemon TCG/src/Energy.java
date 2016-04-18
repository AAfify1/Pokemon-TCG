
public class Energy extends Card {

	private String name;
	
	Energy(String name) {
		super(name, "Energy");
		this.name = name;
	
		
	}
	
	public void attach(Pokemon target)
	{
		target.setEnergies(name);
	}
	

}
