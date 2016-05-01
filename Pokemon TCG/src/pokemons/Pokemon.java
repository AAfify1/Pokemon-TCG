package pokemons;
import main.Card;

public class Pokemon extends Card {

	private String name;			
	private String type;
	private Boolean isEX;
	private int HP;
	private int noOfAttacks;
	private int retreatCost;
	private String weakness;
	private String resistance;
	private String[] energies=new String[20];
	private int count=0;
	private Boolean dead= false;
	private int level = 0;
	private Boolean hasAbility=false;;
	protected Attack attack1;
	protected Attack attack2;
	protected Attack attack3;
	
	
	public Attack getAttack1() {
		return attack1;
	}
	public Attack getAttack2() {
		return attack2;
	}
	public Attack getAttack3() {
		return attack3;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Boolean getDead() {
		return dead;
	}
	public void setDead(Boolean dead) {
		this.dead = dead;
	}
	public Pokemon(String name,			
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
	public Pokemon(String name,			
			String type,
			Boolean isEX,
			int HP,
			int noOfAttacks,
			int retreatCost,
			String weakness,
			String resistance,
			Boolean hasAbility
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
		this.hasAbility= hasAbility;
		
	}
	
	public Pokemon(String name)
	{
		super(name,"Pokemon");
		this.name=name;
	}
	public Boolean getHasAbility() {
		return hasAbility;
	}
	public String[] getEnergies() {
		return energies;
	}
	public void removeEnergy(String energy)
	{
		for(int i=0; i<count; i++)
		{
			if(energies[i].equals(energy))
			{
				energies[i] = "";
				count--;
			}
		}
	}
	public void setEnergies(String energy) {
		
		energies[count]= energy;
		count++;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
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
	
	public void setAttacks()
	{

	

	}
	public Ability getAbility()
	{
		return null;

	

	}
}
