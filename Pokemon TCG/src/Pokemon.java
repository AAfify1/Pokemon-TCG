
public class Pokemon extends Card {

	private String name;			
	private String type;
	private Boolean isEX;
	private int HP;
	private int noOfAttacks;
	private int retreatCost;
	private String weakness;
	private String resistance;	
	
	
	Pokemon(String name,			
			String type,
			Boolean isEX,
			int HP,
			int noOfAttacks,
			int retreatCost,
			String weakness,
			String resistance
			)
	{
		super(name, "Pokemon");
		this.HP=HP;
		this.isEX=isEX;
		this.name = name;
		this.noOfAttacks = noOfAttacks;
		this.resistance = resistance;
		this.retreatCost = retreatCost;
		this.type = type;
		this.weakness = weakness;
		
	}
	public int getNoOfAttacks()
	{
		return noOfAttacks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getIsEX() {
		return isEX;
	}
	public void setIsEX(Boolean isEX) {
		this.isEX = isEX;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getRetreatCost() {
		return retreatCost;
	}
	public void setRetreatCost(int retreatCost) {
		this.retreatCost = retreatCost;
	}
	public String getWeakness() {
		return weakness;
	}
	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}
	public String getResistance() {
		return resistance;
	}
	public void setResistance(String resistance) {
		this.resistance = resistance;
	}
	public void setNoOfAttacks(int noOfAttacks) {
		this.noOfAttacks = noOfAttacks;
	}
}
