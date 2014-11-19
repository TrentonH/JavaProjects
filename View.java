package mvc;

public class View {

	private Control controller;
	
	public View()
	{
		controller = new Control(this);
	}
	private void go()
	{
		controller.setWeather("cold");
		controller.updateView();
		controller.setWeather("warm");
		controller.updateView();
	}

	public static void main(String[] args) {
		
		View view = new View();
		view.go();
	}

	public void temperature(String weather)
	{
		System.out.println("The weather is feels " + weather);
	}
}
