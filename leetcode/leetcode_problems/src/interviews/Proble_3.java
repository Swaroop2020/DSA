package interviews;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// input: Welcome to valuelabs

//output : emoclew ot 

public class Proble_3 {
	
	public static void main(String[] args) {
		String input = "Welcome to valuelabs";
		
		String res = reverse(input);
		//System.out.println(res);
		
	}

	private static String reverse(String input) {
		
	//	String input1 = input.trim();
		
		String[] arr = input.split("//s");
		for(String str : arr) {
			System.out.print(str+" ");
			System.out.println();
		}
		System.out.println("------------------------------");
		
		String[] result = new String[arr.length];
		int k=0;
		for(String str : arr) {
			StringBuilder sb = new StringBuilder();
			for(int i=str.length()-1;i>=0;i--) {
				sb.append(str.charAt(i));
			}
			result[k]=sb.toString();
			k++;
		}
		
		List<String> list = Arrays.asList(result);
		System.out.println("before :"+list);
		
		Collections.reverse(list);
		System.out.println("After :"+list);
		
		return String.join(" ", Arrays.asList(result));
		//return " ";

	}

}
