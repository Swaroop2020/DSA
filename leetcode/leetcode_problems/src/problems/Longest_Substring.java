package problems;

import java.util.HashMap;

//Longest Substring Without Repeating Characters

//Given a string s, find the length of the longest 
//substring
// without repeating characters.
//
// 
//
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.

public class Longest_Substring {

	public static void main(String[] args) {
		
		String str = "abcabcdebb";
		int result = lengthOfLongestSubstring(str);
		System.out.println(result);	
	}

	private static int lengthOfLongestSubstring(String str) {	
		int result = 0;
		int left =0;
		int right = 0;
		int[] arr = new int[128]; 
		
		while(right<str.length()) {
			char x = str.charAt(right);
			arr[x]++;
			while(arr[x]>1) {
				char y = str.charAt(left);
				arr[y]--;
				left++;
			}
			result = Math.max(result, right-left+1);
			right++;
		}
		
		return result;
	}
}
//
//
//### Detailed Explanation:
//
//1. **Initialization**:
//   - `int[] chars = new int[128];`: This array is used to store the count of each character within the current window. The size 128 is chosen to cover all ASCII characters.
//   - `int left = 0;`: This is the start pointer of the sliding window.
//   - `int right = 0;`: This is the end pointer of the sliding window.
//   - `int res = 0;`: This variable will store the result, which is the length of the longest substring without repeating characters.
//
//2. **Sliding Window Mechanism**:
//   - The `while` loop runs until the `right` pointer reaches the end of the string (`right < s.length()`).
//   - Inside the loop:
//     - `char r = s.charAt(right);`: The character at the `right` pointer is fetched.
//     - `chars[r]++;`: The count of this character is incremented in the `chars` array.
//     - The `while` loop inside checks if the count of the character at `right` (`chars[r]`) is greater than 1, indicating a repeating character:
//       - If so, it enters the loop, where it:
//         - Fetches the character at the `left` pointer (`char l = s.charAt(left);`).
//         - Decrements the count of this character in the `chars` array (`chars[l]--;`).
//         - Moves the `left` pointer to the right (`left++;`), effectively shrinking the window from the left until there are no more repeating characters.
//     - After exiting the inner `while` loop, the current window size (`right - left + 1`) is calculated and `res` is updated to be the maximum of its current value and this window size.
//     - The `right` pointer is then incremented to expand the window from the right.
//
//3. **Return Result**:
//   - After the loop completes, the method returns the value of `res`, which is the length of the longest substring without repeating characters found during the traversal.
//
//4. **Main Method**:
//   - The `main` method creates an instance of the `Main` class.
//   - It defines a string `s` with the value `"Hello"`.
//   - It calls the `lengthOfLongestSubstring` method on this string and prints the result.
//
//### Example Execution:
//
//For the string "Hello":
//- Initially, `left` and `right` are both 0, and `res` is 0.
//- As the `right` pointer moves through the string:
//  - When `right` is 0, 'H' is added, `chars['H']` becomes 1, `res` is updated to 1.
//  - When `right` is 1, 'e' is added, `chars['e']` becomes 1, `res` is updated to 2.
//  - When `right` is 2, 'l' is added, `chars['l']` becomes 1, `res` is updated to 3.
//  - When `right` is 3, another 'l' is added, `chars['l']` becomes 2, causing the inner `while` loop to execute:
//    - The `left` pointer moves to 1, removing 'H' from the window.
//    - The `left` pointer moves to 2, removing 'e' from the window.
//    - The `left` pointer moves to 3, removing the first 'l' from the window.
//  - `right` moves to 4, 'o' is added, `chars['o']` becomes 1, `res` is updated to 2.
//
//The longest substring without repeating characters in "Hello" is "Hel" or "ell", with a length of 3. However, since the code output is dependent on the logic implemented and the current characters in the substring being counted correctly, in this code the final result printed is the longest length encountered which is correct based on the inner logic handling overlapping correctly.
//
//


