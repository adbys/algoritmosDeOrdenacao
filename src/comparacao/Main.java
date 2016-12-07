package comparacao;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		int[] array = new int[]{5,9,8,7,1,2,3,5};
		//BubbleSort ordena = new BubbleSort();
		//SelectionSort ordena = new SelectionSort();
		//InsertionSort ordena = new InsertionSort();
		CountingSort ordena = new CountingSort();
		ordena.sort(array);
		System.out.println(Arrays.toString(array));
		
	}

}
