package pl.sdacademy.main;

import java.util.stream.Stream;

import pl.sdacademy.interfaces.IAction;
import pl.sdacademy.model.Bike;
import pl.sdacademy.model.Car;
import pl.sdacademy.model.Cat;
import pl.sdacademy.model.Dog;
import pl.sdacademy.model.OpelCar;
import pl.sdacademy.model.RenaultCar;
import pl.sdacademy.utils.TableUtils;

public class Main {

	public Main() {

	}

	public static void main(String[] args) {
		Car[] carTable = new Car[2];
		IAction[] iAction = new IAction[3];
		Bike marcinsRomet = new Bike();
		OpelCar adamsOpel = new OpelCar();
		RenaultCar maciejsRenault = new RenaultCar();
		iAction[0] = adamsOpel;
		iAction[1] = maciejsRenault;
		iAction[2] = marcinsRomet;

		TableUtils tableUtils = new TableUtils();
		Object[] table = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int i = 2;
		int j = 4;

		// tableUtils.print(table);
		// tableUtils.changeElement(table, i, j);
		//
		// tableUtils.print(table);

		int[] tables = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int tableSize = 10;
		int suma = 0;
		int[] tabler = new int[tableSize];
//		System.out.println(makeHunderdElement(tabler, suma));
//		print((tableUtils.fillTableWithRandomNumbers(10, 0, 5)));
		// runningSysouts(carTable, iAction, marcinsRomet, adamsOpel,
		// maciejsRenault);

		// voiceFromAnimals();
		Stream.of(tables).forEach(e->{
			System.out.println(e+",");
		});
		
		
		

	}

	private static int makeHunderdElemt(int tableSize) {
		int[] table = new int[tableSize];

		for (int i = 0; i < tableSize; i++)
			table[i] = i;
		print(table);

		for (int i = 1; i < table.length; i++) {
			if (i % 2 == 1)
				table[i] = table[i] + table[i - 1];
		}
		print(table);

		for (int i = 0; i < table.length; i++) {
			if (table[i] % 2 == 0)
				table[i] /= 2;
		}
		print(table);

		int suma = 0;
		for (int i = 0; i < table.length; i++)
			suma += table[i];
		return suma;

	}

	private static int makeHunderdElement(int[] table, int suma) {
		for (int z = 0; z < 4; z++) {for (int i = 0; i < table.length; i++) {
				if (z == 0)table[i] = i+1;
				if (z == 1)if (i % 2 == 1)table[i] = table[i] + table[i - 1];
				if (z == 2)if (table[i] % 2 == 0)table[i] /= 2;
				if (z == 3)suma += table[i];}}
		return suma;
	}

	public static void print(int[] table) {
		for (Object element : table) {
			System.out.print(element + ", ");
		}
		System.out.println();
	}
	// metoda ktora zamieni wartosciami komorki w tablicy

	private static void runningSysouts(Car[] carTable, IAction[] iAction, Bike marcinsRomet, OpelCar adamsOpel,
			RenaultCar maciejsRenault) {
		maciejsRenault.refuel();
		adamsOpel.refuel();
		maciejsRenault.run();
		marcinsRomet.run();
		carTable[0] = adamsOpel;
		carTable[1] = maciejsRenault;
		for (int i = 0; i < carTable.length; i++) {
			System.out.println(carTable[i].getInfo());
		}

		for (int i = 0; i < iAction.length; i++) {
			iAction[i].run();
		}
	}

	private static void voiceFromAnimals() {

		Object[] animalsTable = new Object[2];
		Dog dog = new Dog();
		Cat cat = new Cat();
		animalsTable[0] = dog;
		animalsTable[1] = cat;

		for (int i = 0; i < animalsTable.length; i++) {
			if (i == 0) {
				Dog animal1 = (Dog) animalsTable[0];
				animal1.voice();
			} else {
				Cat animal2 = (Cat) animalsTable[1];
				animal2.voice();
			}
		}
	}

}
