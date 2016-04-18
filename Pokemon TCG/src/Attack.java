
public class Attack {

	private String name;
	private String energies;
	private int damage;
	private String effect;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEnergies() {
		return energies;
	}



	public void setEnergies(String energies) {
		this.energies = energies;
	}



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;
	}



	public String getEffect() {
		return effect;
	}



	public void setEffect(String effect) {
		this.effect = effect;
	}



	public Attack(String name, String energies, int damage, String effect) {
		this.damage=damage;
		this.name=name;
		this.energies=energies;
		this.effect=effect;
	}
}
