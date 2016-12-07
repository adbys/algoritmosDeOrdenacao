package comparacao;

public class BubbleSort <T extends Comparable<T>> {
	
	public void sort(T[] array) {
		
		for(int i = array.length-1; i >= 0; i--){
			for (int j = 0; j < i; j++) {
				if(array[j].compareTo(array[j+1]) > 0) {
					swap(array, j, j+1);
				}
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
