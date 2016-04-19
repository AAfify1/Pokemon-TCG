
public class DoubleColorless extends Energy {

	DoubleColorless() {
		super("C");
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
