package comparacao;

public class QuickSort <T extends Comparable<T>> {
	
	public void sort(T[] array, int ini, int fim) {
		if (ini < fim) {
			int pivot = particiona(array, ini, fim);
			sort(array, ini, pivot-1);
			sort(array, pivot+1, fim);
		}
	}

	private int particiona(T[] array, int ini, int fim) {
		int pivot = ini;
		int i = ini;
		int j = fim;
		
		while (i < j) {
			while (array[i].compareTo(array[pivot]) <= 0) {
				i++;
			}
			
			while (array[j].compareTo(array[pivot]) > 0) {
				j--;
			}
			
			if(i < j) {
				swap(array, i, j);
			}
			
		}
		swap(array, pivot, j);
		
		return j;
	}
	
	public static void swap(Object[] array, int i, int j) {
		if (array == null)
			throw new IllegalArgumentException();

		Object temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}


}
