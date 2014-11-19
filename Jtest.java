package mvc;

import static org.junit.Assert.*;

import org.junit.*;

import pattern.ProEagerSingleton;
import collections.Sets;


public class Jtest {

	@Test
	public void tasteFood(){
		final double epsilon = 0.0;
		
		Model model = new Model();
		assertEquals(null,model.getWeather());
		
		model.setWeather("warm");
		assertEquals("warm",model.getWeather());
		
		model.setWeather(null);
		//assertEquals(,model.getWeather());
	}
}
