package pl.sdacademy.lambda.model;

public class Kanapka extends Jedzenie  {

	public Kanapka(String nazwa) {
		super(nazwa);
	}

	@Override
	public String toString() {
		return "Kanapka [nazwa=" + nazwa + ", skladniki=" + skladniki + "]";
	}

	


}
