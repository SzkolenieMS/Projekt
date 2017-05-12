package pl.scadademy.sort;

import static org.junit.Assert.*;
import org.junit.Test;
import pl.sdacademy.sort.ISortAlgorithm;

public class ISortAlgorithmTest {
	ISortAlgorithm sortAlgorithm = new SortAlgorithm();

	@Test
	public void shouldSortArrayAscendingByDefault() {
		int array[] = { 1, 2, 3, 4 };
		int arrayWrong[] = { 1, 2, 4, 3 };

		sortAlgorithm.sort(arrayWrong);
		boolean tablesAreEqual = areTablesEquals(array, arrayWrong);

		assertTrue(tablesAreEqual);
	}

	@Test
	public void shouldSortArrayDependingOnTheOrder() {

		int arrayCorrect[] = { 4, 3, 2, 1 };
		int arrayWrong[] = { 1, 2, 4, 3 };
		sortAlgorithm.sort(arrayWrong, false);
		boolean tablesAreEqual = areTablesEquals(arrayCorrect, arrayWrong);

		assertTrue(tablesAreEqual);
		// assertFalse(tablesAreEqual);

	}

	@Test
	public void shouldLeaveSortedArrayUnchanged() {

		int arrayDescCorrect[] = { 4, 3, 2, 1 };
		int arrayAscCorrect[] = { 1, 2, 3, 4 };
		int arrayWrong[] = { 1, 4, 2, 3 };
		int arraySecondWrong[] = { 1, 4, 2, 3 };
		sortAlgorithm.sort(arrayWrong, false);
		sortAlgorithm.sort(arraySecondWrong, true);
		boolean tablesAreEqual = areTablesEquals(arrayDescCorrect, arrayWrong);
		boolean tablesAreEqual2 = areTablesEquals(arrayAscCorrect, arraySecondWrong);

		assertTrue(tablesAreEqual);
		assertTrue(tablesAreEqual2);
	}

	@Test(expected = NullPointerException.class)
	public void shouldThrowExceptionIfArrayIsNull() {
		int arrayCorrect[] = null;
		sortAlgorithm.sort(arrayCorrect);

	}

	@Test
	public void shouldNotThrowIfArrayIsZeroSize() {

		int[] arrayCorrect = new int[0];
		assertTrue(arrayCorrect.length == 0);
	}

	@Test
	public void shouldSortIfElementAreNotUniqe() {
		int array[] = { 1, 2, 3, 1 };
		int arrayWrong[] = { 1, 1, 2, 3 };

		sortAlgorithm.sort(array);
		// boolean tablesAreEqual = true;
		// boolean isUniqe = true;
		//
		// for (int i = arrayWrong.length - 1; i > 0; i--) {
		// for (int j = 1; j < i; j++) {
		// if (arrayWrong[i] != arrayWrong[j]) {
		// isUniqe = false;
		// break;
		// }
		// }
		// }
		//
		// if (isUniqe) {
		// for (int i = 0; i < arrayWrong.length; i++) {
		// if (arrayWrong[i] != array[i]) {
		// tablesAreEqual = false;
		// break;
		// }
		// }
		// } else {
		// for (int i = 0; i < arrayWrong.length; i++) {
		// if (arrayWrong[i] != array[i]) {
		// tablesAreEqual = true;
		// break;
		// }
		// }
		// }
		assertTrue(areTablesEquals(array, arrayWrong));
	}

	private boolean areTablesEquals(int[] soruceArray, int[] arrayWrong) {
		boolean tablesAreEqual = true;
		for (int i = 0; i < arrayWrong.length; i++) {
			if (arrayWrong[i] != soruceArray[i]) {
				tablesAreEqual = false;
				break;
			}
		}
		return tablesAreEqual;
	}

}
