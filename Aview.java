package mvc;
import java.util.Scanner;

public class Aview {
	private Acontrol Acontroller;
	public Aview()
	{
		Acontroller = new Acontrol(this);
	}
	private void display()
	{
		Float dollars;
		dollars = Aview.ask();
		Acontroller.updateView(dollars);
	}
	public static void main(String[] args) {

		Aview aView = new Aview();
		aView.display();       
	}
	public static Float ask()
	{
		Scanner read = new Scanner(System.in);
		System.out.println("How many dollars will you give me? ");
		Float dollars;
		return dollars = read.nextFloat();
	}
}
