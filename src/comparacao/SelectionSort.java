package comparacao;

public class SelectionSort <T extends Comparable<T>> {
	
	public void sort(T[] array) {
		
		for (int i = array.length-1; i >= 0; i--) {
			int maiorIndex = 0;
			for (int j = 0; j <= i; j++) {
				if (array[j].compareTo(array[maiorIndex]) > 0) {
					maiorIndex = j;
				}
			}
			swap(array, maiorIndex, i);
		}
	}

	public static void swap(Object[] array, int i, int j) {
		if (array == null)
			throw new IllegalArgumentException();

		Object temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
