package mvc;

public class Amodel {
	
	public Amodel(){}
	
	public Float storeChange(Float change)
	{
		//this is code
		change = Acontrol.dollar(change);
		change += 2;
		return change;
	}	
}
