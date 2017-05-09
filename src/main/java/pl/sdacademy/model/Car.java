package pl.sdacademy.model;

import pl.sdacademy.enums.BodyType;
import pl.sdacademy.interfaces.IAction;
import pl.sdacademy.interfaces.ICar;

public class Car extends Vehicle implements ICar, IAction {

	BodyType bodyType;

	public Car() {
		super("benzin", 4, 2000.5); // wykonanie konstruktora klasy nadrzednej
	}

	public Car(BodyType bodyType) {
		this();
		setBodyType(bodyType);

	}

	public Car(BodyType bodyType, double weight) {
		this(bodyType);
		setWeight(weight);
	}

	public BodyType getBodyType() {
		return bodyType;
	}

	public void setBodyType(BodyType bodyType) {
		this.bodyType = bodyType;
	}

	public void refuel() {
		// TODO Auto-generated method stub

	}

	public void openDoor() {
		System.out.println("Otwieram drzwi w samochodzie");

	}

	public void startEngine() {
		// TODO Auto-generated method stub

	}

	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void run() {
		System.out.println("Uruchamiam samochod i jazda");

	}

}
