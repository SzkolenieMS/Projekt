package pl.sdacademy.pin;

import static org.junit.Assert.*;

import org.junit.*;
public class IPersonalIdentifyNumberTest {

	String malePin;
	String femalePin;
	String wrongPin;
	String male;
	String female;
	boolean validPin;
	IPersonalIdentifyNumber personalIdentifyNumber = new PersonalIdentifyNumber();
	
	
	@Before
	public void setUp(){
		 malePin = "91033108638";
		 femalePin = "91033108648";
		 male = "Mezczyzna";
		 female = "Kobieta";
		 wrongPin = "91033310864";
		
	}
	
	@Test
	public void shouldAllowCorrectLengthOfPin(){
		assertTrue(personalIdentifyNumber.validate(malePin, male));
	}
	
	@Test
	public void shouldCheckIfPinIsMale(){
		assertTrue(personalIdentifyNumber.validate(malePin, male));
	}
	
	@Test
	public void shouldCheckIfPinIsFemale(){
		assertTrue(personalIdentifyNumber.validate(femalePin, female));
	}
	
	@Test
	public void shouldCheckCheckSum(){
		assertFalse(personalIdentifyNumber.validate(wrongPin, female));
	}
	
	
}
