package pl.scadademy.sort;

import junit.runner.Sorter.Swapper;
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
		// currentTimeMillis() ;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		array = sort(array);
		long afterMilis = System.nanoTime() - millis;
		double afterSeconds = afterMilis / 1000000;
		;
		System.currentTimeMillis();
		System.out.println("Done in " + (afterSeconds) + " milis - " + afterMilis + " nanomilis");

		return array;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	private static void merge(int poczatek, int srodek, int koniec, int[] tab) {
		int[] t = new int[tab.length];
		int i, j, q;
		for (i = poczatek; i <= koniec; i++) {
			// System.out.println(i + " " + t.length + " " + tab.length);
			t[i] = tab[i]; // Skopiowanie danych do tablicy pomocniczej

		}

		i = poczatek;
		j = srodek + 1;
		q = poczatek; // Ustawienie wskaźników tablic
		while (i <= srodek && j <= koniec) { // Przenoszenie danych z
												// sortowaniem ze zbiorów
												// pomocniczych do tablicy
												// głównej
			if (t[i] < t[j])
				tab[q++] = t[i++];
			else
				tab[q++] = t[j++];
		}
		while (i <= srodek)
			tab[q++] = t[i++]; // Przeniesienie nie skopiowanych danych ze
								// zbioru pierwszego w przypadku, gdy drugi
								// zbiór się skończył
	}

	/* Procedura sortowania tab[pocz...kon] */
	public static void mergesort(int poczatek, int koniec, int[] tab) {
		int srodek;
		if (poczatek < koniec) {
			srodek = (poczatek + koniec) / 2;
			mergesort(poczatek, srodek, tab); // Dzielenie lewej części
			mergesort(srodek + 1, koniec, tab); // Dzielenie prawej części
			merge(poczatek, srodek, koniec, tab); // Łączenie części lewej i
													// prawej
		}
	}

	public static void polishFlag(int[] array, int n){
		int bialy = 0, czerwony = 1;
		int b=n,c=1;
		
		while (c<b){
			if (array[c]==czerwony){
				c++;
			} else {
				while(array[b]==bialy && c<b){
					b-=1;
				}
				if (c<b){
						swapTwoInts(c,b);
						b-=1;
				}
			}
		}
	}
		
		public static void swapTwoInts(int a, int b){
			int temp;
			temp = b;
			b = a;
			a = temp;
		}
		
		
		
		
		
		
		
		
	}

