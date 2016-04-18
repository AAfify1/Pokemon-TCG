
public class Attack {

	private String name;
	private String[] energies;
	private int damage;
	private String effect;
	
	Attack(String name, String[] energies, int damage, String effect)
	{
		this.damage=damage;
		this.name=name;
		this.energies=energies;
		this.effect=effect;
	}
}
