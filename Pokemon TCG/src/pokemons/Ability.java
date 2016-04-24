package pokemons;

public class Ability {

	private int inDmgRed =0 ;
	private Boolean whenAttacked;
	private Boolean whenAttacking;
	private String name;
	private String type;
	
	Ability(String name,String type,Boolean whenAttacked, Boolean whenAttacking)
	{
		this.whenAttacked = whenAttacked;
		this.whenAttacking = whenAttacking;
		this.name = name;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public int getInDmgRed() {
		return inDmgRed;
	}

	

	public Boolean getWhenAttacked() {
		return whenAttacked;
	}

	public Boolean getWhenAttacking() {
		return whenAttacking;
	}

	public void setInDmgRed(int inDmgRed) {
		this.inDmgRed = inDmgRed;
		
		
	}

	
}
