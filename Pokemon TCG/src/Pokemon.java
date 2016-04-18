
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

}
