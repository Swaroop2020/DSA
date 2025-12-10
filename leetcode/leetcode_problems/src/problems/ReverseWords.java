package problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Reverse Words in a String

/*Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
*/
public class ReverseWords {

	public static void main(String[] args) {
			reverseStringWords("a good   example  of Life");
			
		}

	private static void reverseStringWords(String string) {
//		\\s+ is regex for multiple spaces
		String[] arr = string.trim().split("\s+");
		List<String> list = Arrays.asList(arr);
		Collections.reverse(list);
		String str = String.join(" ", list);
		System.out.println(str);
		
	}
}
