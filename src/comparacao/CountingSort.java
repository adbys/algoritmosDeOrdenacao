package comparacao;

import java.util.Arrays;

public class CountingSort  {
	
	public void sort(int[] array) {
		int maior = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[maior] < array[i]) {
				maior = i;
			}
		}
		
		int[] cumulate = new int[array[maior]];
		
		for (int i = 0; i < array.length; i++) {
			cumulate[array[i]-1]++;
		}
		

		for (int i = 1; i < cumulate.length; i++) {
			cumulate[i] += cumulate[i-1];
		}
		
		int[] ordenado = new int[array.length];
		
		for(int i = array.length-1; i >= 0; i--) {
			ordenado[cumulate[array[i]-1]-1] = array[i];
			cumulate[array[i]-1]--;
		}
		
		System.out.println("ordenado: " + Arrays.toString(ordenado));
		
	}

}
