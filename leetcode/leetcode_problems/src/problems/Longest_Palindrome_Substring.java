package problems;


 
public class Longest_Palindrome_Substring {
	
	public static void main(String[] args) {
		System.out.println(longestPalindrome("astitsd"));
	}
    public static int longestPalindrome(String s) {
    // Corner cases.
    if (s.length() <= 1) return s.length();

    int len = s.length(),  longestPalindromeLength = 1;
    // state[i][j] true if s[i, j] is palindrome.
    boolean[][] state = new boolean[len][len];

    // Base cases.
    for (int i = 0; i < len; i++) {
        state[i][i] = true; // dist = 0.
    }

    for (int i = len - 1; i >= 0; i--) {
        for (int dist = 1; dist < len - i; dist++) {
        int j = dist + i;
        System.out.println(i+"--"+j);
        state[i][j] = (dist == 1) ? s.charAt(i) == s.charAt(j) : (s.charAt(i) == s.charAt(j)) && state[i + 1][j - 1];
        if (state[i][j] && j - i + 1 > longestPalindromeLength) {
            longestPalindromeLength = j - i + 1;
         //   longestPalindromeStart = i;
        }
        }
    }

    return longestPalindromeLength;
    }
}