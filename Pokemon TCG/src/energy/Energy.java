package energy;
import main.Card;
import pokemons.Pokemon;

public class Energy extends Card {

	private String name;
	private String shortName;
	
	public Energy(String name,String shortName) {
		super(name, "Energy");
		this.name = name;
		this.setShortName(shortName);
	
		
	}
	
	public void attach(Pokemon target)
	{
		target.setEnergies(shortName);
	}
	public void detach(Pokemon target)
	{
		target.removeEnergy(shortName);
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}
