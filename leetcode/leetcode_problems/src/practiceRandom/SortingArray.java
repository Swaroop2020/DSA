package practiceRandom;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {
	
	public static void main(String[] args) {
		int[] array = {4,1,5,3,2};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		Integer[] arr = Arrays.stream(array).boxed().toArray(Integer[]::new);
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(array);
	}

}
