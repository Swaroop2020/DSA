package problems;
 //Merge Strings Alternately

//Input: word1 = "ab", word2 = "pqrs"
//Output: "apbqrs"
//Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//word1:  a   b 
//word2:    p   q   r   s
//merged: a p b q   r   s



public class MergeStringsAlternately {
	
	public static void main(String[] args) {
		mergeStrings("Java","Python");
		
	}

	private static void mergeStrings(String string1, String string2) {
		final int min = Math.min(string1.length(), string2.length());
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<min;i++) {
			sb.append(string1.charAt(i)).append(string2.charAt(i));
		}
		
		sb.append(string1.substring(min)).append(string2.substring(min));
		System.out.println(sb);
	}

}
