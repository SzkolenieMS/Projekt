package pl.sdacademy.main;

import pl.sdacademy.model.Bike;
import pl.sdacademy.model.Car;
import pl.sdacademy.model.OpelCar;
import pl.sdacademy.model.RenaultCar;

public class Main {

	public Main() {

	}

	public static void main(String[] args) {
		Car[] carTable = new Car[2];
		Bike marcinsRomet = new Bike();
		OpelCar adamsOpel = new OpelCar();
		RenaultCar maciejsRenault = new RenaultCar();
		maciejsRenault.refuel();
		adamsOpel.refuel();
		maciejsRenault.run();
		marcinsRomet.run();
		carTable[0] = adamsOpel;
		carTable[1] = maciejsRenault;
		for (int i = 0; i < carTable.length; i++) {
			System.out.println(carTable[i].getInfo());

		}
	}

}
