package pl.sdacademy.search;



public class SearchAlgorithm implements ISearchAlgorithm{

	@Override
	public int search(int[] array, int value) {
		int foundI = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				foundI = i;
				break;
			}
		}
		return foundI;
	}

	@Override
	public void search(int[] array) {
		// TODO Auto-generated method stub
		
	}

}
