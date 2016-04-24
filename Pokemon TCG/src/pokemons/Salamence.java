package pokemons;
public class Salamence extends Pokemon {
	private Attack attack1;
	private Attack attack2;
	private Attack attack3;
	public Salamence()
	{
		super("Salamence",
				"Dragon",
				false ,
				160,
				3,
				4,
				"Fairy",
				"");
		this.setLevel(2);
		setAttacks();
		
		
	}
	public void setAttacks()
	{

		String[] energies1 = {"F"};
		 attack1= new Attack("Shatter ",1,energies1,60,"Discard any Stadium card in play.");
		 
		 String[] energies2 = {"W","C","C"};
		 attack2= new Attack("Power Howl  ",3,energies2,0,"This attack does 20 damage times the number of cards in your opponent's hand.");
		 
		 String[] energies3 = {"F","F","W","C"};
		 attack3= new Attack("Steam Blast ",4,energies3,170,"Discard 3 Energy attached to this Pokémon.");
		 
		 
	}
	public Attack getAttack1(){
		return attack1;
	}
	public Attack getAttack2() {
		return attack2;
	}
	public Attack getAttack3() {
		return attack3;
	}
		 

}


