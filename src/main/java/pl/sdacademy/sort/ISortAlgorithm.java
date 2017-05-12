package pl.sdacademy.sort;

public interface ISortAlgorithm {

	default int[] sort(int[] array){
		sort(array,true);
		return array;
	};
	
	int[] sort(int[] array, boolean ascending);
	
	public int [] showSortTime(int[] array, boolean ascening);
	public int [] showSortTime(int[] array);
	
	
	
}
