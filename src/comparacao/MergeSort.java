package comparacao;

import java.util.Arrays;

public class MergeSort <T extends Comparable<T>> {
	
	public void sort(T[] array, int ini, int fim) {
		if (ini < fim) {
			int meio = (fim + ini) / 2;
			sort(array, ini, meio);
			sort(array, meio+1, fim);
			merge(array, ini, fim, meio);
		}
	}

	private void merge(T[] array, int ini, int fim, int meio) {
		
		int i = ini;
		int k = ini;
		int j = meio+1;
		T[] helper = Arrays.copyOfRange(array, 0, array.length);
		
		while(i <= meio && j <= fim) {
			if (helper[i].compareTo(helper[j]) < 0) {
				array[k++] = helper[i++];
			} else {
				array[k++] = helper[j++];
			}
		}
		
		while(i <= meio) {
			array[k++] = helper[i++];
		}
		
		while(j <= fim) {
			array[k++] = helper[j++];
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
