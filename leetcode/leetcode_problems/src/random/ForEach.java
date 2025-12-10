package random;

import java.util.Arrays;

public class ForEach {
	
	public static void main(String[] args) {
		int[] arr = {2,3,1,4,5};
		//for Each on streams;
		Arrays.stream(arr).forEach(a->System.out.println(a/2F));
		Arrays.asList(arr).forEach(a->System.out.print(a+" "));
	}

}
