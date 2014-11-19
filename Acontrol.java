package mvc;

public class Acontrol {

	private Aview Aview;
	private Amodel Amodel;

	public Acontrol(Aview theView) {
		this.Aview = Aview;
		Amodel = new Amodel();
	}	
	public static Float dollar(Float dollar)
	{
		return dollar;
	}
	public void updateView(float dollars)
	{	
		dollars = Amodel.storeChange(dollars);
		System.out.println("Your change is " + dollars +" Dollars.");	
	}
}
