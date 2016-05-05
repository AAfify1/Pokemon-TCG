package pokemons;

import java.util.ArrayList;

public class Attack {

	private String name;
	private ArrayList<String> energies;
	private int damage;
	private String effect;
	private int count;
	private Boolean canAttack=false;
	
	
	public Attack(String name,int count, ArrayList<String> energies, int damage, String effect) {
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



	public ArrayList<String> getEnergies() {
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

	public Boolean canAttack(Pokemon me){
		
		
		int checker=0;
		
		ArrayList<String> pokEn = me.getEnergies();
		ArrayList<String> temp = new ArrayList<String>(pokEn);
		
		ArrayList<String> attEn = this.getEnergies();
		
		for(int i=0;i<this.count;i++)
		{
			String x = attEn.get(i);
			if (x.equals("C")){
				for(int j=0;j<me.getCount();j++)
				{
					if(!temp.get(j).equals(""))
					{
						checker++;
						temp.set(j,"");
						break;
					}
				}
				
			}
			else {
				for(int j=0;j<me.getCount();j++)
			
			{
				if(x.equals(temp.get(j)))
				{
					temp.set(j,"");
					checker++;
					break;
				}
			}
			}
		}
		if (checker==this.count){
			canAttack= true;
			return canAttack;
		}
		else canAttack= false;
		return canAttack;
		
	}
	public void Fight(Pokemon me,Pokemon target)
	{
		int newDamage=this.damage;
		
		if(canAttack(me))
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

