package comparacao;

public class InsertionSort <T extends Comparable<T>> {
	
	public void sort(T[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i;
			while (j > 0 && array[j].compareTo(array[j-1]) < 0) {
				swap(array, j, j-1);
				j--;
			}
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
