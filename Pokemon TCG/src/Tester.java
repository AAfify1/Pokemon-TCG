import gui.GUI;
import listeners.HandListener;

public class Tester {
	public static void main(String [] args)
	{
		
		GUI gui = new GUI();
		GUI.main(null);
		HandListener lis1 = new HandListener(gui);
		
	}
}
