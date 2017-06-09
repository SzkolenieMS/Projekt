package pl.sdacademy.stack;

import static org.junit.Assert.*;


import org.junit.*;

import pl.sdacademy.stack.IList;
import pl.sdacademy.stack.Laptop;

public class ListTest {

	IList<Laptop> emptyList;
	IList<Laptop> threeElementsList;
	boolean result;
	Laptop firstElement;
	Laptop secondElement;
	Laptop thirdElement;

	@Before
	public void setUp() {
		result = false;
		emptyList =  new List<>();
		threeElementsList =  new List<>();
		firstElement = new Laptop("Test");
		secondElement = new Laptop("Second");
		thirdElement = new Laptop("Third");
		threeElementsList.add(firstElement);
		threeElementsList.add(secondElement);
		threeElementsList.add(thirdElement);

	}

	@Test
	public void shouldAddElementIfListIsEmpty() {
		boolean checkIfEmpty = emptyList.isEmpty();
		if (checkIfEmpty) {
			emptyList.add(firstElement);
			if (emptyList.getFirst().equals(firstElement)) {
				result = true;
			}
		}

		assertTrue(result);

	}

	@Test
	public void shouldGetFirstElementOfNonEmptyList() {
		boolean checkIfEmpty = threeElementsList.isEmpty();
		if (!checkIfEmpty) {
			if (threeElementsList.getFirst().equals(firstElement)) {
				result = true;
			}
		}

		assertTrue(result);

	}

	@Test
	public void shouldGetLastElementOfNonEmptyList() {
		boolean checkIfEmpty = threeElementsList.isEmpty();
		if (!checkIfEmpty) {
			if (threeElementsList.getLast().equals(thirdElement)) {
				result = true;
			}
		}
		assertTrue(result);
	}

	@Test
	public void shouldReturnNullFfThereAreNoElements() {
		boolean checkIfEmpty = emptyList.isEmpty();
		if (checkIfEmpty) {
				result = true;
		}
		assertTrue(result);
	}

	@Test
	public void shouldGetSpecificElementFromTheList() {
		if (threeElementsList.get(1).equals(secondElement)) {
			result = true;
		}
		assertTrue(result);
	}

	@Test
	public void shouldRemoveElementFromNonEmptyList() {
		threeElementsList.remove(2);
		if (threeElementsList.getLast().equals(secondElement)) {
			result = true;
		}
		assertTrue(result);
	}

	@Test
	public void shouldThrowExceptionIfGetCalledOnEmptyList() {
		try {
			emptyList.get(0);
		} catch (Exception e) {
			result = true;
		}
		assertTrue(result);

	}

	@Test
	public void shouldThrowExceptionIfRemoveCalledOnEmptyList() {
		try {
			emptyList.remove(0);
		} catch (Exception e) {
			result = true;
		}
		assertTrue(result);

	}

}
