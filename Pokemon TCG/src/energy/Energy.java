package energy;
import main.Card;
import pokemons.Pokemon;

public class Energy extends Card {

	private String name;
	
	public Energy(String name) {
		super(name, "Energy");
		this.name = name;
	
		
	}
	
	public void attach(Pokemon target)
	{
		target.setEnergies(name);
	}
	public void detach(Pokemon target)
	{
		target.removeEnergy(name);
	}

}
