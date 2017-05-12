package pl.sdacademy.utils;

import java.util.Random;

import pl.sdacademy.interfaces.ITableUtils;

public class TableUtils implements ITableUtils {
	/*
	 * Zamiana elementów w tablicy
	 * 
	 */
	public void changeElement(Object[] table, int i, int j) {
		if ((i >= table.length) || j >= table.length) {
			return;
		}
		Object tmp = table[i];
		table[i] = table[j];
		table[j] = tmp;

	}

	public void print(Object[] table) {
		for (Object element : table) {

			System.out.println(element);
		}
	}
	
	
	public int[] fillTableWithRandomNumbers(int lenght, int from, int to){
		if (from>=to){
			//zrzucenie wyjatku - przerywa dzialanie
			throw new IllegalArgumentException("Exception from>=to");
		}
		Random random = new Random();
		int[] table = new int[lenght];
		for (int i = 0; i < table.length; i++) {
			table[i]=random.nextInt(to-from)+from;
		}
		return table;
		
		
		
	}
}
