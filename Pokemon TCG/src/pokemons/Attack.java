package pokemons;

public class Attack {

	private String name;
	private String[] energies;
	private int damage;
	private String effect;
	private int count;
	private Boolean canAttack=false;
	
	
	public Attack(String name,int count, String[] energies, int damage, String effect) {
		this.damage=damage;
		this.name=name;
		this.energies=energies;
		this.effect=effect;
		this.count=count;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String[] getEnergies() {
		return energies;
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

	public void canAttack(Pokemon me){
		
		
		int checker=0;
		
		String[] pokEn = me.getEnergies();
		String[] temp = new String[pokEn.length];
		System.arraycopy( pokEn, 0, temp, 0, pokEn.length );
		String[] attEn = this.getEnergies();
		
		for(int i=0;i<this.count;i++)
		{
			String x = attEn[i];
			if (x.equals("C")){
				for(int j=0;j<me.getCount();j++)
				{
					if(!temp[j].equals(""))
					{
						checker++;
						temp[j] = "";
						break;
					}
				}
				
			}
			else {
				for(int j=0;j<me.getCount();j++)
			
			{
				if(x.equals(temp[j]))
				{
					temp[j]="";
					checker++;
					break;
				}
			}
			}
		}
		if (checker==this.count){
			canAttack= true;
		}
		else canAttack= false;
		
	}
	public void Fight(Pokemon me,Pokemon target)
	{
		int newDamage=this.damage;
		canAttack(me);
		if(canAttack)
		{
			if(me.getType().equals(target.getWeakness()))
			{
				newDamage=this.damage*2;
			}
			 if(me.getType().equals(target.getResistance()))
			{
				newDamage=this.damage-20;
			}
			if(target.getHasAbility())
			{
				Ability a = target.getAbility();
				String type = a.getType();
				if(a.getWhenAttacked()&&type.equals("inDmgRed"))
				{
					newDamage = damage - a.getInDmgRed();
				}
			}
			int newHP = target.getHP()-newDamage;
			if(newHP>0)
			{
				target.setHP(newHP);
			}
			else
				{
				target.setDead(true);
				target.setHP(0);
				}
		}
	}
}

