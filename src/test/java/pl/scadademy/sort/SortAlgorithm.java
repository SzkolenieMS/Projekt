package pl.scadademy.sort;

import pl.sdacademy.sort.ISortAlgorithm;

public class SortAlgorithm implements ISortAlgorithm {

	@Override
	public int[] sort(int[] tab, boolean ascending) {

		int zmiana = 1;
		while (zmiana > 0) {
			zmiana = 0;
			for (int i = 0; i < tab.length - 1; i++) {
				if (ascending) {
					zmiana = swapasc(tab, zmiana, i);
				} else {
					zmiana = swapdesc(tab, zmiana, i);
				}
			}
		}
		return tab;
	}

	private int swapasc(int[] tab, int zmiana, int i) {
		int temp;
		if (tab[i] > tab[i + 1]) {
			temp = tab[i + 1];
			tab[i + 1] = tab[i];
			tab[i] = temp;
			zmiana++;
		}
		return zmiana;
	}

	private int swapdesc(int[] tab, int zmiana, int i) {
		int temp;
		if (tab[i] < tab[i + 1]) {
			temp = tab[i + 1];
			tab[i + 1] = tab[i];
			tab[i] = temp;
			zmiana++;
		}
		return zmiana;
	}

	@Override
	public int[] showSortTime(int[] array) {
		array = this.showSortTime(array, true);
		return array;
	}

	@Override
	public int[] showSortTime(int[] array, boolean ascening) {
		long millis = System.nanoTime();
				//currentTimeMillis() ;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		array = sort(array);
		long aftermillis =System.nanoTime(); 
				;System.currentTimeMillis() ;
		System.out.println("Done in " + (aftermillis-millis) + " milis" + aftermillis + " " + millis);

		return array;
	}
}
