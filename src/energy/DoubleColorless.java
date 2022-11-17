package energy;

import pokemons.Pokemon;

public class DoubleColorless extends Energy {

	public DoubleColorless() {
		super("Double Colorless","C");
		// TODO Auto-generated constructor stub
	}
	public void attach(Pokemon target)
	{
		target.setEnergies("C");
		target.setEnergies("C");
	}
	public void detach(Pokemon target)
	{
		target.removeEnergy("C");
		target.removeEnergy("C");
	}
}
