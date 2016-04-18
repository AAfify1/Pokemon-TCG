
public class Tester {
	public static void main(String [] args)
	{
		Pikachu pika= new Pikachu();
		Articuno arti = new Articuno();
		Energy elec1 = new Energy("E");
		Energy water = new Energy("W");
		water.attach(arti);
		water.attach(arti);
		water.attach(arti);
		water.attach(arti);
		water.detach(arti);
		water.detach(pika);
		water.attach(arti);
		elec1.attach(pika);
		pika.getAttack1().Fight(pika, arti);
		pika.getAttack1().Fight(pika, arti);
		pika.getAttack1().Fight(pika, arti);
		arti.getAttack().Fight(arti, pika);
		System.out.println(pika.getHP());
		System.out.println(arti.getHP());
		
	}
}
