package problems;

//https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75

//392. Is Subsequence
/*
Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 */
public class IsSubSequence {

	public static void main(String[] args) {
		boolean isSub = getSub("abcdef","abcdef");
		System.out.println(isSub);
		
	}

	private static boolean getSub(String s1, String s2) {
//		int len1 = 0;
//		int len2 = 0;
//		while(len1<s1.length() && len2<s2.length()) {
//			if(s1.charAt(len1)==s2.charAt(len2)) {
//				len2++;
//			}
//			len1++;
//		}
//		return len2==s2.length();
		
//		int len1 = 0;
//		int len2 = 0;
//		while(len1<s1.length() && len2<s2.length()) {
//			if(s1.charAt(len1)==s2.charAt(len2)) {
//				len2++;
//			}
//			len1++;
//		}
//		return len2==s2.length();
		if(s1.length()==s2.length()) {
			return s1.contentEquals(s2);
		}
		
		String min = s1.length()<s2.length()?s1:s2;
		String max = s1.length()>s2.length()?s1:s2;
		int j =0;
		for(int i =0;i<max.length();i++) {
			if(min.charAt(j)==max.charAt(i))
				j++;
		}
		return j==min.length();
		
	}
}
