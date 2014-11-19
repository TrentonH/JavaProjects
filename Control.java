package mvc;

public class Control {
	private Model model;
	private View view;
	
	public Control(View view)
	{
		this.view = view;
		model = new Model();	
	}

	public void updateView()
	{
		view.temperature(model.getWeather());
	}

	public void setWeather(String weather) {
		model.setWeather(weather);
	}
}
