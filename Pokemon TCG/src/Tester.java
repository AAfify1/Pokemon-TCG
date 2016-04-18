
public class Tester {
	public static void main(String [] args)
	{
		Pikachu pika= new Pikachu();
		Articuno arti = new Articuno();
		Energy elec1 = new Energy("E");
		Energy water = new Energy("W");
		Energy Colorless = new Energy("C");
		Colorless.attach(arti);
		Colorless.attach(arti);
		Colorless.attach(arti);
		Colorless.attach(arti);
		Colorless.attach(arti);
		water.attach(arti);
		water.attach(arti);
		elec1.attach(pika);
		pika.getAttack1().Fight(pika, arti);
		pika.getAttack1().Fight(pika, arti);
		pika.getAttack1().Fight(pika, arti);
		arti.getAttack().Fight(arti, pika);
		System.out.println(pika.getDead());
		System.out.println(arti.getHP());
		
	}
}
