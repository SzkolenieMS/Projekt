package pl.sdacademy.search;

import static org.junit.Assert.*;

import java.util.function.Predicate;

import org.junit.*;

import pl.sdacademy.search.ISearchAlgorithm;
import pl.sdacademy.search.IGenericSearchAlgorithm;
import pl.sdacademy.utils.TableUtils;

public class ISearchAlgorithmTest {
	ISearchAlgorithm searchAlgorithm = new SearchAlgorithm();
	IGenericSearchAlgorithm<Integer> genericSearchAlgorithm = new GenericSearchAlgorithm();
	Integer[] array;
	Integer[] sortedArray;
	TableUtils tableUtils;
	int value;
	int expectedPositionForArray;
	int expectedPositionForSortedArray;
	int notInTable;
	Integer[] emptyArray = new Integer[0];
	Integer[] nullArray = null;
	Predicate<Integer> conditionValue;
	Predicate<Integer> conditionNotInTable;
//	Predicate<Integer> conditionEmptyArray;

	@Before
	public void setUp() {
		array = new Integer[] { 5, 1, 4, 2, 3 };
		sortedArray = new Integer[] { 1, 2, 3, 4, 5 };
		value = 4;
		conditionValue = n -> n == value;
		conditionNotInTable = n -> n ==notInTable;
		expectedPositionForArray = 2;
		expectedPositionForSortedArray = 3;
		notInTable = 6;

	}

	@Test
	public void shouldFindElementInARandomArray() {

		// int position = searchAlgorithm.search(array, value);
		int position = genericSearchAlgorithm.search(array, conditionValue);
		assertTrue("Can't find " + value + " in table", position == expectedPositionForArray);
		
	}

	@Test
	public void shouldFindElementInSortedArray() {
//		int position = searchAlgorithm.search(sortedArray, value);
		int position = genericSearchAlgorithm.search(sortedArray, conditionValue);
		assertTrue("Can't find " + value + " in table", position == expectedPositionForSortedArray);

	}

	@Test
	public void shouldReturnInvalidIndexIfElementNotPresent() {
//		int position = searchAlgorithm.search(sortedArray, notInTable);
		int position = genericSearchAlgorithm.search(sortedArray, conditionNotInTable);
		assertTrue("It didn't returned Invalid Index", position < 0);
	}

	@Test
	public void shouldReturnInvalidIndexIfArrayLenghtIsZero() {
//		int position = searchAlgorithm.search(emptyArray, value);
		int position = genericSearchAlgorithm.search(emptyArray, conditionValue);
		assertTrue("It didn't returned Invalid Index", position < 0);
	}

	@Test
	public void shouldThrowIfArrayIsNull() {
		boolean exceptionOccurs = false;
		try {
			genericSearchAlgorithm.search(nullArray, conditionValue);
//			searchAlgorithm.search(nullArray, value);
		} catch (Exception e) {
			exceptionOccurs = true;
		}
		assertTrue("It doesn't throw exception", exceptionOccurs);
	}

}