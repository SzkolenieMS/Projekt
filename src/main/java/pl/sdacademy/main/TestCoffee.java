package pl.sdacademy.main;
import org.junit.Test;

import pl.sdacademy.model.Cat;

import static org.junit.Assert.*;
public class TestCoffee {

	public TestCoffee() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Test
	public void myFirstTest2(){
		
		Cat cat =new Cat("Kotek");
		
		String name = cat.getName();
		
		assertTrue(name.equals("Piesek"));
		

		
	}
	
	
	@Test
	public void myFirstTest(){
		
		Cat cat =new Cat("Kotek");
		
		String name = cat.getName();
		
		assertTrue(name.equals("Kotek"));

		
	}

}
