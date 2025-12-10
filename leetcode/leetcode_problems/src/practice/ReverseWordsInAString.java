package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		String reversed = reverseWords("Blue is    a color");
		System.out.println(reversed);
	}

	private static String reverseWords(String string) {
		String[] array = string.trim().split("\s+");
		List<String> list = Arrays.asList(array);
		Collections.reverse(list);
		
		return String.join(" ", list);
	}
}
